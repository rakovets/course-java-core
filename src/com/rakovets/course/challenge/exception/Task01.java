package com.rakovets.course.challenge.exception;

public class Task01 {
    public static void main(String[] args) {
        try {
            int[] cat = new int[7];
            cat[8] = 980;
            System.out.println(cat[8]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.printf("You have exception %s ", ex);
            ex.printStackTrace();
        }
    }
}

