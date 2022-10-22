package com.rakovets.course.java.core.practice.jcf_list.project_class.models;

import java.util.List;
import java.util.ListIterator;

public class SchoolClass {
    private List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        ListIterator<Person> listIterator = students.listIterator();
        String studentsList = "[";
        while (listIterator.hasNext()) {
            studentsList += listIterator.next().toString() + "; ";
        }
        String studentsListToPrint = studentsList.trim();
        studentsListToPrint += "]";
        return studentsListToPrint;
    }

    public Person getBestStudent(List<Person> students) {
        ListIterator<Person> listIterator = students.listIterator();
        double maxAverageAnnualMark = 0;
        int index = 0;
        Person bestStudent;
        while (listIterator.hasNext()) {
            if (listIterator.next().getAverageAnnualMark() > maxAverageAnnualMark) {
                maxAverageAnnualMark = listIterator.previous().getAverageAnnualMark();
            }
        }
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().getAverageAnnualMark() == maxAverageAnnualMark) {
                index  = listIterator.previousIndex() + 1;
            }
        }
        return students.get(index);
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }
}
