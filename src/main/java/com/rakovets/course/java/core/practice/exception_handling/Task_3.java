package com.rakovets.course.java.core.practice.exception_handling;

public class Task_3 {
    public static void main(String[] args) {
    int x = 25;
    try {
        if (x < 30) {
          throw new RootException(x);
        }  else System.out.println(x - 30);
    } catch (RootException ex) {
        ex.printStackTrace();
        }
    }
}
