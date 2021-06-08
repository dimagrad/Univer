package com.vector.entity;

import java.util.Scanner;

public class Student {

    private Scanner in;

    public Student(String n, int sem, boolean f, boolean s) {
        in = new Scanner(System.in);

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

    public String setName(){
        System.out.println("Enter your name ");
        name = in.next();
        return name;
    }

    public int setKurs(){

        System.out.println("Enter your curs ");
        semestr = in.nextInt();
        while (semestr>6){
            System.out.println("incorrect, try again");
            System.out.println("Enter your curs ");
            semestr = in.nextInt();
        }
        return semestr;
    }
    public boolean setForma(){

        System.out.println("Enter your forma (true or false) ");
         forma = in.nextBoolean();
         return forma;

    }
    public boolean setStip(){

        System.out.println("Have you got stip (true or false) ");
        stip = in.nextBoolean();
        return stip;

    }

    private String name;
    private int semestr;
    private boolean forma;
    private boolean stip;
}
