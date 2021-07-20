package com.vector.univer;

import com.vector.univer.start.UserDialog;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Univer {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        UserDialog userDialog = new UserDialog();
        userDialog.startDialog();
    }
}





