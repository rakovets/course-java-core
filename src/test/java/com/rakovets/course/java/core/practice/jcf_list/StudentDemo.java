package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.students.*;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        Student ivanIvanov = new Student("Ivan","Ivanov",14,7.5);
        Student petrPetrov = new Student("Petr","Petrov",15,8.0);
        Student SergeySergeev = new Student("Sergey","Sergeev",14,6.0);
        Student pavelPavlov = new Student("Pavel","Pavlov",16,7.2);
        ArrayList<Student>students = new ArrayList<>();
        students.add(ivanIvanov);
        students.add(petrPetrov);
        students.add(SergeySergeev);
        students.add(pavelPavlov);
        printClassArray(students);

        System.out.println("The best student is: ");
        Student bestStudent = SchoolClass.getBestStudent(students);
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() + ": age = " + bestStudent.getAge() + ", average mark = " + bestStudent.getAverageAnnualMark());

        System.out.println("\n Age  sort: ");
        students.sort(new StudentAgeComparator());
        printClassArray(students);

        System.out.println("\n AverageAnnualMark  sort: ");
        students.sort(new StudentAverageAnnualMarkComparator());
        printClassArray(students);


    }
    public static void printClassArray(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println("Student name : " + student.getName() + " , Student surname: " + student.getSurname() + " , Student age: " + student.getAge()+" , Student averageAnnualMark: " + student.getAverageAnnualMark());
        }
    }
}
