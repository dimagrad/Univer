package com.vector.wrapper;

import com.vector.Except.Except;
import com.vector.entity.CourseEntity;
import com.vector.service.DoubleLessonTime;

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
//        TODO https://www.oracle.com/technetwork/java/codeconventions-150003.pdf
        for (int i = 1; i<=4; i++)
            System.out.println(DoubleLessonTime.getTime(i));

        System.out.println("");
        System.out.println("Список курсов: \n");

        for (CourseEntity course : courses) {

            System.out.println(course);
        }
    }

}
