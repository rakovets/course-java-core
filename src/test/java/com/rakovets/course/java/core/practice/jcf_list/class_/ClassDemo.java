package com.rakovets.course.java.core.practice.jcf_list.class_;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("Ivan", "Ivanov", 16, 8.5));
        students.add(new Person("Petr", "Petrov", 17, 5.5));
        students.add(new Person("Alex", "Smirnov", 15, 8.4));
        students.add(new Person("Ivan", "Semenov", 18, 6.5));
        students.add(new Person("Ivan", "Petrov", 16, 8.2));
        students.add(new Person("Ivanka", "Ivanova", 17, 9.4));

        students.sort(new NameAndSurnameComparator());
        System.out.println("Sorted by name and surname: " + students);

        students.sort(new AgeComparator());
        System.out.println("Sorted by age: " + students);

        students.sort(new AverageAnnualMarkComparator());
        System.out.println("Sorted by average annual mark: " + students);

        SchoolClass schoolClass = new SchoolClass();
        System.out.println("Best student: " + schoolClass.getBestStudent(students));
    }
}
