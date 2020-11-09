package com.rakovets.course.javabasics.practice.exceptionhandling;

import com.rakovets.course.javabasics.practice.exceptionhandling.task06.ThreeExeptions;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        ThreeExeptions obj = new ThreeExeptions();
        try {
            obj.getRandomExeption();
        }catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e1){
            System.out.println("Index out of Bounds  ");
        } catch (ArithmeticException ex2){
            System.out.println("Can't do devision on zero ");
        }
    }
}
