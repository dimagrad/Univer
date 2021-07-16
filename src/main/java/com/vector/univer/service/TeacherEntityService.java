package main.java.com.vector.service;

import main.java.com.vector.entity.TeacherEntity;

public class TeacherEntityService {

    public static TeacherEntity createTeacher(String name, String course){

        return new TeacherEntity(name,course);
    }
}
