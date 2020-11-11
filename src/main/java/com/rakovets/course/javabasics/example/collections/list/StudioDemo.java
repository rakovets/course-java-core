package com.rakovets.course.javabasics.example.collections.list;

import com.rakovets.course.javabasics.example.collections.list.comparators.StudentAgeComparator;
import com.rakovets.course.javabasics.example.collections.list.comparators.StudentAverageMarksComparator;
import com.rakovets.course.javabasics.example.collections.list.comparators.StudentFullNameComparator;

import java.util.LinkedList;

public class StudioDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student("Tom", "Crouse", 25, 3.6));
        students.add(new Student("Tom", "Diesel", 23, 4.3));
        students.add(new Student("Tom", "Sinatra", 22, 4.2));
        students.add(new Student("Tom", "Potter", 19, 5.5));
        students.add(new Student("Tom", "Hanks", 20, 5.1));
        SchoolClass group  = new SchoolClass(students);



       System.out.println("Best \n" + group.getBestStudent().toString());

       students.sort( new StudentAverageMarksComparator());

       System.out.println("AvMArk \n" + students.toString());

        students.sort( new StudentFullNameComparator());

        System.out.println("FullName \n" +students.toString());

        students.sort( new StudentAgeComparator());

        System.out.println("Age \n" +students.toString());







    }
}
