package com.vector.service;

import com.vector.mock.CourseMock;
import com.vector.mock.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TimeTableService {

    private CourseMock courseMock = new CourseMock();
    private Teacher teachers = new Teacher();
    private List<TimeTableService> timetable;
    CourseMock courseout;
    Teacher teacherout;

    public TimeTableService(){

    }
    public TimeTableService(CourseMock c, Teacher t) {


       /* timetable = new ArrayList<>();

        for (CourseMock courseMock1 : courseMock.getCourse()) {

            for (Teacher i : teachers.getTeacher()) {

                boolean l = courseMock1.getName().equals(i.getCourse());
                if (l) {

                    timetable.add(new TimeTableService(courseMock1, i ));

                }
            }
        }*/
    }

    public List<TimeTableService> getTimeTable(){

        return timetable;

    }

    public void outPut(){

//        System.out.println("Предмет :" + courseout.getName() + " Пара: " + courseout.getPara() + " Время: "
//                + courseout.getTime() + " Преподаватель:" + teacherout.getName());

    }
}
