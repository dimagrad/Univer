package com.vector.entity;

public class CourseEntity {
    private int pte;
    private String name;
    private String time;
    private int doubleLesson;

    public CourseEntity(){}
    public CourseEntity(String name, int pte, int doubleLesson, String time) {

        this.name = name;
        this.pte = pte;
        this.doubleLesson = doubleLesson;
        this.time = time;

    }

}
