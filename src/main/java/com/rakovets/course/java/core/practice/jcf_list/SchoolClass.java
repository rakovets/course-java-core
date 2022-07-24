package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    public Comparator<Person> byAverageAnnualMark = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Float.compare(p1.getAverageAnnualMark(), p2.getAverageAnnualMark());
        }
    };
    public Comparator<Person> byAge = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    };
    public Comparator<Person> bySurnameName = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            if (!p1.getSurname().equals(p2.getSurname())) {
                return p1.getSurname().compareTo(p2.getSurname());
            }
            return p1.getName().compareTo(p2.getName());
        }
    };
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
        list.sort(byAverageAnnualMark);
        return list.get(list.size() - 1);
    }
}
