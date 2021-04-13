package com.rakovets.course.java.core.practice.exception_handling;

public class Task02Demo {
    public static void main(String[] args) {
        try{
            Task02.throwArrayExeption();
        } catch (IndexOutOfBoundsException ex){
            System.out.println("Index is out of bound");
        }
    }
}
