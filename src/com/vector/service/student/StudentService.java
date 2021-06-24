package com.vector.service.student;

import com.vector.entity.StudentEntity;
import com.vector.service.SystemInputService;

public class StudentService {

    public static String readStudentName() {

        String name = SystemInputService.readLine();

        return name;
    }

    public static StudentEntity readStudent() {

        String name = readStudentName();

        return StudentEntityService.createStudent(name);
    }
}
