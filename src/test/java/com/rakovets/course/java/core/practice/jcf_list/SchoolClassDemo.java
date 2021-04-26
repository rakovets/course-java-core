package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Aleksei", "Alekseev", 9, 5));
        listOfStudents.add(new Student("Aleksey", "Alekseev", 7, 4.5));
        listOfStudents.add(new Student("Alexey", "Alekseev", 11, 7));
        listOfStudents.add(new Student("Alehey", "Alekseev", 12, 8.4));
        listOfStudents.add(new Student("Alex", "Alekseev", 8, 3.7));
        SchoolClass schoolClass = new SchoolClass(listOfStudents);
        System.out.println(schoolClass.getBestStudent(listOfStudents));
        listOfStudents.sort(new StudentAllNameComporator());
        System.out.println("\nSort by full name\n");
        printStudents(listOfStudents);
        listOfStudents.sort(new StudentAgeComparator());
        System.out.println("\nSort by age\n");
        printStudents(listOfStudents);
        listOfStudents.sort(new AverageMarkComparator());
        System.out.println("\nSort by average mark\n");
        printStudents(listOfStudents);

    }


    public static void printStudents(List<Student> listOfStudents) {
        for (Student student : listOfStudents) {
            System.out.println("name - " + student.getName() + " surname - " + student.getSurname() + " age - " +
                    student.getAge() + " averageAnnualMark - " + student.getAverageAnnualMark());
        }
    }
}
