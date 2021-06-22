package com.vector.wrapper;

import com.vector.entity.CourseEntity;
import com.vector.entity.StudentEntity;
import com.vector.entity.TeacherEntity;
import com.vector.entity.TimeTableEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.TeacherMock;
import com.vector.mock.TimeTableMock;
import com.vector.service.TimeTableEntityService;

import java.util.ArrayList;
import java.util.List;

public class TimeTableWrapper {
    private List<TeacherEntity> teachers;
    private List<TimeTableEntity> timeTableEntities;
    private List<CourseEntity> courses;
    public TimeTableWrapper(List<TimeTableEntity> timeTableEntities){

        this.timeTableEntities = timeTableEntities;
    }
    public void createTimeTable() {
        teachers = new ArrayList<>(TeacherMock.getTeachers());
        courses = new ArrayList<>(CourseMock.getCourses());
        for (CourseEntity cours : courses) {
            for (TeacherEntity teacher : teachers) {
                if (cours.equals(teacher)) {
                    System.out.println(teacher.getName());
                    TimeTableEntityService.createTimeTable(teacher, cours);
                }
            }
        }

    }
    public void printTimeTable() {
        createTimeTable();
        System.out.println("Расписание: \n");

        for (TimeTableEntity timeTableEntity  : timeTableEntities) {

            System.out.println(timeTableEntity);
        }
    }
}
