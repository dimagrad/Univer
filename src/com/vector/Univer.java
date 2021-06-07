package com.vector;
import com.vector.entity.Course;
import com.vector.entity.Student;
import com.vector.entity.Teacher;

import java.util.*;
public class Univer {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<Teacher> arrp = new ArrayList<>();
	arrp.add(new Teacher("Nikita", 10000));
	arrp.add(new Teacher("Ivan", 10000));
	arrp.add(new Teacher("Maria", 10000));
	arrp.add(new Teacher("Petr", 10000));
	System.out.println("Teachers:");
	for (Teacher i: arrp){
	    i.outp();
        }

	ArrayList<Student> arrs = new ArrayList<>();
	arrs.add(new Student("Dima", 6, true, true));

	ArrayList<Course> arrsub = new ArrayList<>();
	arrsub.add(new Course("Algebra",5,2 ));
	arrsub.add(new Course("Geometry",5,1 ));
    arrsub.add(new Course("Phyzics",5,4 ));
    arrsub.add(new Course("English",5,3 ));
        System.out.println("");
        System.out.println("Courses:");
        for (Course j: arrsub){
         j.outp();
        }

	ArrayList<Schedule> schedules = new ArrayList<>();
	schedules.add(new Schedule());

	for (Schedule y: schedules){

    }
    }
}





