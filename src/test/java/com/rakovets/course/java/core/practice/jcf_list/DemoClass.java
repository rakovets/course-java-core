package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.comparatot_for_class.SurNameAndNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.life_of_actors.Actor;
import com.rakovets.course.java.core.practice.jcf_list.life_of_class.Person;
import com.rakovets.course.java.core.practice.jcf_list.life_of_class.SchoolClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoClass {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        SchoolClass schoolClass = new SchoolClass(students);

        students.add(new Person("Oleg", "Aleksashov", 10, 7.5));
        students.add(new Person("Veronika", "Aleksashova", 11, 7));
        students.add(new Person("Victor", "GoldHands", 10, 5));
        students.add(new Person("Irina", "UsefulAdvises", 10, 9));

        schoolClass.getBestStudent(students);
        System.out.println(students.get(0));

        Comparator<Person> comparator = new SurNameAndNameComparator();
        students.sort(comparator);
        System.out.println(students);
    }
}
