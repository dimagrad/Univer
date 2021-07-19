package com.vector.univer.service.timetable;


import com.vector.univer.entity.CourseEntity;
import com.vector.univer.entity.TeacherEntity;
import com.vector.univer.entity.TimeTableEntity;

public class TimeTableEntityService {

    public static TimeTableEntity createTimeTable(TeacherEntity teacherEntity, CourseEntity courseEntity) {

        return new TimeTableEntity(courseEntity, teacherEntity);
    }
}


