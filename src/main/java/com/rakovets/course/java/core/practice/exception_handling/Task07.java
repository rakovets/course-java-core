//package com.rakovets.course.java.core.practice.exception_handling;
//
//import java.util.Random;
//
//public class Task07 {
//    public static void main(String[] args) {
//        try {
//            randomNumMethod();
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This is finally");
//        }
//    }
//
//    public static void randomNumMethod() throws InterruptedException {
//        Random random = new Random();
//        int i = random.nextInt(1);
//        if (i == 0) {
//            throw new InterruptedException("Interrupted format exception");
//        }
//    }
//}
