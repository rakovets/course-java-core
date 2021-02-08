package com.rakovets.course.java.core.practice.jcf.list;

import com.rakovets.course.java.core.practice.jcf.list.class_project.*;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Student> dreamTeam = new ArrayList<>();
        dreamTeam.add(new Student("Alex", "Smitty", 10, 7.0));
        dreamTeam.add(new Student("Ivan", "Ivanov", 11, 5.3));
        dreamTeam.add(new Student("Deborah", "Siesta", 9, 9.1));
        dreamTeam.add(new Student("Alex", "Swanson", 11, 7.4));
        dreamTeam.add(new Student("Alexa", "Narrow", 10, 3.4));

        SchoolClass fiveA = new SchoolClass(dreamTeam);
        fiveA.printClassList();

        System.out.println("Best " + fiveA.getBestStudent(dreamTeam) + "\n");

        dreamTeam.sort(new StudentComparatorByName().thenComparing(new StudentComparatorBySurname()));
        System.out.println("Student list sorted by name and surname: ");
        fiveA.printClassList();

        dreamTeam.sort(new StudentComparatorByAge());
        System.out.println("Student list sorted by age: ");
        fiveA.printClassList();

        dreamTeam.sort(new StudentComparatorByAverageMark());
        System.out.println("Student list sorted by average mark: ");
        fiveA.printClassList();
    }
}
