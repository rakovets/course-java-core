package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoStudents {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        Person michel = new Person("Michel", "Williams", 15, 9.8);
        Person mishel = new Person("Mishel", "Willi", 15, 9.8);
        Person garry = new Person("Garry", "Peters", 16, 7.9);
        Person oliver = new Person("Oliver", "Martin", 14, 8.5);
        Person kate = new Person("Kate", "Grant", 13, 8.4);
        students.add(michel);
        students.add(mishel);
        students.add(garry);
        students.add(oliver);
        students.add(kate);
        Comparator<Person> comparatorNameSurname = new NameWithSurnameComparator();
        students.sort(comparatorNameSurname);
        for (Person a : students) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Person> comparatorPersonAge = new AgePersonComparator();
        students.sort(comparatorPersonAge);
        for (Person a : students) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Person> comparatorAverageAnnualMark = new AverageAnnualMarkComparator();
        students.sort(comparatorAverageAnnualMark);
        for (Person a : students) {
            System.out.println(a);
        }
        System.out.println("____________");
        SchoolClass school = new SchoolClass(students);
        for (Person a : students) {
            System.out.println(a);
        }
        System.out.println("____________");
        school.getBestStudent(students);
        for (Person a : students) {
            System.out.println(a);
        }
    }
}
