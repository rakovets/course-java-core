package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school_comparator.AverageAnnualMarkPersonComparator;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Person> students = new ArrayList<>();

    public void addStudents(Person person) {
        students.add(person);
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public Person getBestStudent(List<Person> students) {
        List<Person> list = new ArrayList<>(students);
        list.sort(new AverageAnnualMarkPersonComparator());
        return list.get(list.size() - 1);
    }
}
