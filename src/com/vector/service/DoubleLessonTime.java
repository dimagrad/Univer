package com.vector.service;

public class DoubleLessonTime {
    public static String getTime(int doubleLesson){

        switch (doubleLesson) {
            case 1:
                return "Время проведения: 8.30 - 10.00";
            case 2:
                return "Время проведения: 10.30 - 12.00";
            case 3:
                return "Время проведения: 12.30 - 14.00";
            case 4:
                return "Время проведения: 14.30 - 16.00";
        }
        return "";
    }
}
