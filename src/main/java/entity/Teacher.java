package entity;

import java.util.Collection;

public class Teacher {
    private int teacher_id;
    private String teacher_name;
    private String teacher_sex;
    private User user;
    private Collection<Clas> clases;

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getTeacher_sex() {
        return teacher_sex;
    }

    public void setTeacher_sex(String teacher_sex) {
        this.teacher_sex = teacher_sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Collection<Clas> getClases() {
        return clases;
    }

    public void setClases(Collection<Clas> clases) {
        this.clases = clases;
    }

    public Teacher() {
    }

    public Teacher(int teacher_id, String teacher_name, String teacher_sex, User user, Collection<Clas> clases) {
        this.teacher_id = teacher_id;
        this.teacher_name = teacher_name;
        this.teacher_sex = teacher_sex;
        this.user = user;
        this.clases = clases;
    }

    public Teacher(String teacher_name, String teacher_sex, User user, Collection<Clas> clases) {
        this.teacher_name = teacher_name;
        this.teacher_sex = teacher_sex;
        this.user = user;
        this.clases = clases;
    }
}
