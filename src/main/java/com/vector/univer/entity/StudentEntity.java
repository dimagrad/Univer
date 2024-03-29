package com.vector.univer.entity;

public class StudentEntity {

    private String name;
    private int age;
    private String number;
    private int id = 0;

    public StudentEntity(String name, int age, String number) {

        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return "Студент: Имя - '" + name + "' Возраст: '" + age
                + "' Номер телефона: '" + number + "'";
    }


    @Override
    public boolean equals(Object student) {

        return this.getName().trim().toLowerCase().equals(((StudentEntity) student).getName().trim().toLowerCase());
    }
}
