package com.vector;

import com.vector.entity.StudentEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.StudentMock;
import com.vector.mock.TeacherMock;
import com.vector.mock.TimeTableMock;
import com.vector.service.Student.StudentService;
import com.vector.wrapper.CoursesWrapper;
import com.vector.wrapper.StudentsWrapper;
import com.vector.service.TimeTableEntityService;
import com.vector.wrapper.TeachersWrapper;
import com.vector.wrapper.TimeTableWrapper;

import static com.vector.service.SystemInputService.readLine;

public class UserDialog {

    int x;

    private StudentsWrapper studentsWrapper;
    private TeachersWrapper teachersWrapper;
    private CoursesWrapper coursesWrapper;
    private TimeTableWrapper timeTableWrapper;

    public UserDialog() {
        timeTableWrapper = new TimeTableWrapper(TimeTableMock.getTimeTables());
        teachersWrapper = new TeachersWrapper(TeacherMock.getTeachers());
        studentsWrapper = new StudentsWrapper(StudentMock.getStudents());
        coursesWrapper = new CoursesWrapper(CourseMock.getCourses());
    }

    public void StartDialog(){
        TimeTableEntityService timeTableEntityService = new TimeTableEntityService();
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

