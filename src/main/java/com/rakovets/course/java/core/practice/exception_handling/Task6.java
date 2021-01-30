package com.rakovets.course.java.core.practice.exception_handling;

import java.util.NoSuchElementException;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        try {
            getException();
        } catch (NullPointerException | NoSuchElementException ex) {
            ex.printStackTrace(System.out);
        } catch (ArrayIndexOutOfBoundsException arx) {
            System.out.println("ArrayIndexOutOfBoundsException: " + arx.getMessage());
        }
    }

    public static void getException() throws NullPointerException, NoSuchElementException, ArrayIndexOutOfBoundsException {
        Random random = new Random();
        int result = random.nextInt(10);

        if (result <= 3) {
            throw new NullPointerException();
        } else if (result <= 6) {
            throw new NoSuchElementException();
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
