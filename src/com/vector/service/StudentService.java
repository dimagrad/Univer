package com.vector.service;

import com.vector.entity.StudentEntity;

public class StudentService {

    public static String readStudentName() {

        String name = SystemInputService.readLine();

        return name;
    }

    public static StudentEntity readStudent() {

        String name = readStudentName();

        return StudentEntityService.createStudent(name);
    }
}
