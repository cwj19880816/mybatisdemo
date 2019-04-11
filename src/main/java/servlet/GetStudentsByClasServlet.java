package servlet;

import entity.Clas;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "GetStudentsByClasServlet", urlPatterns = {"/getStudentsByClasServlet"})
public class GetStudentsByClasServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("clas_id");
        System.out.println(id + "-------------------");
        Collection<Clas> clases = (Collection<Clas>) session.getAttribute("clases");
        for (Clas clas : clases) {
            if (clas.getClas_id() == Integer.parseInt(id)) {
                Collection<Student> students=clas.getStudents();
                request.setAttribute("students", students);
                request.getRequestDispatcher("clas_students.jsp").forward(request, response);
                break;
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
