package servlet;

import biz.UserBiz;
import biz.bizimpl.UserBizImpl;
import entity.Clas;
import entity.Student;
import entity.Teacher;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@WebServlet(name = "LoginServlet", urlPatterns = {"/loginServlet"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");
        UserBiz userBiz = new UserBizImpl();
        User user = userBiz.loginVerify(name, password);
        if (user != null) {
            Student student = user.getStudent();
            if (student == null) {
                Teacher teacher = user.getTeacher();
                Collection<Clas> clases = teacher.getClases();
                session.setAttribute("teacher", teacher);
                session.setAttribute("clases", clases);
                request.getRequestDispatcher("teacher_index.jsp").forward(request, response);
            } else {
                session.setAttribute("student", student);
                request.getRequestDispatcher("student_index.jsp").forward(request, response);
            }
        } else {
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
