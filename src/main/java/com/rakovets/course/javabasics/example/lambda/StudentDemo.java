package com.rakovets.course.javabasics.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> group = new ArrayList();
        group.add(new Student(19, "Student1"));
        group.add(new Student(20, "Student2"));
        group.add(new Student(15, "Student3"));
        group.add(new Student(22, "Student4"));
        group.add(new Student(21, "Student5"));
        group.add(new Student(19, "Student6"));
        group.add(new Student(72, "Student7"));
//        group.add(new Student(22, "MajorStudent", new Student.IdentityCard("23", "32")));
        Student.IdentityCard test = new Student(1, "").new IdentityCard();
        display(group);
//        Comparator<Student> ageComparator = (student, t1) -> {
//            UnaryOperator op = (x) -> {
//                return System.out::println;
//            };
//        }
//        group.sort(ageComparator);
//        display(group);
//        group.add(new Student(12, "Student7"));
//        group.sort(ageComparator);
    }

    private static void display(List<Student> group) {
        System.out.println("Group:");
        for (Student student : group) {
            System.out.println(student);
        }
    }

    // Calculator for Terminal

    interface Operation {

    }
    /*  Menu: 1. +
              2. -
              3. /
              4. *
        Enter 1 number:
        Enter 2 number:
        Print result

        1. class AnonymousCalculator
        2. class LambdaCalculator

     */


}
