package com.rakovets.course.java.core.practice.exception_handling.Task7;

public class Task7 {
    public void fillIndex(int[] scores, int index) throws Task7Exception, ArrayIndexOutOfBoundsException {
        if (index >= scores.length) {
            throw new ArrayIndexOutOfBoundsException("You are out of bounds");
        } else {
            for (int i = 0; i < scores.length; i++) {
                if(scores[i] == 0) {
                    throw new Task7Exception("There should be no zero! Zero is not a score!");
                }
            }
        }
    }
}
