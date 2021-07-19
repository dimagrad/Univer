package com.vector.univer.start;

import com.vector.univer.entity.StudentEntity;
import com.vector.univer.entity.TimeTableEntity;
import com.vector.univer.mock.CourseMock;
import com.vector.univer.mock.StudentMock;
import com.vector.univer.mock.TeacherMock;
import com.vector.univer.service.SystemInputService;
import com.vector.univer.service.student.ReadStudentService;
import com.vector.univer.service.student.StudentService;
import com.vector.univer.service.student.WriteStudentService;
import com.vector.univer.service.timetable.AddToCourse;
import com.vector.univer.service.timetable.TimeTableService;
import com.vector.univer.wrapper.CoursesWrapper;
import com.vector.univer.wrapper.StudentsWrapper;
import com.vector.univer.wrapper.TeachersWrapper;
import com.vector.univer.wrapper.TimeTableWrapper;

import java.util.List;
import java.util.logging.Logger;

public class UserDialog {

    private final Logger logger;

    private AddToCourse addToCourse;

    private StudentsWrapper studentsWrapper;
    private TeachersWrapper teachersWrapper;
    private CoursesWrapper coursesWrapper;
    private TimeTableWrapper timeTableWrapper;
    private WriteStudentService writeStudentService;
    private ReadStudentService readStudentService;

    public UserDialog() {

        logger = Logger.getLogger(UserDialog.class.getName());

        addToCourse = new AddToCourse();
        teachersWrapper = new TeachersWrapper(TeacherMock.getTeachers());
        studentsWrapper = new StudentsWrapper(StudentMock.getStudents());
        coursesWrapper = new CoursesWrapper(CourseMock.getCourses());
        writeStudentService = new WriteStudentService(StudentMock.getStudents());
        readStudentService = new ReadStudentService(studentsWrapper.getStudents());
    }

    public void startDialog() {

        head();
        int x = 0;

        try {

            x = Integer.parseInt(SystemInputService.readLine());

        } catch (NumberFormatException e) {

            System.out.println("Неверное значение");
            startDialog();
        }

        switch (x) {

            case 1:

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
                writeStudentService.writeToFileStudents();
                break;

            case 8:
                System.out.println("\n");
                Thread reaadThread = new Thread(readStudentService);
                reaadThread.start();
                break;

            default:
                System.out.println("Неверный выбор");
        }
        System.out.println("\n");
        startDialog();
    }


    public void head() {
        System.out.println("Выберите что вы хотите:");
        System.out.println("1: Посмотреть всех студентов");
        System.out.println("2: Добавить студента");
        System.out.println("3: Добавить студента на курс");
        System.out.println("4: Посмотреть все курсы");
        System.out.println("5: Посмотреть всех учителей");
        System.out.println("6: Просмотр расписания");
        System.out.println("7: Запись студентов в файл");
        System.out.println("8: Запись студентов в программу");
    }

}

