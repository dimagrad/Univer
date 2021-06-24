package com.vector.service.time.table;

import com.vector.entity.CourseEntity;
import com.vector.entity.StudentEntity;
import com.vector.wrapper.CoursesWrapper;
import com.vector.wrapper.StudentsWrapper;

import static com.vector.service.SystemInputService.readLine;

public class AddToCourse {

    public void studentToCourse(CourseEntity course, StudentEntity student){

        System.out.println("Студент "+ student.getName()+" добавлен на предмет " + course.getName());

        course.addStudent(student);
    }

    public void addStudentToCourse(StudentsWrapper studentsWrapper, CoursesWrapper coursesWrapper){


        System.out.println("Выберите студента");
        for (StudentEntity student : studentsWrapper.getStudents()) {
            System.out.println(student);
        }
        int st = Integer.parseInt(readLine());
        System.out.println("Выберите курс");
        for (CourseEntity cours : coursesWrapper.getCourses()) {
            System.out.println(cours);
        }
        int crs = Integer.parseInt(readLine());

        CourseEntity chosenCourse = coursesWrapper.getCourse(crs - 1);
        StudentEntity chosenStudent = studentsWrapper.getStudent(st - 1);

        studentToCourse(chosenCourse, chosenStudent);
    }
}

