package com.vector.univer.wrapper;

import com.vector.univer.entity.TimeTableEntity;

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
