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

import java.util.List;

import static com.vector.service.SystemInputService.readLine;

public class UserDialog {

    int x;
private AddToCourse addToCourse;
    private StudentsWrapper studentsWrapper;
    private TeachersWrapper teachersWrapper;
    private CoursesWrapper coursesWrapper;
    private TimeTableWrapper timeTableWrapper;

    public UserDialog() {
addToCourse = new AddToCourse();
        teachersWrapper = new TeachersWrapper(TeacherMock.getTeachers());
        studentsWrapper = new StudentsWrapper(StudentMock.getStudents());
        coursesWrapper = new CoursesWrapper(CourseMock.getCourses());
    }

    public void startDialog(){
        head();
        x=Integer.parseInt(readLine());
        while (x>6){
            System.out.println("Select the correct choice");
            head();
            x=Integer.parseInt(readLine());
        }
        while (true){

            switch (x) {

                case 1:
                    System.out.println("");

                    studentsWrapper.printStudents();

                    break;
                case 2:
                    System.out.println("");

                    StudentEntity student = StudentService.readStudent();

                    studentsWrapper.addStudent(student);

                    break;
                case 3:
                    addToCourse.addStudentToCourse(studentsWrapper, coursesWrapper);

                    coursesWrapper.printCourses();

                    break;
                case 4:
                    System.out.println("");

                    coursesWrapper.printCourses();
                    break;
                case 5:
                    System.out.println("");

                    teachersWrapper.printTeachers();

                    break;
                case 6:
                    System.out.println("");
                    List<TimeTableEntity> timeTables = TimeTableService.formTimeTable();
                    timeTableWrapper = new TimeTableWrapper(timeTables);
                    timeTableWrapper.printTimeTable();

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
            System.out.println("");
            head();
            x=Integer.parseInt(readLine());
        }

    }


    public static void head(){
        System.out.println("Выберите что вы хотите:");
        System.out.println("1: Посмотреть всех студтов");
        System.out.println("2: Добавить студента");
        System.out.println("3: Добавить студента на курс");
        System.out.println("4: Посмотреть все курсы");
        System.out.println("5: Посмотреть всех учителей");
        System.out.println("6: Просмотр расписания");
    }
}

