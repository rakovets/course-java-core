package com.rakovets.java.task.collections.list.school;

import java.util.Comparator;

public class CamporatorOfAvaverageAnnualMark implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.getAverageAnnualMark().compareTo(b.getAverageAnnualMark());
    }
}


