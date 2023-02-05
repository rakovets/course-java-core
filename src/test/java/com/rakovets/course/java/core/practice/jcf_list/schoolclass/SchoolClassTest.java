package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClassTest {
    private final Person dzmitry = new Person("Dzmitry", "Krasiuk", 17, 8.3);
    private final Person alexander = new Person("Alexander", "Braim", 16, 5.1);
    private final Person elena = new Person("Elena", "Pankova", 16, 7.6);
    private final Person julia = new Person("Julia", "Serbskaya",17, 4.9);
    private final Person anna = new Person("Anna", "Krasiuk",16, 9.7);
    private final Person iya = new Person("Iya", "Krasiuk",17, 8.7);
    private ArrayList<Person> studentList;
    private SchoolClass class11B;

    @BeforeEach
    void init() {
        studentList = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, anna, iya));
        class11B = new SchoolClass(studentList);
    }

    @DisplayName("Test getBestStudent(), returns Person from student list with highest annual average mark")
    @Test
    void getBestStudentTest() {
        Person result = class11B.getBestStudent(studentList);

        System.out.println("Best student: " + class11B.getBestStudent(studentList).getName() + " "
                + class11B.getBestStudent(studentList).getSurname());

        Assertions.assertEquals(anna, result);
    }
}
