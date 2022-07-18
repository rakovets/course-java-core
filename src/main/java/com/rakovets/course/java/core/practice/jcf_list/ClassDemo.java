package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.projectclass.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        Person a = new Person("Joe", "Walker", 16, 1.78);
        Person b = new Person("Donnie", "Brasco", 15, 0.65);
        Person c = new Person("Sam", "Carter", 18, 4.56);
        Person d = new Person("Sam", "Bone", 13, 6.78);

        List<Person> personList = new ArrayList<>();
        personList.add(0, a);
        personList.add(1, b);
        personList.add(2, c);
        personList.add(3, d);

        System.out.println("The best student is: " + SchoolClass.getBestStudent(personList).getSurname());

        Comparator<Person> nameAndSurnameComparator = new nameComparator().thenComparing(new surnameComparator());
        Collections.sort(personList, nameAndSurnameComparator);
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getSurname());
        }

        Collections.sort(personList, new ageComparator());
        for (Person person : personList) {
            System.out.println(person.getName() + " " + person.getSurname() + " age is " + person.getAge());
        }

        Collections.sort(personList, new averageMarkComparator());
        for (Person person : personList) {
            System.out.println(person.getAverageAnnualMark());
        }
    }
}
