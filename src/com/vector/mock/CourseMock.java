package com.vector.mock;

import com.vector.entity.CourseEntity;
import com.vector.service.CourseEntityService;

import java.util.ArrayList;
import java.util.List;

public class CourseMock {

    public static List<CourseEntity> getCourses() {

        List<CourseEntity> courseMock = new ArrayList<>();

        courseMock.add(CourseEntityService.createCourse("Алгебра",5,1 ));
        courseMock.add(CourseEntityService.createCourse("Геометрия",5,2));
        courseMock.add(CourseEntityService.createCourse("Физика",5,3 ));
        courseMock.add(CourseEntityService.createCourse("Немецкий",5,4 ));
        courseMock.add(CourseEntityService.createCourse("Химия",5,4 ));
        courseMock.add(CourseEntityService.createCourse("Физ-ра",5,4 ));

        return courseMock;

    }
}
