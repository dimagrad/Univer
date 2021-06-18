package com.vector.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<String> nameStudent;
    SetStudent setStudent;
    public Student() {

        nameStudent = new ArrayList<>();

        nameStudent.add("Дима Петров");
        nameStudent.add("Олег ИВанов");
        nameStudent.add("Данил Чистов");
        nameStudent.add("Алина Пустовойт");
        nameStudent.add("Карина Кузьменко");

    }

    public List<String> getStudent(){

        return nameStudent;
    }
    public void setStudent(){

        boolean l = setStudent.setNameStudent();
        if (l)
            System.out.println("Студент добавлен");
        else
            System.out.println("Имя неверно или вы пытаетесь добавить существующего студента");
    }


   /* public void outp(){
        System.out.println("Name: " + getName() + " Semestr = "
                + getSemestr() + " forma= " + (getForma() ? "Denna" : "Zaochna") + " stipendiya= "
                + (getStip() ? "+" : "-"));
    }*/

}
