package com.vector;

import com.vector.entity.StudentEntity;
import com.vector.entity.TimeTableEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.StudentMock;
import com.vector.mock.TeacherMock;
import com.vector.service.student.StudentService;
import com.vector.service.time.table.AddToCourse;
import com.vector.service.time.table.TimeTableService;
import com.vector.wrapper.CoursesWrapper;
import com.vector.wrapper.StudentsWrapper;
import com.vector.wrapper.TeachersWrapper;
import com.vector.wrapper.TimeTableWrapper;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.logging.Logger;

import static com.vector.service.SystemInputService.readLine;

public class UserDialog {

    private final Logger logger;

    private AddToCourse addToCourse;

    private StudentsWrapper studentsWrapper;
    private TeachersWrapper teachersWrapper;
    private CoursesWrapper coursesWrapper;
    private TimeTableWrapper timeTableWrapper;

    public UserDialog() {

        logger = Logger.getLogger(UserDialog.class.getName());

        addToCourse = new AddToCourse();
        teachersWrapper = new TeachersWrapper(TeacherMock.getTeachers());
        studentsWrapper = new StudentsWrapper(StudentMock.getStudents());
        coursesWrapper = new CoursesWrapper(CourseMock.getCourses());
    }

    public void startDialog() throws IOException {

        head();
        int x = 0;
//    TODO    rework with exceptions \/
        try {
            x = Integer.parseInt(readLine());
        } catch (NumberFormatException e) {
            System.out.println("Неверное значение");
            startDialog();
        }

        switch (x) {

            case 1:
//                 TODO   replace all sysout with some Logger \
                System.out.println("\n");

                studentsWrapper.printStudents();

                break;
            case 2:
                System.out.println("\n");

                StudentEntity student = new StudentService().readStudent();

                studentsWrapper.addStudent(student);

                break;
            case 3:
                System.out.println("\n");
                addToCourse.addStudentToCourse(studentsWrapper, coursesWrapper);

                coursesWrapper.printCourses();

                break;
            case 4:
                System.out.println("\n");

                coursesWrapper.printCourses();
                break;
            case 5:
                System.out.println("\n");

                teachersWrapper.printTeachers();

                break;
            case 6:
                System.out.println("\n");
                List<TimeTableEntity> timeTables = TimeTableService.formTimeTable();
                timeTableWrapper = new TimeTableWrapper(timeTables);
                timeTableWrapper.printTimeTable();

                break;
            case 7:
                System.out.println("\n");
                studentsWrapper.WriteToFileStudents();
                break;
            case 8:
                System.out.println("\n");
                studentsWrapper.WriteToProgramStudents();
                break;
            default:
                System.out.println("Неверный выбор");
        }
        System.out.println("\n");
        startDialog();
    }


    public void head() {
        //logger.info("Выберите что вы хотите:");
        System.out.println("Выберите что вы хотите:");
        System.out.println("1: Посмотреть всех студтов");
        System.out.println("2: Добавить студента");
        System.out.println("3: Добавить студента на курс");
        System.out.println("4: Посмотреть все курсы");
        System.out.println("5: Посмотреть всех учителей");
        System.out.println("6: Просмотр расписания");
        System.out.println("7: Запись студентов в файл");
        System.out.println("8: Запись студентов в программу");

    }

}

