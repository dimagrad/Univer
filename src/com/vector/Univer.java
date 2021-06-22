package com.vector;
import com.vector.mock.*;

import java.util.*;
public class Univer {

    public static String readInput() {

        //System.out.println(message);

        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        CourseMock courses = new CourseMock();
        UserDialog userDialog = new UserDialog();
        userDialog.StartDialog();


    }
}





