package com.vector.mock;

import com.vector.entity.CourseEntity;
import com.vector.service.CourseEntityService;

import java.util.ArrayList;
import java.util.List;

public class CourseMock {

    public static List<CourseEntity> getCourses() {

        List<CourseEntity> courseMock = new ArrayList<>();

        courseMock.add(CourseEntityService.createCourse("Алгебра",5,1 ));
        courseMock.add(CourseEntityService.createCourse("Геометрия",5,2));
        courseMock.add(CourseEntityService.createCourse("Физика",5,3 ));
        courseMock.add(CourseEntityService.createCourse("Немецкий",5,4 ));
        courseMock.add(CourseEntityService.createCourse("Химия",5,4 ));
        courseMock.add(CourseEntityService.createCourse("Физ-ра",5,4 ));

        return courseMock;

    }

//    public List<CourseMock> getCourse(){
//        return courseMock;
//    }
//
//    public String getName(){
//
//        return name;
//    }
//
//    public String getDate(){
//
//        return date;
//    }

//    public int getPTE(){
//
//        return PTE;
//    }
//
//    public int getPara(){
//
//        return para;
//    }
//
//    public String getTime(){
//        addTime();
//        return date;
//    }
//
//    public void setStudent(StudentMock t) {
//        this.newS = t;
//        this.PTE--;
//
//    }
    //public StudentMock getStudent(){

        //return this.newS;
    //}

 /*

    public void outp(){

        System.out.println("Название пары " + getName()+" Доступных мест для входа на курс: " + getPTE()
                +" Position: " + getPara() + " Time: " + getTime());
    }
*/
}
