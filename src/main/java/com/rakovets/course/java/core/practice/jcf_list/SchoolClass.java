package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;

public class SchoolClass {
    ArrayList<Person> students = new ArrayList<>();

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

    public ArrayList<Person> getStudents() {
        return students;
    }

    public Person getBestStudent(ArrayList<Person> students) {
        students.sort(byAverageAnnualMark);
        return students.get(students.size() - 1);
    }

    public ArrayList<Person> sortBySurnameName(ArrayList<Person> students) {
        students.sort(bySurnameName);
        return students;
    }

    public ArrayList<Person> sortByAge(ArrayList<Person> students) {
        students.sort(byAge);
        return students;
    }

    public ArrayList<Person> sortByAverageAnnualMark(ArrayList<Person> students) {
        students.sort(byAverageAnnualMark);
        return students;
    }
}
