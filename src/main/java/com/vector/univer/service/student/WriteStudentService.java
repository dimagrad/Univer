package com.vector.univer.service.student;

import com.vector.univer.entity.StudentEntity;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteStudentService {
    private List<StudentEntity> students;

    public WriteStudentService(List<StudentEntity> students) {

        this.students = students;
    }

    public void writeToFileStudents(){

        String str;

        try (FileWriter fw = new FileWriter("src/resources/Students.txt")) {
            System.out.print("Записаны");

            for (StudentEntity student : students) {

                str = student.toString();
                str = str + "\r\n";
                fw.write(str);
            }

        } catch (IOException ехс) {
            System.out.println("Oшибкa записи студентов в файл: " + ехс);
        }
    }
}
