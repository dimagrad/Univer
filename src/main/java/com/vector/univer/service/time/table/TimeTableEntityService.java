package main.java.com.vector.service.time.table;

import main.java.com.vector.entity.CourseEntity;
import main.java.com.vector.entity.TeacherEntity;
import main.java.com.vector.entity.TimeTableEntity;

public class TimeTableEntityService {

    public static TimeTableEntity createTimeTable(TeacherEntity teacherEntity, CourseEntity courseEntity) {

        return new TimeTableEntity(courseEntity, teacherEntity);
    }
}


