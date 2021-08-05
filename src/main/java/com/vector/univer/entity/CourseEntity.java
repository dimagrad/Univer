package com.vector.univer.entity;

import com.vector.univer.Except.Except;

import java.util.ArrayList;
import java.util.List;

public class CourseEntity {

    private int pte;
    private String name;
    private int doubleLesson;
    private List<StudentEntity> students;


    public CourseEntity(String name, int pte, int doubleLesson) {

        this.name = name;
        this.pte = pte;
        this.doubleLesson = doubleLesson;
        students = new ArrayList<>();
    }

    public String getName(){

        return name;
    }

    public void addStudent(StudentEntity student) throws Except {

        if (this.students.size() < pte) {

            this.students.add(student);

        } else {

            throw new Except("Слишком много студентов");

        }
    }

    public int getDoubleLesson(){

        return doubleLesson;
    }


    @Override
    public String toString() {
        if (students.size() == 0) {

            return "Курс: Название - '" + name + "'. Доступных мест на вход: " + pte + ". На паре №"
                    + doubleLesson + ".";
        }else{

                    return "Курс: Название - '" + name + "'. Доступных мест на вход: " + pte + ". На паре №"
                            + doubleLesson + ". Студенты на курсе: " + students;
        }
    }
    public boolean equals(Object teacher) {

        return this.getName().trim().toLowerCase().equals(((TeacherEntity) teacher).getCourse().trim().toLowerCase());
    }
}
