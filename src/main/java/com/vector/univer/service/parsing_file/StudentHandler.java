package com.vector.univer.service.parsing_file;

import com.vector.univer.entity.StudentEntity;
import com.vector.univer.service.student.StudentEntityService;

import java.util.regex.Pattern;

public class StudentHandler {

    String[] fields;
    private Pattern p = Pattern.compile("'");
    public StudentEntity handleStudent(String string){

        fields = p.split(string);
        if (validation(fields)) {

            return StudentEntityService.createStudent(fields[1], Integer.parseInt(fields[3]), fields[5]);
        } else {

            System.out.println("Неверный формат данных у " + fields[1]);
        }
        return null;
    }

    public boolean validation(String[] a){

        if((a[0].contains("Имя"))&(a[2].contains("Возраст"))&(a[4].contains("Номер"))){

            return true;

        }else{

            return false;

        }
    }
}
