package com.vector.univer.mock;

import com.vector.univer.entity.TeacherEntity;
import com.vector.univer.service.TeacherEntityService;

import java.util.ArrayList;
import java.util.List;

public class TeacherMock {


public static List<TeacherEntity> getTeachers(){

        List <TeacherEntity> teachers = new ArrayList<>();

        teachers.add(TeacherEntityService.createTeacher("Александр Сергеевич","Алгебра"));
        teachers.add(TeacherEntityService.createTeacher("Иван Павлович", "Физика"));
        teachers.add(TeacherEntityService.createTeacher("Мария Александровна", "Физ-ра"));
        teachers.add(TeacherEntityService.createTeacher("Владимир петрович", "Химия"));
        teachers.add(TeacherEntityService.createTeacher("Людмила Петровна", "Немецкий"));
        teachers.add(TeacherEntityService.createTeacher("Зинаида Альбертовна", "Геометрия"));

        return teachers;
    }

}
