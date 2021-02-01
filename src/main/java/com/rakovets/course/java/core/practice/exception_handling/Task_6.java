package com.rakovets.course.java.core.practice.exception_handling;

import java.io.FileNotFoundException;

public class Task_6 {
    public static void main(String[] args) {
        try {
            randomExceptions();
        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException e) {
            System.out.println("File doesn't exist");
        } catch (NullPointerException e) {
            System.out.println("String is null");
        }
    }

    public static void randomExceptions() throws FileNotFoundException, ArrayIndexOutOfBoundsException, NullPointerException {
        switch((int) (Math.random() * 3)) {
            case 1:
                throw new FileNotFoundException();
            case 2:
                throw new ArrayIndexOutOfBoundsException();
            default:
                throw new NullPointerException();
        }
    }
}

