package com.vector.service.time.table;

import com.vector.entity.CourseEntity;
import com.vector.entity.TeacherEntity;
import com.vector.entity.TimeTableEntity;

public class TimeTableEntityService {

    public static TimeTableEntity createTimeTable(TeacherEntity teacherEntity, CourseEntity courseEntity) {

        return new TimeTableEntity(courseEntity, teacherEntity);
    }
}


