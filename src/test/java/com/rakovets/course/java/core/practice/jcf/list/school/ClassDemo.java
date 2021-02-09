package com.rakovets.course.java.core.practice.jcf.list.school;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Petya", "Petechkin", 15, 5.0));
        studentList.add(new Student("Vasya", "Vasechkin", 14, 4.3));
        studentList.add(new Student("Kolya", "Kolechkin", 13, 3.6));
        studentList.add(new Student("Andrey", "Andreechkin", 15, 5.0));
        studentList.add(new Student("Andrey", "Wasechkin", 16, 3.2));

        SchoolClass schoolClass = new SchoolClass(studentList);
        System.out.println("Best student: " + schoolClass.getBestStudent(studentList) + "\n");

        studentList.sort(new CompareByName().thenComparing(new CompareByLastName()));

        studentList.sort(new CompareByAge());

        studentList.sort(new CompareByAverageMark());

        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
