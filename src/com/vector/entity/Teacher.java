package com.vector.entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private List<String> nameTeachers;


    public Teacher(){

        nameTeachers = new ArrayList<>();

        nameTeachers.add("Александр Сергеевич");
        nameTeachers.add("Иван Павлович");
        nameTeachers.add("Мария Александровна");
        nameTeachers.add("Владимир петрович");
        nameTeachers.add("Людмила Петровна");
        nameTeachers.add("Зинаида Альбертовна");

    }

    public List<String> getTeacher(){

        return nameTeachers;

    }
}
