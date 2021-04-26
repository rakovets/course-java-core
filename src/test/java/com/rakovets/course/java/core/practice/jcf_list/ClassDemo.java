package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.project_class.*;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Student> dreamTeam = new ArrayList<>();
        dreamTeam.add(new Student("Nikolai", "Rudenko", 22, 8.0));
        dreamTeam.add(new Student("Lilia", "Petriman", 21, 9.3));
        dreamTeam.add(new Student("John", "Show", 20, 8.1));
        dreamTeam.add(new Student("Vasiliy", "Pupkin", 23, 6.4));
        dreamTeam.add(new Student("Alex", "Ivanov", 21, 5.9));

        SchoolClass fiveA = new SchoolClass(dreamTeam);
        fiveA.printClassList();

        System.out.println("Best " + fiveA.getBestStudent(dreamTeam) + "\n");

        dreamTeam.sort(new ComparatorStudentName().thenComparing(new ComparatorStudentSurname()));
        System.out.println("Student list sorted by name and surname: ");
        fiveA.printClassList();

        dreamTeam.sort(new ComparatorStudentAge());
        System.out.println("Student list sorted by age: ");
        fiveA.printClassList();

        dreamTeam.sort(new ComparatorStudentAverageMark());
        System.out.println("Student list sorted by average mark: ");
        fiveA.printClassList();
    }
}
