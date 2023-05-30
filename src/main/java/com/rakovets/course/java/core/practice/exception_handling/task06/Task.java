package com.rakovets.course.java.core.practice.exception_handling.task06;

import java.io.IOException;
import java.text.ParseException;

public class Task {

    public void randomException() throws IOException, ParseException, IllegalCallerException {
        int num = (int) (Math.random() * 3) + 1;
        if (num == 1) {
            throw new IOException("IOException");
        } else if (num == 2) {
            throw new IllegalCallerException("IllegalCallerException");
        } else throw new ParseException("ParseException", 6);



    }
}
