package com.rakovets.course.java.core.practice.jcf_list;

public class SchoolClassDemo {
    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();
        schoolClass.students.add(new Person("Paul", "Newman", 14, 6.0));
        schoolClass.students.add(new Person("Henry", "Cavil", 13, 7.5));
        schoolClass.students.add(new Person("Caty", "Dornhole", 14, 8.0));
        schoolClass.students.add(new Person("Mike", "Ashe", 14, 7.2));

        schoolClass.printStudents();
        System.out.println();
        schoolClass.sortByNameAndSurname();
        schoolClass.printStudents();
    }
}
