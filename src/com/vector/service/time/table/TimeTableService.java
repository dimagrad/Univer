package com.vector.service.time.table;

import com.vector.entity.CourseEntity;
import com.vector.entity.StudentEntity;
import com.vector.entity.TeacherEntity;
import com.vector.entity.TimeTableEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.TeacherMock;

import java.util.ArrayList;
import java.util.List;

public class TimeTableService {

    public static List<TimeTableEntity> formTimeTable() {

        List<TeacherEntity> teachers = new ArrayList<>(TeacherMock.getTeachers());
        List<CourseEntity> courses = new ArrayList<>(CourseMock.getCourses());
        List<TimeTableEntity> timeTables = new ArrayList<>();

        for (CourseEntity cours : courses) {
            for (TeacherEntity teacher : teachers) {
//                TODO rework with util class
                if (cours.equals(teacher)) {
                    timeTables.add(TimeTableEntityService.createTimeTable(teacher, cours));
                }
            }
        }

        return timeTables;
    }
}
