package com.vector.univer.mock;


import com.vector.univer.entity.StudentEntity;
import com.vector.univer.service.student.StudentEntityService;

import java.util.ArrayList;
import java.util.List;

public class StudentMock {

    public static List<StudentEntity> getStudents() {
        List<StudentEntity> students = new ArrayList<>();

        students.add(StudentEntityService.createStudent("Дима Петров", 17, "0675674563"));
        students.add(StudentEntityService.createStudent("Олег ИВанов",16, "0675674563"));
        students.add(StudentEntityService.createStudent("Данил Чистов",18, "0675645463"));
        students.add(StudentEntityService.createStudent("Алина Пустовойт",16, "0675645443"));
        students.add(StudentEntityService.createStudent("Карина Кузьменко",17, "0675665463"));

        return students;
    }
}
