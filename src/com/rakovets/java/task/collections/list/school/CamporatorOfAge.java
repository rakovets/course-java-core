package com.rakovets.java.task.collections.list.school;

import java.util.Comparator;

public class CamporatorOfAge implements Comparator<Student> {
    public int compare(Student a, Student b) {
        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
