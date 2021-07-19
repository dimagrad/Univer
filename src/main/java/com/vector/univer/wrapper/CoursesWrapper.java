package com.vector.univer.wrapper;


import com.vector.univer.Except.Except;
import com.vector.univer.entity.CourseEntity;
import com.vector.univer.service.DoubleLessonTime;

import java.util.List;

public class CoursesWrapper {

    private List<CourseEntity> courses;

    public CoursesWrapper(List <CourseEntity> courses){

        this.courses = courses;
    }

    public CourseEntity getCourse(int index) throws Except {

        if (this.courses.size()>= index){

            return this.courses.get(index);

        } else {

            throw new Except("Слишком много студентов");
        }

    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void printCourses() {

        System.out.println("Расписание курсов: \n");

        for (int i = 1; i<=4; i++) {

            System.out.println(DoubleLessonTime.getTime(i));
        }

        System.out.println("");
        System.out.println("Список курсов: \n");

        for (CourseEntity course : courses) {

            System.out.println(course);
        }
    }

}
