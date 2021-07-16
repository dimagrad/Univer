package main.java.com.vector.entity;

public class TeacherEntity {
    private String name;
    private String course;

    public TeacherEntity() {
    }

    public TeacherEntity(String name, String course) {

        this.name = name;
        this.course = course;

    }

    public String getName(){

        return name;
    }

    public String getCourse(){

        return course;
    }

    public String toString() {

        return "Преподаватель: Имя - '" + name + "'. Ведет предмет - '" + course + "'";
    }

    public boolean equals(Object teacher) {

        return this.getCourse().trim().toLowerCase().equals(((TeacherEntity) teacher).getName().trim().toLowerCase());
    }

}
