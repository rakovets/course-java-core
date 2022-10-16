package com.rakovets.course.java.core.practice.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task07 {
    public void checkingFile() throws FileNotFoundException, RuntimeException {
        File f = new File("D://java/file.txt");
        FileReader fr = new FileReader(f);

        int dividend = 7;
        int divisor = 0;
        if (divisor == 0) {
            throw new ArithmeticException("You cannot divide by zero!");
        } else {
            int quotient = dividend / divisor;
        }
    }
}
