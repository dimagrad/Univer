package com.vector;

import com.vector.entity.StudentEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.StudentMock;
import com.vector.mock.Teacher;
import com.vector.service.StudentService;
import com.vector.wrapper.StudentsWrapper;
import com.vector.service.TimeTableService;

import java.util.ArrayList;
import java.util.List;

import static com.vector.Univer.readInput;
public class UserDialog {

    int x;

    private StudentsWrapper studentsWrapper;

    public UserDialog() {

        studentsWrapper = new StudentsWrapper(StudentMock.getStudents());
    }

    public void StartDialog(){
        List<CourseMock> cours = new ArrayList<>(/*)new CourseMock().getCourse(*/);
        Teacher teachers = new Teacher();
        TimeTableService timeTableService = new TimeTableService();
        head();
        x=Integer.parseInt(readInput());
        while (x>6){
            System.out.println("Select the correct choice");
            head();
            x=Integer.parseInt(readInput());
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
                /*case 3:
                    System.out.println("Какого студента вы бы хотели добавить ");

                    for (String k : students.getStudent()) {
                        System.out.println(k+" ");
                    }
                    int chStudent = Integer.parseInt(readInput());
                    chStudent--;
                    while(chStudent+1>students.getStudent().size()){
                        System.out.println("Неверный ввод, введите другой");
                        for (String k : students.getStudent()) {
                            System.out.println(k+" ");
                        }
                        chStudent=Integer.parseInt(readInput());
                    }
                    System.out.println("На какой курс вы хотите записать");

                    for (Course j : course.getCourse()) {
                        j.outp();
                    }
                    int chCourse = Integer.parseInt(readInput());
                    chCourse--;
                    while(chCourse+1>course.getCourse().size()){
                        System.out.println("Неверный ввод, введите другой");
                        for (String k : students.getStudent()){
                            System.out.println(k +" ");
                        }
                        chCourse=Integer.parseInt(readInput());
                    }

                    Course tmpCourse = course.get(chCourse);

                    System.out.println("Student " + course.get(chCourse).getStudent() + " now is study at " + course.get(chCourse).getName()
                            + " which will be on the Schedule " + course.get(chCourse).getPara() + ". Lector: " + teachers.get(tmpt).getTeacher()
                            + " Time: " + course.get(chCourse).getTime());
                    break;*/
                case 4:
                    System.out.println("");
                   for (CourseMock courseMock1 : cours)
                       System.out.println(courseMock1);
                       //course1.outp();
                    break;
                case 5:
                    System.out.println("");
                    for (Teacher i : teachers.getTeacher()) {
                        System.out.println("Преподаватель: "+i.getName()+" Обучает предмет: "+ i.getCourse());
                    }

                    break;
                case 6:
                    System.out.println("");

                    for (TimeTableService t : timeTableService.getTimeTable()) {
                        System.out.println( t );
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
            System.out.println("");
            head();
            x=Integer.parseInt(readInput());
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

