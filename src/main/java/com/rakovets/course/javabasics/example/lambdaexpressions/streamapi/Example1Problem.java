package com.rakovets.course.javabasics.example.lambdaexpressions.streamapi;

import com.rakovets.course.javabasics.example.lambdaexpressions.streamapi.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Example1Problem {
    public static void main(String[] args) {
        List<Student> group = List.of(
                new Student("Bill", "Snow", 30, 1000),
                new Student("Jon", "Week", 40, 1200),
                new Student("Pit", "Pen", 18, 2000),
                new Student("Alias", "White", 25, 1300)
        );

        // Task: print ll students
        printGroup1(group);

        // Task: print ll students
        printGroup2(group);

        // Task: filtered students by Criteria
        printFilteredGroupByCriteria(group);

        // Task: get all sum for fee.
        printGroupTotalFee(group);
    }

    private static void printGroup1(List<Student> group) {
        System.out.println("All students:");
        for (int i = 0; i < group.size(); i++) {
            System.out.println(group.get(i));
        }
    }

    private static void printGroup2(List<Student> group) {
        System.out.println("All students:");
        for (Student student : group) {
            System.out.println(student);
        }
    }

    private static void printFilteredGroupByCriteria(List<Student> group) {
        List<Student> filtered = new ArrayList<>();
        for (Student student : group) {
            if (fitsCriteria(student)) {
                filtered.add(student);
            }
        }

        System.out.println("Filtered students:");
        for (Student student : filtered) {
            System.out.println(student);
        }
    }

    private static void printGroupTotalFee(List<Student> group) {
        Integer totalFee = 0;
        for (Student student : group) {
            totalFee += student.getFee();
        }
        System.out.println("Total Fee: " + totalFee);
    }

    private static boolean fitsCriteria(Student student) {
        return student.getAge() < 25 && student.getFee() > 1400;
    }
}
