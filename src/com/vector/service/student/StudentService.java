package com.vector.service.student;

import com.vector.entity.StudentEntity;
import com.vector.service.SystemInputService;

public class StudentService {
public StudentService(){}
    public String readStudentName() {

        String name = SystemInputService.readLine();

        return name;
    }

//    TODO remove static \/
    public StudentEntity readStudent() {
        System.out.println("Введите имя студента: ");
        String name = readStudentName();

        return StudentEntityService.createStudent(name);
    }
}
