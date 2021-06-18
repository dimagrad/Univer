package com.vector;
import com.vector.entity.Course;
import com.vector.entity.SetStudent;
import com.vector.entity.Student;
import com.vector.entity.Teacher;
import java.util.ArrayList;
import java.util.*;
public class Univer {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Course courses = new Course();
    Teacher teachers = new Teacher();
    Student students = new Student();
        head();
        int x;
        x=in.nextInt();
        while (x>5){
            System.out.println("Select the correct choice");
            head();
            x=in.nextInt();
        }
        while (true){

            switch (x) {

                case 1:
                    System.out.println("");
                    System.out.println("Students:");

                    for (String k : students.getStudent()) {
                        System.out.println( k );
                    }
                    break;

                case 2:

                    students.setStudent();

                    //l ?"Студент добавлен":"Имя неверно или вы пытаетесь добавить существующего студента";
                    break;

                /*case 3:
                    System.out.println("Which student would you like to add?(number)");

                    for (String k : students.getStudent()) {
                        System.out.println(k+" ");
                    }
                    int ch_st = in.nextInt();
                    ch_st--;
                    while(ch_st+1>students.getStudent().size()){
                        System.out.println("incorrect, please, enter correct");
                        for (String k : students.getStudent()) {
                            System.out.println(k+" ");
                        }
                        ch_st=in.nextInt();
                    }
                    System.out.println("Which course would you like to study?(number)");

                    for (Course j : courses.getName()) {
                        j.outp();
                    }
                    int ch_c = in.nextInt();
                    ch_c--;
                    while(ch_c+1>courses.size()){
                        System.out.println("incorrect, please, enter correct");
                        for (String k : students.getStudent()){
                            System.out.println(k +" ");
                        }
                        ch_c=in.nextInt();
                    }
                    Course tmpCourse = courses.get(ch_c);
                    //tmpCourse.setStudent(getStudentName.get(ch_st));

                    int tmpt = 0;
                    for (int i = 0; i<teachers.size(); i++){
                        if(teachers.get(i).getTeacher().equals(courses.get(ch_st).getName())){
                            tmpt=i;
                        }

                    }
                    System.out.println("Student " + courses.get(ch_c).getStudent() + " now is study at " + courses.get(ch_c).getName()
                            + " which will be on the Schedule " + courses.get(ch_c).getPara() + ". Lector: " + teachers.get(tmpt).getTeacher()
                            + " Time: " + courses.get(ch_c).getTime());
                    break;*/
                case 4:
                    System.out.println("");
                    System.out.println("Courses:");
                   /*for (int i = 0; i<courses.size(); i++)
                       j.outp();

                    }*/

                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Teachers:");
                    for (String i : teachers.getTeacher()) {
                        System.out.println(i+" ");
                    }

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
            System.out.println("");
            head();
            x=in.nextInt();
        }

    }

    public static String readInput(String message) {

        System.out.println(message);

        return new Scanner(System.in).next();
    }
    public static void head(){
        System.out.println("Select, what do you want:");
        System.out.println("1: Look at all students");
        System.out.println("2: Add students");
        System.out.println("3: Add student to course");
        System.out.println("4: Look at all courses");
        System.out.println("5: Look at all teachers");
    }

}





