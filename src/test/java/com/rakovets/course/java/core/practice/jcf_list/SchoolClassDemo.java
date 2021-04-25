package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.schoolClass.*;

import java.util.ArrayList;

public class SchoolClassDemo {
    public static void main(String[] args) {
            Student ivanIvanov = new Student("Ivan", "Ivanov", 16, 7.8);
            Student sergeyPetrov = new Student("Sergey", "Petrov", 17, 4.5);
            Student artemKovalev = new Student("Artem", "Kovalev", 16, 8.8);
            Student vitaliyTitov = new Student("Vitaliy", "Titov", 17, 9.1);

            ArrayList<Student> students = new ArrayList<>();
            students.add(ivanIvanov);
            students.add(sergeyPetrov);
            students.add(artemKovalev);
            students.add(vitaliyTitov);

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

    public static void printStudent(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname() + ": age = " + student.getAge() + ", average mark = " + student.getAverageAnnualMark());
        }
    }
}
