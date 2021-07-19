package com.vector.univer.service;

import com.vector.univer.entity.CourseEntity;

public class CourseEntityService {

    public static CourseEntity createCourse(String name, int pte, int doubleLesson){

        return new CourseEntity(name, pte, doubleLesson);
    }

}
