package com.vector.entity;

import com.vector.service.DoubleLessonTime;

public class CourseEntity {
    private int pte;
    private String name;
    private String time;
    private int doubleLesson;

    public CourseEntity(){}
    public CourseEntity(String name, int pte, int doubleLesson) {

        this.name = name;
        this.pte = pte;
        this.doubleLesson = doubleLesson;

    }

    public String getName(){

        return name;
    }

    public int getPte(){

        return pte;
    }

    public int getDoubleLesson(){

        return doubleLesson;
    }

    public String toString() {

        //String time  = DoubleLessonTime.getTime(doubleLesson);
        return "Курс: Название - '" + name + "'. Доступных мест на вход: " + pte + ". На паре №"
                + doubleLesson + ".";
    }
    public boolean equals(Object teacher) {

        return this.getName().trim().toLowerCase().equals(((TeacherEntity) teacher).getCourse().trim().toLowerCase());
    }


}
