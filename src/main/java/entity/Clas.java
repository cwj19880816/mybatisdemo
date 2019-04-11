package entity;

import java.util.Collection;

public class Clas {
    private int clas_id;
    private String clas_name;
    private Collection<Teacher> teachers;
    private Collection<Student> students;

    public int getClas_id() {
        return clas_id;
    }

    public void setClas_id(int clas_id) {
        this.clas_id = clas_id;
    }

    public String getClas_name() {
        return clas_name;
    }

    public void setClas_name(String clas_name) {
        this.clas_name = clas_name;
    }

    public Collection<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Collection<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    public Clas() {
    }

    public Clas(int clas_id, String clas_name, Collection<Teacher> teachers, Collection<Student> students) {
        this.clas_id = clas_id;
        this.clas_name = clas_name;
        this.teachers = teachers;
        this.students = students;
    }

    public Clas(String clas_name, Collection<Teacher> teachers, Collection<Student> students) {
        this.clas_name = clas_name;
        this.teachers = teachers;
        this.students = students;
    }
}
