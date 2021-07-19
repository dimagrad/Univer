package com.vector.univer.service.student;

import com.vector.univer.entity.StudentEntity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Pattern;

public class ReadStudentService implements Runnable {

    private List<StudentEntity> students;

    public ReadStudentService(List<StudentEntity> students) {

        this.students = students;
    }

    public void run() {

        String string;
        String[] fields;
        StudentEntity student;
        Pattern p = Pattern.compile(",\\s");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/resources/Student_add.txt"), "Cp1251"))) {
            while ((string = br.readLine()) != null) {

                fields = p.split(string);
                student = StudentEntityService.createStudent(fields[0], Integer.parseInt(fields[1]), fields[2]);
                if (!students.contains(student)) {

                    students.add(student);
                    System.out.println("Студент " + student.getName() + " добавлен");
                } else {

                    System.out.println("Студент " + student.getName() + "уже существует");
                }
            }
        } catch (IOException ехс) {

            System.out.println("Ошибка ввода-вывода: " + ехс);
        }
        System.out.println("Студенты записаны");
    }
}
