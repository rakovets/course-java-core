package com.rakovets.course.java.core.practice.exception_handling;

import java.util.Random;

public class Exceptions {
    public void Task01() throws NullPointerException {
        String str = null;
        int stringLength = str.length();
    }

    public void Task02() {
        int[] array = new int[5];
        try {
            int currentNumber = array[5];
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void Task03() throws ExceptionTask03 {
        throw new ExceptionTask03("This exception\n");
    }

    public void Task04() {
        throw new ExceptionTask04("New exception\n");
    }

    public void Task05() {
        String string = null;
        try {
            if (string == null) {
                throw new Exception("NullPointerExceptionNumber2");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void Task06() throws Exception {
        Random random = new Random();
        int  randomException = random.nextInt(3);
        switch (randomException) {
            case 0:
                throw new NullPointerException();
            case 1:
                throw new ArrayIndexOutOfBoundsException();
            default:
                throw new NoSuchMethodException();
        }

    }

    public void Task07() {
        try {
            int number = (int) (Math.random() * 2);
            if (number == 0) {
                throw new NullPointerException();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
