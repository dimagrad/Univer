package com.vector.mock;

import com.vector.entity.StudentEntity;
import com.vector.service.student.StudentEntityService;

import java.util.ArrayList;
import java.util.List;

public class StudentMock {

    public static List<StudentEntity> getStudents() {
        List<StudentEntity> students = new ArrayList<>();

        students.add(StudentEntityService.createStudent("Дима Петров"));
        students.add(StudentEntityService.createStudent("Олег ИВанов"));
        students.add(StudentEntityService.createStudent("Данил Чистов"));
        students.add(StudentEntityService.createStudent("Алина Пустовойт"));
        students.add(StudentEntityService.createStudent("Карина Кузьменко"));

        return students;
    }
}
