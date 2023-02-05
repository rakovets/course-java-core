package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsAverageAnnualMark;
import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsFullNameComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClassDemo {
    public static void main(String[] args) {
        Person dzmitry = new Person("Dzmitry", "Krasiuk", 17, 8.3);
        Person alexander = new Person("Alexander", "Braim", 16, 5.1);
        Person elena = new Person("Elena", "Pankova", 16, 7.6);
        Person julia = new Person("Julia", "Serbskaya",17, 4.9);
        Person anna = new Person("Anna", "Krasiuk",16, 9.7);
        Person iya = new Person("Iya", "Krasiuk",17, 8.7);
        ArrayList<Person> studentList = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, anna, iya));
        SchoolClass class11B = new SchoolClass(studentList);

        printList(class11B);

        studentList.sort(new StudentsFullNameComparator());
        printList(class11B);

        studentList.sort(new StudentsAgeComparator());
        printList(class11B);

        studentList.sort(new StudentsAverageAnnualMark());
        printList(class11B);

        System.out.println("Best student: " + class11B.getBestStudent(studentList).getName() + " "
                + class11B.getBestStudent(studentList).getSurname());
    }

    public static void printList(SchoolClass schoolClass) {
        for (Person student : schoolClass.getStudents()) {
            System.out.println("Student: " + student.getName() + " " + student.getSurname() + ", " + student.getAge()
                    + " years old." + " Average annual mark: " + student.getAverageAnnualMark());
        }
        System.out.println();
    }
}
