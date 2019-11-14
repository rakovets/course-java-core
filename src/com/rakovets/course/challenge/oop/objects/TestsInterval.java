package com.rakovets.course.challenge.oop.objects;
import java.util.Scanner;

public class TestsInterval{
    public static void main(String[] args) {
       //Testing constructors
       Interval timeSeconds = new Interval(42315);
       timeSeconds.display();
       Interval timeUsual = new Interval(21, 58,49);
       timeUsual.display();

       //Test for getters
       System.out.printf("H: %d, M: %d, S: %d\n", timeSeconds.getHours(), timeSeconds.getMinutes(), timeSeconds.getSeconds());

       // Test for 'getAllSeconds'
       System.out.printf("S: %d\n", timeUsual.getAllSeconds());
    }
}
