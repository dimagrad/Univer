package com.vector.univer.service.parsing_file;

import com.vector.univer.entity.StudentEntity;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public class ParsingFile implements Callable<List<StudentEntity>> {

    private StudentHandler studentHandler = new StudentHandler();
    private List<StudentEntity> students = new ArrayList<>();
    private File file;

    public List<StudentEntity> call () throws Exception{

        file = new File("src/resources/Test_Student_add.txt");

        for (String student: new ReadLine(file).getLines()){

            students.add(studentHandler.handleStudent(student));
        }

        System.out.println("Студенты считаны");
        return students;
    }
}
