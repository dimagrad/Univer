package com.vector.univer.service;


import com.vector.univer.entity.TeacherEntity;

public class TeacherEntityService {

    public static TeacherEntity createTeacher(String name, String course){

        return new TeacherEntity(name,course);
    }
}
