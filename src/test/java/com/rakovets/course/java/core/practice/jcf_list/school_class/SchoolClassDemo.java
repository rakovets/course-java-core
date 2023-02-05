package com.rakovets.course.java.core.practice.jcf_list.school_class;

import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonFirstNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonSurnameComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClassDemo {
    public static void main(String[] args) {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(
                new Person("Marilyn", "Monroe", 18, 6.9),
                new Person("Patric", "Stewart", 17, 8.2),
                new Person("Dev", "Patel", 16, 4.5),
                new Person("Sean", "Penn", 15, 5.6),
                new Person("Brad", "Pitt", 15, 7.5),
                new Person("Nicolas", "Cage", 17, 6.6),
                new Person("Jane", "Levy", 16, 8.9),
                new Person("Scarlett", "Johansson", 13, 8.1),
                new Person("Maryl", "Streep", 18, 7.7)));
        SchoolClass schoolClass = new SchoolClass(students);

        System.out.println("sort by First name and Surname: \n");
        students.sort(new PersonFirstNameComparator().thenComparing(new PersonSurnameComparator()));
        print(schoolClass);

        System.out.println("sort by Age: \n");
        students.sort(new PersonAgeComparator());
        print(schoolClass);

        System.out.println("sort by Average Annual Mark: \n");
        students.sort(new PersonAverageAnnualMarkComparator());
        print(schoolClass);
    }

    public static void print(SchoolClass schoolClass) {
        for (Person students : schoolClass.getStudents()) {
            System.out.println(students.getFirstName() + " " + students.getSurname()
                    + " " + students.getAge() + " " + students.getAverageAnnualMark());
        }
        System.out.println(" ");
    }
}

