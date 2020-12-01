package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.university.Student;
import com.rakovets.course.javabasics.practice.lambdaexpressions.university.University;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UniversityDemo {
    public static void main(String[] args) {
        Collection<Student> university = List.of(
                new Student("Bill", "Lee", "history", "first"),
                new Student("Mark", "Black", "law", "second"),
                new Student("Ann", "Smith", "law", "first"),
                new Student("Emily", "Harris", "history", "second"),
                new Student("Jack", "Wilson", "math", "third"),
                new Student("Lily", "King", "law", "third"),
                new Student("John", "Brown", "math", "first"),
                new Student("Jessica", "Young", "math", "third"),
                new Student("James", "White", "history", "third"),
                new Student("Leo", "Johnson", "law", "first"),
                new Student("David", "Snow", "math", "first"));
        TreeMap<String, Map<String, List<Student>>> sortedStudents = University.getStudentsGroupedBySpecialtiesAndYearOfStudy(university);
        for (Map.Entry<String, Map<String,List<Student>>> item : sortedStudents.entrySet()) {
            System.out.println(item.getKey());
            Map<String, List<Student>> students1 = item.getValue();
            for (Map.Entry<String, List<Student>> element : students1.entrySet()) {
                System.out.println(element.getKey());
                for (Student student : element.getValue()) {
                    System.out.println(student);
                }
            }
        }
        Map<String, Map<Boolean, List<Student>>> students = University.isStudentOnSpecialty(university, "law");
        for (Map.Entry<String, Map<Boolean, List<Student>>> item : students.entrySet()) {
            System.out.println("Year of study: " + item.getKey());
            Map<Boolean, List<Student>> students1 = item.getValue();
            for (Map.Entry<Boolean, List<Student>> element : students1.entrySet()) {
                if (element.getKey()) {
                    System.out.println("Students of this specialty:");
                    for (Student student : element.getValue()) {
                        System.out.println(student);
                    }
                } else {
                    System.out.println("Students of other specialties:");
                    for (Student st : element.getValue()) {
                        System.out.println(st);
                    }
                }
            }
        }
    }
}
