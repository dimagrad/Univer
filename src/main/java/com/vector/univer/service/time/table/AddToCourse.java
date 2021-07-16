package main.java.com.vector.service.time.table;

import main.java.com.vector.service.SystemInputService;
import main.java.com.vector.Except.Except;
import main.java.com.vector.entity.CourseEntity;
import main.java.com.vector.entity.StudentEntity;
import main.java.com.vector.wrapper.CoursesWrapper;
import main.java.com.vector.wrapper.StudentsWrapper;

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
            CourseEntity chosenCourse = null;
            StudentEntity chosenStudent = null;
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

