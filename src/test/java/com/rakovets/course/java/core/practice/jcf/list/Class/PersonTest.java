package com.rakovets.course.java.core.practice.jcf.list.Class;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void studentNameAndSurnameComparator() {
        ArrayList<Person> students = new ArrayList<>();
        students.add(new Person("Andrei", "Vegera", 10, 6.5));
        students.add(new Person("Anastasia", "Gawriljuk", 11, 9.0));
        students.add(new Person("Andrey", "German", 12, 6.0));
        students.add(new Person("Sergey", "Grinkevich", 13, 9.0));
        students.add(new Person("Eugene", "Dunin", 14, 7.8));
        students.add(new Person("Tanya", "Yermalitskaya", 15, 8.7));
        students.add(new Person("Oxana", "Peregud", 16, 10.0));
        students.add(new Person("Aliaksei", "Rudoi", 17, 8.0));
        students.add(new Person("Vladislav", "Tushinskiy", 18, 7.2));
        students.add(new Person("Yauhen", "Filipau", 19, 8.5));
        students.add(new Person("Anton", "Khramau", 20, 8.0));
        students.sort(new StudentNameAndSurnameComparator());
        assertEquals("Aliaksei", students.get(0).getName());
        assertEquals("Rudoi", students.get(0).getSurname());
    }

    @Test
    void studentAgeComparator() {
        ArrayList<Person> students = new ArrayList<>();
        students.add(new Person("Andrei", "Vegera", 10, 6.5));
        students.add(new Person("Anastasia", "Gawriljuk", 11, 9.0));
        students.add(new Person("Andrey", "German", 12, 6.0));
        students.add(new Person("Sergey", "Grinkevich", 13, 9.0));
        students.add(new Person("Eugene", "Dunin", 14, 7.8));
        students.add(new Person("Tanya", "Yermalitskaya", 15, 8.7));
        students.add(new Person("Oxana", "Peregud", 16, 10.0));
        students.add(new Person("Aliaksei", "Rudoi", 17, 8.0));
        students.add(new Person("Vladislav", "Tushinskiy", 18, 7.2));
        students.add(new Person("Yauhen", "Filipau", 19, 8.5));
        students.add(new Person("Anton", "Khramau", 20, 8.0));
        students.sort(new StudentAgeComparator());
        assertEquals(10, students.get(0).getAge());
    }

    @Test
    void studentAverageAnnualMarkComparator() {
        ArrayList<Person> students = new ArrayList<>();
        students.add(new Person("Andrei", "Vegera", 10, 6.5));
        students.add(new Person("Anastasia", "Gawriljuk", 11, 9.0));
        students.add(new Person("Andrey", "German", 12, 6.0));
        students.add(new Person("Sergey", "Grinkevich", 13, 9.0));
        students.add(new Person("Eugene", "Dunin", 14, 7.8));
        students.add(new Person("Tanya", "Yermalitskaya", 15, 8.7));
        students.add(new Person("Oxana", "Peregud", 16, 10.0));
        students.add(new Person("Aliaksei", "Rudoi", 17, 8.0));
        students.add(new Person("Vladislav", "Tushinskiy", 18, 7.2));
        students.add(new Person("Yauhen", "Filipau", 19, 8.5));
        students.add(new Person("Anton", "Khramau", 20, 8.0));
        students.sort(new StudentAverageAnnualMarkComparator());
        assertEquals(6.0, students.get(0).getAverageAnnualMark());
    }
}
