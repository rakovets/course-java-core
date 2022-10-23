package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Class.Comparators.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.Class.Comparators.FullNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.Class.Comparators.MarksComparator;
import com.rakovets.course.java.core.practice.jcf_list.Class.Models.Person;
import com.rakovets.course.java.core.practice.jcf_list.Class.Models.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Models.Actor;
import org.apiguardian.api.API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        List<Person> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Person("Penelope", "Cruz",14,4.5));
        listOfStudents.add(new Person("Salma", "Hayek",15,4.2));
        listOfStudents.add(new Person("Johny","Depp",14,3.7));
        listOfStudents.add(new Person("Robert", "Pattinson",16,4.9));
        Comparator<Person> marksComparator = new MarksComparator();
        listOfStudents.sort(marksComparator);
        for(Person student: listOfStudents) {
            System.out.println(student);
        }
        System.out.println(" ");

        SchoolClass schoolClass = new SchoolClass(listOfStudents);
        Person bestOne = schoolClass.getBestStudent(listOfStudents);
        System.out.println(bestOne);
        System.out.println(" ");

        Comparator<Person> fullNameComparator = new FullNameComparator();
        listOfStudents.sort(fullNameComparator);
        for (Person student: listOfStudents) {
            System.out.println(student);
        }
        System.out.println(" ");

        Comparator<Person> ageComparator = new AgeComparator();
        listOfStudents.sort(ageComparator);
        for (Person student: listOfStudents) {
            System.out.println(student);
        }
    }
}
