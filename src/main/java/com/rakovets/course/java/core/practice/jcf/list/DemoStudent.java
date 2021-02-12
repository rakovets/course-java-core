package com.rakovets.course.java.core.practice.jcf.list;

import java.util.LinkedList;
import java.util.List;

public class DemoStudent {
    public static void main(String[] args) {
        Student illarionov = new Student("Andrey", "Illarionov", 59, 9.1);
        Student gordon = new Student("Dmitro", "Gordon", 53, 8.9);
        Student suvorov = new Student("Viktor", "Suvorov", 73, 8.1);
        Student nevzorov = new Student("Alexandr", "Nevzorov", 62, 6.5);
        Student hodorkovsky = new Student("Mihail", "Hodorkovsky", 57, 7.7);
        List<Student> students = new LinkedList<>();
        students.add(illarionov);
        students.add(gordon);
        students.add(suvorov);
        students.add(nevzorov);
        students.add(hodorkovsky);

        SchoolClass.getBestStudent(students);
        SchoolClass.sortedByNameAndSurname(students);
        SchoolClass.sortedByAge(students);
        SchoolClass.sortedByAverageAnnualMark(students);
        printStudents(students);
    }

    public static void printStudents(List<Student> students) {
        for (Student stud: students) {
            System.out.println(stud.toString());
        }
    }
}
