package com.vector.wrapper;

import com.vector.entity.StudentEntity;

import java.io.*;
import java.util.List;

public class StudentsWrapper {

    private List<StudentEntity> students;

    public StudentsWrapper(List<StudentEntity> students) {

        this.students = students;
    }

    public void addStudent(StudentEntity student) {

        if (!students.contains(student)) {

            students.add(student);
            System.out.println(student.getName() + " добавлен");
        } else System.out.println(student.getName() + " существует");
    }

    public StudentEntity getStudent(int index) {

        return this.students.get(index);
    }

    public List<StudentEntity> getStudents() {

        return students;
    }

    public void printStudents() {

        System.out.println("Список студентов: \n");

        for (StudentEntity student : students) {

            System.out.println(student);
        }
    }

    public void WriteToFileStudents() throws IOException {
        String str;
        try (FileWriter fw = new FileWriter("Students.txt")) {
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
