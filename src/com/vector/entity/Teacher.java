package com.vector.entity;

public class Teacher {
    public Teacher(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void outp(){
        System.out.println("Name: "+getName()+" Salary = "+getSalary());
    }

    private String name;
    private double salary;
}
