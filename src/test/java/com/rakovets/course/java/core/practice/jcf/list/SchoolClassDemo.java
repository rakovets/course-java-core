package com.rakovets.course.java.core.practice.jcf.list;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("katya", "kuznecova", 17, 5.0));
        students.add(new Student("vera", "morozova", 18, 4.3));
        students.add(new Student("nika", "kolbaskina", 21, 3.6));
        students.add(new Student("victory", "pomidorova", 20, 4.9));
        SchoolClass schoolClass = new SchoolClass(students);

        students.sort(new StudentComparatorByFirstNameAndLastName());

        students.sort(new StudentComparatorByAge());

        students.sort(new StudentComparatorByAverageMark());

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Best student: " + schoolClass.getBestStudent(students));
    }
}
