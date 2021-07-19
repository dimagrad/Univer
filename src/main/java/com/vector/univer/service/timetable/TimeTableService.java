package com.vector.univer.service.timetable;

import com.vector.univer.entity.CourseEntity;
import com.vector.univer.entity.TeacherEntity;
import com.vector.univer.entity.TimeTableEntity;
import com.vector.univer.mock.CourseMock;
import com.vector.univer.mock.TeacherMock;

import java.util.ArrayList;
import java.util.List;

public class TimeTableService {

    public static List<TimeTableEntity> formTimeTable() {

        List<TeacherEntity> teachers = new ArrayList<>(TeacherMock.getTeachers());
        List<CourseEntity> courses = new ArrayList<>(CourseMock.getCourses());
        List<TimeTableEntity> timeTables = new ArrayList<>();

        for (CourseEntity cours : courses) {
            for (TeacherEntity teacher : teachers) {

                if (cours.equals(teacher)) {
                    timeTables.add(TimeTableEntityService.createTimeTable(teacher, cours));
                }
            }
        }

        return timeTables;
    }
}
