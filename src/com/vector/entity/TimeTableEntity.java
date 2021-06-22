package com.vector.entity;

public class TimeTableEntity {
    private CourseEntity course;
    private TeacherEntity teacher;
    public TimeTableEntity(){}
    public TimeTableEntity(CourseEntity course, TeacherEntity teacher){

        this.course = course;
        this.teacher = teacher;
    }
    public String toString() {

        return "Предмет: Название - '" + course.getName() + "'. Пара №"
                + course.getPte() + ". '" + teacher.getName() + "'.";
    }

}
