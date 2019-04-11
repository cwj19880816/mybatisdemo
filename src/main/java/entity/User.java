package entity;

public class User {
    private int user_id;
    private String user_name;
    private String user_password;
    private Student student;
    private Teacher teacher;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public User() {
    }

    public User(int user_id, String user_name, String user_password, Student student, Teacher teacher) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.student = student;
        this.teacher = teacher;
    }

    public User(String user_name, String user_password, Student student, Teacher teacher) {
        this.user_name = user_name;
        this.user_password = user_password;
        this.student = student;
        this.teacher = teacher;
    }
}
