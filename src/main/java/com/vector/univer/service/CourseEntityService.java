package main.java.com.vector.service;

import main.java.com.vector.entity.CourseEntity;

public class CourseEntityService {

    public static CourseEntity createCourse(String name, int pte, int doubleLesson){

        return new CourseEntity(name, pte, doubleLesson);
    }

}
