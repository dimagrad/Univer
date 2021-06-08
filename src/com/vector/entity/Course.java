package com.vector.entity;

import java.util.Date;

public class Course {
    public Course(String n, int pte, int p, Student t, String d) {
        nazva = n;
        PTE = pte;                //people to enter
        para = p;
        date = d;
        newS = t;

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

        System.out.println("Name of schedule: " + getName()+" people to enter: " + getPTE()
                +" Position: " + getPara() + " Time: " + getTime());
    }
    private Student newS;
    private String nazva;
    private int PTE;
    private String date;
    private int para;
}
