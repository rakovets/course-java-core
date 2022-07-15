package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    private List<Person> students = new ArrayList<>();

    Comparator<Person> byAverageAnnualMark = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            Float averageMarkFirst = p1.getAverageAnnualMark();
            Float averageMarkSecond = p2.getAverageAnnualMark();
            return averageMarkFirst.compareTo(averageMarkSecond);
        }
    };

    Comparator<Person> byAge = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            Integer ageFirst = p1.getAge();
            Integer ageSecond = p2.getAge();
            return ageFirst.compareTo(ageSecond);
        }
    };

    Comparator<Person> bySurnameName = new Comparator<>() {
        @Override
        public int compare(Person p1, Person p2) {
            String nameSurnameFirst = p1.getSurname() + " " + p1.getName();
            String nameSurnameSecond = p2.getSurname() + " " + p2.getName();
            return nameSurnameFirst.compareTo(nameSurnameSecond);
        }
    };

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
        students.sort(byAverageAnnualMark);
        return students.get(students.size() - 1);
    }
}
