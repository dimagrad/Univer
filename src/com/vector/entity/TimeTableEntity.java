package com.vector.entity;

import com.vector.service.DoubleLessonTime;

public class TimeTableEntity {

    private CourseEntity course;
    private TeacherEntity teacher;

    public TimeTableEntity(){}

    public TimeTableEntity(CourseEntity course, TeacherEntity teacher){

        this.course = course;
        this.teacher = teacher;
    }
    public String toString() {

        return "Предмет: Название - " + course.getName() + DoubleLessonTime.getSpace(10,course.getName()) + " Пара №"
                + course.getDoubleLesson() + ". Преподаватель: Имя - "
                + teacher.getName() + DoubleLessonTime.getSpace(20,teacher.getName()) + DoubleLessonTime.getTime(course.getDoubleLesson());
    }

}