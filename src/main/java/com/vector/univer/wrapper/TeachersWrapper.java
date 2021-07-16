package main.java.com.vector.wrapper;

import main.java.com.vector.entity.TeacherEntity;

import java.util.List;

public class TeachersWrapper {

    private List<TeacherEntity> teachers;

    public TeachersWrapper(List<TeacherEntity> teachers) {

        this.teachers = teachers;
    }

    public void printTeachers() {

        System.out.println("Список преподавателей: \n");

        for (TeacherEntity teacher : teachers) {

            System.out.println(teacher);
        }
    }
}
