package com.vector;
import com.vector.entity.Course;
import com.vector.entity.Student;
import com.vector.entity.Teacher;

import java.util.*;
public class Univer {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

	ArrayList<Student> arrs = new ArrayList<>();
	arrs.add(new Student("Dima", 4, true, true));
    arrs.add(new Student("Oleg", 3, true, true));
    arrs.add(new Student("Danil", 4, true, true));

	ArrayList<Course> arrsub = new ArrayList<>();
	arrsub.add(new Course("Algebra",5,1 ,null, ""));
	arrsub.add(new Course("Geometry",5,2,null, ""));
    arrsub.add(new Course("Phyzics",5,3 ,null, ""));
    arrsub.add(new Course("English",5,4 ,null, ""));


    ArrayList<Teacher> arrp = new ArrayList<>();
    arrp.add(new Teacher("Nikita", 10000, arrsub.get(0)));
    arrp.add(new Teacher("Ivan", 10000, arrsub.get(1)));
    arrp.add(new Teacher("Maria", 10000, arrsub.get(2)));
    arrp.add(new Teacher("Petr", 10000, arrsub.get(3)));

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

                    for (Student k : arrs) {
                        k.outp();
                    }
                    break;

                case 2:
                    //arrs.add(new Student(Student.setName(), Student.setKurs(), Student.setForma(), Student.setStip()));
                    arrs.add(new Student(readInput("Enter name"), Integer.parseInt(readInput("Enter course")),
                            Boolean.parseBoolean(readInput("enter form (true or false)")),
                            Boolean.parseBoolean(readInput("enter stipend (true or false)"))));
                    break;
                case 3:
                    System.out.println("Which student would you like to add?(number)");

                    for (Student k : arrs) {
                        k.outp();
                    }
                    int ch_st = in.nextInt();
                    ch_st--;
                    while(ch_st+1>arrs.size()){
                        System.out.println("incorrect, please, enter correct");
                        for (Student k : arrs) {
                            k.outp();
                        }
                        ch_st=in.nextInt();
                    }
                    System.out.println("Which course would you like to study?(number)");

                    for (Course j : arrsub) {
                        j.outp();
                    }
                    int ch_c = in.nextInt();
                    ch_c--;
                    while(ch_c+1>arrsub.size()){
                        System.out.println("incorrect, please, enter correct");
                        for (Student k : arrs) {
                            k.outp();
                        }
                        ch_c=in.nextInt();
                    }
                    Course tmpCourse = arrsub.get(ch_c);
                    tmpCourse.setStudent(arrs.get(ch_st));

                    int tmpt = 0;
                    for (int i = 0; i<arrp.size(); i++){
                        if(arrp.get(i).getName().equals(arrsub.get(ch_st).getName())){
                            tmpt=i;
                        }

                    }
                    System.out.println("Student " + arrsub.get(ch_c).getStudent().getName() + " now is study at " + arrsub.get(ch_c).getName()
                            + " which will be on the Schedule " + arrsub.get(ch_c).getPara() + ". Lector: " + arrp.get(tmpt).getName()
                            + " Time: " + arrsub.get(ch_c).getTime());
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Courses:");
                    for (Course j : arrsub) {
                        j.outp();
                    }
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Teachers:");
                    for (Teacher i : arrp) {
                        i.outp();
                    }

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





