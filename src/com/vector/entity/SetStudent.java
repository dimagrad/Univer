package com.vector.entity;

import java.util.List;
import java.util.Scanner;

public class SetStudent extends Student {

    private Scanner in;
    private String name;
    private boolean tmp = true;

    public SetStudent() {

        super();
        in = new Scanner(System.in);

    }
    public boolean setNameStudent(){

        System.out.println("Enter your name ");
        name = in.next();
        if (name == "") tmp = false;

        for (String nameS: nameStudent){

            if (nameS.equals(name)) {

                tmp = false;

            }
        }
        if (tmp) {
            System.out.println("adding");
            nameStudent.add(name);
        }
        return tmp;
    }
}
