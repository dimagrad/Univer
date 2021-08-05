package com.vector.univer.service.student;

import com.vector.univer.entity.StudentEntity;

public class StudentEntityService {

    public static StudentEntity createStudent(String name, int age, String number) {

        return new StudentEntity(name, age, number);
    }
}
