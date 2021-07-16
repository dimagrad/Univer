package com.vector.univer.service.student;
import main.java.com.vector.entity.StudentEntity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ReadStudentService {
    private List<StudentEntity> students;

    public ReadStudentService(List<StudentEntity> students) {
        this.students = students;
    }

    public void WriteToProgramStudents() throws IOException {
        String s;  // Создать и использовать объект FileReader, помещенный в оболочку на основе класса BufferedReader
        //try (BufferedReader br = new BufferedReader(new FileReader("Student_add.txt"))) {    //Соэдание объекта FileReader
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Student_add.txt"), "Cp1251"))) {
            while ((s = br.readLine()) != null) {
                //todo student file
                //addStudent(StudentEntityService.createStudent(s));
            }
        } catch (IOException ехс) {

            System.out.println("Ошибка ввода-вывода: " + ехс);
        }
    }

}
