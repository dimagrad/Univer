package com.vector.univer.service.timetable;

import com.vector.univer.Except.Except;
import com.vector.univer.entity.CourseEntity;
import com.vector.univer.entity.StudentEntity;
import com.vector.univer.service.SystemInputService;
import com.vector.univer.wrapper.CoursesWrapper;
import com.vector.univer.wrapper.StudentsWrapper;

public class AddToCourse {

    public void studentToCourse(CourseEntity course, StudentEntity student) {

        try {

            course.addStudent(student);
            System.out.println("Студент " + student.getName() + " добавлен на предмет " + course.getName());

        } catch (Except except) {

            System.out.println(except.getMessage());
        }
    }

    public void addStudentToCourse(StudentsWrapper studentsWrapper, CoursesWrapper coursesWrapper) {

        boolean choose;
        CourseEntity chosenCourse;
        StudentEntity chosenStudent;

        do {

            choose = false;
            System.out.println("Выберите студента");
            for (StudentEntity student : studentsWrapper.getStudents()) {

                System.out.println(student);
            }

            int st = Integer.parseInt(SystemInputService.readLine());
            System.out.println("Выберите курс");

            for (CourseEntity cours : coursesWrapper.getCourses()) {

                System.out.println(cours);
            }

            int crs = Integer.parseInt(SystemInputService.readLine());

            try {

                chosenCourse = coursesWrapper.getCourse(crs - 1);
                chosenStudent = studentsWrapper.getStudent(st - 1);
                studentToCourse(chosenCourse, chosenStudent);

            } catch (Except еxc) {

                System.out.println("Вы ввели неверное значение");
                choose = true;
            }
        } while (choose == true);
    }
}

