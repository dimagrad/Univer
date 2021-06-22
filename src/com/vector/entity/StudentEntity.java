package com.vector.entity;

public class StudentEntity {

    private String name;

    public StudentEntity() {}

    public StudentEntity(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return "Студент: Имя - '" + name + "'";
    }

    @Override
    public boolean equals(Object student) {

        return this.getName().trim().toLowerCase().equals(((StudentEntity) student).getName().trim().toLowerCase());
    }
}
