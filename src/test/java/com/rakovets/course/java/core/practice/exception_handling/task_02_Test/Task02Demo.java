package com.rakovets.course.java.core.practice.exception_handling.task_02_Test;

import com.rakovets.course.java.core.practice.exception_handling.task_02.Task02;

public class Task02Demo {
    public static void main(String[] args) {
        try{
            Task02.throwArrayExeption();
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Index is out of bound");
        }
    }
}
