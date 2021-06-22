package com.vector.service;

import com.vector.entity.StudentEntity;

public class StudentEntityService {

    public static StudentEntity createStudent(String name) {

        return new StudentEntity(name);
    }
}
