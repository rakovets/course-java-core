package com.rakovets.course.util.school;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolDemo {
    public static void main(String[] args) {
        AgeComparator comp1 = new AgeComparator();
        AverageMarkComparator comp2 = new AverageMarkComparator();
        Comparator<Student> comp3 = new NameComparator().thenComparing(new SurnameComparator());
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Karl", "Kavinsky", 16, 8.4));
        listOfStudents.add(new Student("Genri", "Potter", 15, 7.2));
        listOfStudents.add(new Student("James", "braun", 15, 7.8));

        System.out.println("Best sudent:");
        System.out.println(SchoolUtil.getBestStudent(listOfStudents).toString());
        System.out.println("Sorting list with students:");
        listOfStudents.sort(comp2);
        SchoolUtil.printList(listOfStudents);
    }
}
