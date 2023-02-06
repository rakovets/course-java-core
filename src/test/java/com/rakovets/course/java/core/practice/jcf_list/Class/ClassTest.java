package com.rakovets.course.java.core.practice.jcf_list.Class;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class ClassTest {
    LinkedList<Person> students = new LinkedList<>();

    @Test
    void classTest() {
        students.add(new Person("Ivan", "Markov",12, 8.5));
        students.add(new Person("Maria", "Shapkina", 13,7.0));
        students.add(new Person("Boris", "Ivanov", 16, 5.8));
        students.add(new Person("Varvara", "Nikitenko", 14,8.8));
        students.add(new Person("Inna", "Akbarova", 17, 8.9));
        students.add(new Person("Dmitry", "Sorokin", 15, 7.3));
        SchoolClass schoolClass = new SchoolClass(students);
        LinkedList<Person> students2 = new LinkedList<Person>(schoolClass.students);
        schoolClass.getBestStudent(students);
        Assertions.assertEquals(students2.getLast().getAverageAnnualMark(),students.getLast().getAverageAnnualMark());
        students.sort(new StudentAgeComparator());
        students2.sort(new StudentAgeComparator());
        Assertions.assertEquals(students2.getLast().getAge(),students.getLast().getAge());
        students.sort(new StudentFullNameComparator());
        students2.sort(new StudentFullNameComparator());
        Assertions.assertEquals(students2.getFirst().getSurname(),students.getFirst().getSurname());
        Assertions.assertEquals(students2.getLast().getSurname(),students.getLast().getSurname());
    }
}
