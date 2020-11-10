package com.rakovets.course.javabasics.example.collections.list;

import java.util.LinkedList;

public class StudioDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<Student>();
        students.add(new Student("Tom", "Crouse", 21, 3.6));
        students.add(new Student("Vin", "Diesel", 23, 4.3));
        students.add(new Student("Frank", "Sinatra", 22, 4.2));
        students.add(new Student("Tom", "Sinatra", 19, 5.5));
        students.add(new Student("Jimm", "Hanks", 20, 5.1));

       SchoolClass group = new SchoolClass(students);

       System.out.println(group.getBestStudent().toString());









    }
}
