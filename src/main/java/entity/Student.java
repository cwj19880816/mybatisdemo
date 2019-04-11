package entity;

public class Student {
    private int student_id;
    private String student_name;
    private String student_sex;
    private String student_phone;
    private String student_email;
    private User user;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_sex() {
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_phone() {
        return student_phone;
    }

    public void setStudent_phone(String student_phone) {
        this.student_phone = student_phone;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Student() {
    }

    public Student(int student_id, String student_name, String student_sex, String student_phone, String student_email, User user) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.student_sex = student_sex;
        this.student_phone = student_phone;
        this.student_email = student_email;
        this.user = user;
    }

    public Student(String student_name, String student_sex, String student_phone, String student_email, User user) {
        this.student_name = student_name;
        this.student_sex = student_sex;
        this.student_phone = student_phone;
        this.student_email = student_email;
        this.user = user;
    }
}
