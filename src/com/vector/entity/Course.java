package com.vector.entity;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Course> course;
    private Student newS;
    private String nazva;
    private int PTE;
    private String date;
    private int para;
    public Course(){

    }
    public Course(String n, int pte, int p, Student t, String d) {

        course = new ArrayList<>();

        course.add(new Course("Algebra",5,1 ,null, ""));
        course.add(new Course("Geometry",5,2,null, ""));
        course.add(new Course("Phyzics",5,3 ,null, ""));
        course.add(new Course("English",5,4 ,null, ""));

    }

    public Course getCourse(){
        return (Course) course;
    }

    public String getName(){

        return nazva;
    }

    public String getDate(){
        return date;
    }
    public int getPTE(){

        return PTE;
    }
    public int getPara(){

        return para;
    }
    public String getTime(){
        addTime();
        return date;
    }

    public void setStudent(Student t) {
        this.newS = t;
        this.PTE--;

    }
    public Student getStudent(){
        return this.newS;
    }

    public void addTime(){
        switch (para) {
            case 1:
                this.date = "8.30 - 10.00";
                break;
            case 2:
                this.date = "10.30 - 12.00";
                break;
            case 3:
                this.date = "12.30 - 14.00";
                break;
            case 4:
                this.date = "14.30 - 16.00";
                break;
        }
    }

    public void outp(){

        System.out.println("Название пары " + getName()+" Доступных мест для входа на курс: " + getPTE()
                +" Position: " + getPara() + " Time: " + getTime());
    }

}
