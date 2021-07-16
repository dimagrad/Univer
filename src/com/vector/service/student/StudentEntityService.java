package com.vector.service.student;

import com.vector.entity.StudentEntity;

public class StudentEntityService {

    public static StudentEntity createStudent(String name, int age, String number) {

        return new StudentEntity(name, age, number);
    }
}
