package com.rakovets.course.java.core.practice.jcf_collection.list.myclas;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("katya", "kuznecova", 17, 5.0));
        students.add(new Person("vera", "morozova", 21, 4.3));
        students.add(new Person("nika", "kolbaskina", 18, 3.6));
        students.add(new Person("victory", "pomidorova", 20, 4.9));

        SchoolClass schoolClass = new SchoolClass(students);
        for (Person student : students) System.out.println(student);
        System.out.println("\n");
        System.out.println("Best student: " + schoolClass.getBestStudent(students));
        System.out.println("\n");

        students.sort(new SortAgeComparator());
        System.out.println("SortAge ");
        for (Person student : students) System.out.println(student);
        System.out.println("\n");

        students.sort(new SortAnnualMarkComparator());
        System.out.println("AnnualMark");
        for (Person student : students) System.out.println(student);
        System.out.println("\n");

        students.sort(new SortFirstNameAndLastName());
        System.out.println("FirstNameAndLastName");
        for (Person student : students) System.out.println(student);
        System.out.println("\n");
    }
}
