package com.vector.wrapper;

import com.vector.entity.StudentEntity;

import java.util.List;

public class StudentsWrapper {

    private List<StudentEntity> students;

    public StudentsWrapper(List<StudentEntity> students) {

        this.students = students;
    }

    public void addStudent(StudentEntity student) {

        if (!students.contains(student)) {

            students.add(student);
        }
    }

    public void printStudents() {

        System.out.println("Список студентов: \n");

        for (StudentEntity student : students) {

            System.out.println(student);
        }
    }
}