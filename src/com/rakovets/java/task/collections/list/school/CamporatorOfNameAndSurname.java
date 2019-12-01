package com.rakovets.java.task.collections.list.school;

import java.util.Comparator;

public class CamporatorOfNameAndSurname implements Comparator<Student> {
    public int compare(Student a, Student b) {
        String studentAFullName = a.getName() + a.getSurname();
        String studentBFullName = b.getName() + b.getSurname();
        return studentAFullName.compareTo(studentBFullName);
    }
}




