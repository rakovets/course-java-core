package com.rakovets.course.java.core.practice.exception_handling.task6;

public class ManyExceptions {
    int[] outOfBounds = new int[1];
    String outOfMemory = "Hello world!";
    String nullPointer = null;

    public void trowException(int i) {
        if (i == 0) {
            outOfBounds[1] = 1;
        } else if (i == 1) {
                nullPointer = nullPointer.concat(null);
        } else {
            while (true) {
                outOfMemory = outOfMemory.concat(outOfMemory);
            }
        }
    }

    public void catchException() throws Exception {
        try {
            for (int i = 0; i < 3; i++) {
                trowException(i);
            }
        } catch (IndexOutOfBoundsException | NullPointerException exception) {
            System.out.println(exception.getMessage());
        } catch (OutOfMemoryError error) {
            throw new OutOfMemoryError(error.getMessage());
        }
    }
}
