package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {
        Student st1 = new Student("John", "Conor", Specialty.IT_TECHNOLOGIES, 2);
        Student st2 = new Student("Billy", "Torrent", Specialty.IT_TECHNOLOGIES, 2);
        Student st3 = new Student("Harry", "Potter", Specialty.MAGIC, 3);
        Student st4 = new Student("Lucy", "Luu", Specialty.MATH, 1);
        Student st5 = new Student("Ken", "Buffet", Specialty.CHEMISTRY, 4);
        Collection<Student> students = List.of(st1, st2, st3, st4, st5);

        University university = new University();
        university.addToUniversity(students);

        System.out.println(university.getStudentsBySemester(1));
        System.out.println(university.getListOfSpecialties());
        System.out.println(university.getStudentsGroupedBySpecialty());

    }
}
