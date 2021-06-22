package com.vector.service;

import com.vector.entity.CourseEntity;

public class CourseEntityService {

    public static CourseEntity createCourse(String name, int pte, int doubleLesson){

        return new CourseEntity(name, pte, doubleLesson);
    }

}
