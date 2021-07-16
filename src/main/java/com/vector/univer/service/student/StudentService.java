package main.java.com.vector.service.student;

import main.java.com.vector.entity.StudentEntity;
import main.java.com.vector.service.SystemInputService;

import java.util.regex.Pattern;

public class StudentService {
    public StudentService() {
    }

    public String readStudentName() {
        String name;
        do {
            System.out.println("Введите имя студента: ");
            name = SystemInputService.readLine();

        } while (!Pattern.matches("[a-zA-Zа-яА-Я ]+", name));

        return name;
    }

    public int readStudentAge(){
        int age;
        do {
            System.out.println("Введите возраст студента: ");
            age = Integer.parseInt(SystemInputService.readLine());

        } while (!Pattern.matches("[0-9]+", Integer.toString(age)));
        return age;

    }

    public String readStudentNumber(){
        String number;
        do {
            System.out.println("Введите номер телефона студента: ");
            number = SystemInputService.readLine();
        } while (!Pattern.matches("[0-9]+", number));
        return number;

    }

    //    TODO remove static \/
    public StudentEntity readStudent() {

        String name= readStudentName();
        int age = readStudentAge();
        String number = readStudentNumber();

        return StudentEntityService.createStudent(name, age, number);
    }
}
