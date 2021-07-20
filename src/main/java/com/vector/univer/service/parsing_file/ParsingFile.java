package com.vector.univer.service.parsing_file;

import com.vector.univer.entity.StudentEntity;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ParsingFile implements Callable<List<StudentEntity>> {

    private StudentHandler studentHandler = new StudentHandler();
    private List<StudentEntity> students = new ArrayList<>();

    public List<StudentEntity> call () throws Exception{

        String student;
        Path testFilePath = Paths.get("src/resources/Student_add.txt");
        System.out.println("Printing file information: ");
        for (Path testing : testFilePath)
            System.out.println(testing);
        System.out.println("\t file name: " + testFilePath.getFileName());
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/resources/Student_add.txt"), "Cp1251"))) {
            while ((student = br.readLine()) != null) {

                students.add(studentHandler.handleStudent(student));
            }
        } catch (IOException ехс) {

            System.out.println("Ошибка ввода-вывода: " + ехс);
        }
        System.out.println("Студенты считаны");
        return students;
    }
}
