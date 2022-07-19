package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school.classroom.Person;
import com.rakovets.course.java.core.practice.jcf_list.school.classroom.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.school.comparators_class.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.school.comparators_class.AverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.school.comparators_class.FullNameComparator;

import java.util.ArrayList;
import java.util.List;

public class SchoolDemo {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("Dima", "Ivanov", 15, 9.2));
        students.add(new Person("Sasha", "Sergeevich", 16, 7.8));
        students.add(new Person("Nastya", "Petrova", 16, 9.8));
        students.add(new Person("Vladislav", "Petrov", 17, 8.5));
        students.add(new Person("Dima", "Rozov", 15, 8.0));

        students.sort(new AgeComparator());
        System.out.println(students);

        students.sort(new FullNameComparator());
        System.out.println(students);

        students.sort(new AverageAnnualMarkComparator());
        System.out.println(students);

        SchoolClass a = new SchoolClass();
        System.out.println(a.getBestStudent(students));
    }
}
