package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.university.Student;
import com.rakovets.course.java.core.practice.lambda_expressions.university.StudentSorter;

import java.util.*;

public class StudentSorterDemo {
    public static void main(String[] args) {
        List<Student> example = new ArrayList<>();
        Collections.addAll(example,
                new Student("Alex", "Swanson", "philosophy", 2),
                new Student("Sarah", "Willard", "engineering", 2),
                new Student("Deborah", "Schwarzwald", "economics", 1),
                new Student("Samanta", "Lilly", "economics", 2),
                new Student("Charles", "Connor", "philosophy", 5));

        Map<Integer, List<Student>> byStudyYear = StudentSorter.getByStudyYear(example);

        for(Map.Entry<Integer, List<Student>> item : byStudyYear.entrySet()) {
            System.out.println(item.getKey() + " year of study: ");
            for(Student student : item.getValue()) {
                System.out.println(student);
            }
            System.out.println();
        }

        Map<String, Map<Integer, List<Student>>> bySpecialityAndYear = StudentSorter.getBySpecialityAndYear(example);

        for(Map.Entry<String, Map<Integer, List<Student>>> item : bySpecialityAndYear.entrySet()) {
            System.out.println(item.getKey().toUpperCase(Locale.ROOT) + ": ");
            for(Map.Entry<Integer, List<Student>> map : item.getValue().entrySet()) {
                System.out.println(map.getKey() + " year of study: ");
                for(Student student : map.getValue()) {
                    System.out.println(student);
                }
                System.out.println();
            }
        }
    }
}
