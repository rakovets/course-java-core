package com.rakovets.course.challenge.exception_handling;

public class Main {
    public static void main(String[] args) {
        Task1 first = new Task1();
        first.checkOnException();

        try {
            int age = Task3.checkAge(11);
            System.out.println(age);
        } catch (MyException ex) {
            System.out.println(ex.getAge());
            System.out.println(ex.getMessage());
            System.out.println(ex.fillInStackTrace());
        }

        try {
            float resultOfDivision = Task4.checkDivision(5,0);
            System.out.println(resultOfDivision);
        } catch (MyException2 ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.fillInStackTrace() + "\n");
        }

        try {
            Task5.writeValueInArray(13,6);
        } catch (MyException3 ex) {
            System.out.println("this array is less");
            System.out.println(ex.getStackTrace() + "\n\n");
        }

       try {
           Task6.calculationAndWritingInArray(-3,2);
       } catch (MyException4 ex) {
           System.out.println(ex.getMessage());
       }
    }
}
