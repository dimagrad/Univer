package com.vector.service;

import com.vector.entity.TeacherEntity;

public class TeacherEntityService {

    public static TeacherEntity createTeacher(String name, String course){

        return new TeacherEntity(name,course);
    }
}
