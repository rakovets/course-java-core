package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Task06 {
    public int randomException(String str, int[] array, int number) throws Exception {
        Random random = new Random();
        int choose = random.nextInt(5);
        int digit = 9;
        switch (choose) {
            case 1:
                if (str == null) {
                    throw new NullPointerException();
                }
                break;
            case 2:
                int index = array.length + 1;
                if (index > array.length) {
                    throw new IndexOutOfBoundsException();
                }
                break;
            case 3:
                if (number == 0) {
                   throw new ArithmeticException();
                }
                digit /= number;
                break;
        }
        return 0;
    }
}
