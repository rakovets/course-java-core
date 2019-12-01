package com.rakovets.java.task.collections.list.school;

import java.util.ArrayList;
import java.util.Collections;

public class SchoolDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nikita", "Kochetkov", 20, 8));
        list.add(new Student("Vlad", "Konev", 28, 7));
        list.add(new Student("Artem", "Lutsko", 22, 9));
        list.add(new Student("Bagdan", "Ivanov", 17, 5));
        list.add(new Student("Sergei", "Vasechkin", 17, 6));
        SchoolUtil schoolUtil = new SchoolUtil();
        Student bestStudents = schoolUtil.getBestStudent(list);
        System.out.println(bestStudents);
        System.out.println("Get average Marks:");
        getAvaverageMarks(list);
        System.out.println("Get age:");
        getAge(list);
        System.out.println("Get fullname:");
        printSortedByFullName(list);

    }

    public static void getAge(ArrayList<Student> list) {
        Collections.sort(list, new CamporatorOfAge());
        for (Student s : list) {
            System.out.println(s.getAge());
        }
    }


    public static void getAvaverageMarks(ArrayList<Student> list) {
        Collections.sort(list, new CamporatorOfAvaverageAnnualMark());
        for (Student student : list) {
            System.out.println(student.getAverageAnnualMark());
        }

    }

    public static void printSortedByFullName(ArrayList<Student> list) {
        Collections.sort(list, new CamporatorOfNameAndSurname());
        for (Student s1 : list) {
            System.out.println(s1);
        }
    }
}

