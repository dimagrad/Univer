package com.vector.wrapper;

import com.vector.entity.CourseEntity;
import com.vector.entity.TeacherEntity;
import com.vector.entity.TimeTableEntity;
import com.vector.mock.CourseMock;
import com.vector.mock.TeacherMock;
import com.vector.service.time.table.TimeTableEntityService;

import java.util.ArrayList;
import java.util.List;

public class TimeTableWrapper {

    private List<TimeTableEntity> timeTableEntities;

    public TimeTableWrapper(List<TimeTableEntity> timeTableEntities){

        this.timeTableEntities = timeTableEntities;
    }

    public void printTimeTable() {

        System.out.println("Расписание: \n");

        for (TimeTableEntity timeTableEntity  : timeTableEntities) {

            System.out.println(timeTableEntity);
        }
    }
}
