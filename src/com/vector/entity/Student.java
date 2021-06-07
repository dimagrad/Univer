package com.vector.entity;

public class Student {
    public Student(String n, int sem, boolean f, boolean s) {
        name = n;
        semestr = sem;
        forma = f;
        stip = s;
    }

    public String getName(){
        return name;
    }

    public int getSemestr(){
        return semestr;
    }

    public boolean getForma(){
        return forma;
    }

    public boolean getStip(){
        return stip;
    }
    public void outp(){
        System.out.println("Name: " + getName() + " Semestr = "
                + getSemestr() + " forma= " + (getForma() ? "Denna" : "Zaochna") + " stipendiya= "
                + (getStip() ? "+" : "-"));
    }

    private String name;
    private int semestr;
    private boolean forma;
    private boolean stip;


}
