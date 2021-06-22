package com.vector.mock;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private List<Teacher> nameTeachers;
    private String name;
    private String course;
    public Teacher(){}
    public Teacher(String n, String c){
        name = n;
        course = c;
        nameTeachers = new ArrayList<>();

        nameTeachers.add(new Teacher("Александр Сергеевич","Алгебра"));
        nameTeachers.add(new Teacher("Иван Павлович", "Физика"));
        nameTeachers.add(new Teacher("Мария Александровна", "Физ-ра"));
        nameTeachers.add(new Teacher("Владимир петрович", "Химия"));
        nameTeachers.add(new Teacher("Людмила Петровна", "Немецкий"));
        nameTeachers.add(new Teacher("Зинаида Альбертовна", "Геометрия"));

    }

    public List<Teacher> getTeacher(){

        return nameTeachers;

    }
    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

}
