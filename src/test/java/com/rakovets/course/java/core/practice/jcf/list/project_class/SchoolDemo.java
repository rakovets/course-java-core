package com.rakovets.course.java.core.practice.jcf.list.project_class;

import com.rakovets.course.java.core.practice.jcf.list.project_class.comparator.StudentComparatorByAge;
import com.rakovets.course.java.core.practice.jcf.list.project_class.comparator.StudentComparatorByAnnualMark;
import com.rakovets.course.java.core.practice.jcf.list.project_class.comparator.StudentComparatorByFullName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Seregich", "Potapov", 19, 5.9));
        studentList.add(new Student("Vit", "Rotkevich", 22, 8.4));
        studentList.add(new Student("Igor", "Rotkevich", 22, 8.6));
        studentList.add(new Student("Evgen", "Dunin", 23, 8.5));
        studentList.add(new Student("Kate", "Dementsevich", 23, 8.5));
        studentList.add(new Student("Translit", "Ostrovsku", 21, 7.4));
        studentList.add(new Student("Pishera", "Pomenova", 21, 5.4));
        studentList.add(new Student("Krzystof", "Zabka", 21, 8.3));
        Comparator<Student> studentComparatorByAge = new StudentComparatorByAge();
        Comparator<Student> studentComparatorByFullName = new StudentComparatorByFullName();
        Comparator<Student> studentComparatorByAnnualMark = new StudentComparatorByAnnualMark();

        studentList.sort(studentComparatorByAge);
        System.out.println("SortByAge: ");
        printStudents(studentList);

        studentList.sort(studentComparatorByFullName);
        System.out.println("SortByFullName: ");
        printStudents(studentList);

        studentList.sort(studentComparatorByAnnualMark);
        System.out.println("SortByMark: ");
        printStudents(studentList);

    }

    private static void printStudents(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
