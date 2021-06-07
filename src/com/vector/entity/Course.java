package com.vector.entity;

public class Course {
    public Course(String n, int pte, int p) {
        nazva = n;
        PTE = pte;                //people to enter
        para = p;
    }
    public String getNazva(){
        return nazva;
    }
    public int getPTE(){
        return PTE;
    }
    public int getPara(){
        return para;
    }

    public void outp(){
        System.out.println("Name of schedule: "+getNazva()+" people to enter: "+getPTE()+" Position: "+getPara());
    }

    private String nazva;
    private int PTE;
    private int para;
}
