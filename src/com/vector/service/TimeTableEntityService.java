package com.vector.service;

import com.vector.entity.CourseEntity;
import com.vector.entity.StudentEntity;
import com.vector.entity.TeacherEntity;
import com.vector.entity.TimeTableEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.TeacherMock;

import java.util.List;

public class TimeTableEntityService {
    public static TimeTableEntity createTimeTable(TeacherEntity teacherEntity, CourseEntity courseEntity) {

        return new TimeTableEntity(courseEntity, teacherEntity);
    }
}


