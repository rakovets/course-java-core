package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.schoolClass.*;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            students.add(new Student("Ivan", "Ivanov", 16, 7.8));
            students.add(new Student("Sergey", "Petrov", 17, 4.5));
            students.add(new Student("Artem", "Kovalev", 16, 8.8));
            students.add(new Student("Vitaliy", "Titov", 17, 9.1));

            System.out.println("\nThe best student:");
            Student bestStudent = SchoolClass.getBestStudent(students);
            System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + ": age = " + bestStudent.getAge() + ", average mark = " + bestStudent.getAverageAnnualMark());

            System.out.println("\nThis is a list sorted by name and surname:");
            students.sort(new StudentNameComparator().thenComparing(new StudentSurnameComparator()));
            printStudent(students);

            System.out.println("\nThis is a list sorted by age:");
            students.sort(new StudentAgeComparator());
            printStudent(students);

            System.out.println("\nThis is a list sorted by average annual mark:");
            students.sort(new StudentAverageAnnualMarkComparator());
            printStudent(students);
    }

    public static void printStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + ": age = " + student.getAge() + ", average mark = " + student.getAverageAnnualMark());
        }
    }
}
