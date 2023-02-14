package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class SchoolClass {
    List<Person> students = new ArrayList<>();

    public Person getBestStudent(List<Person> students) {
        ListIterator<Person> listIterator = students.listIterator();
        Person bestStudent = new Person("Default", "Default", 0, 0);
        while (listIterator.hasNext()) {
            if (listIterator.next().getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = listIterator.previous();
            }
        }
        return bestStudent;
    }

    public void sortByNameAndSurname() {
        students.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparing(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        }));
    }

    public void sortByAge() {
        students.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    public void sortByAverageAnnualMark() {
        students.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
            }
        });
    }

    public void printStudents() {
        for (Person person : students) {
            System.out.println(person);
        }
    }
}
