package com.rakovets.course.java.core.practice.jcf_list.school_class;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class SchoolClassTest {
    private ArrayList<Person> students;
    private SchoolClass class9A;
    private final Person monroe = new Person("Marilyn", "Monroe", 18, 6.9);
    private final Person stewart = new Person("Patric", "Stewart", 17, 8.2);
    private final Person patel = new Person("Dev", "Patel", 16, 4.5);
    private final Person penn = new Person("Sean", "Penn", 15, 5.6);
    private final Person pitt = new Person("Brad", "Pitt", 15, 7.5);
    private final Person cage = new Person("Nicolas", "Cage", 17, 6.6);
    private final Person levy = new Person("Jane", "Levy", 16, 8.9);
    private final Person johansson = new Person("Scarlett", "Johansson", 13, 8.1);
    private final Person marlyn = new Person("Maryl", "Streep", 18, 7.7);

    @AfterEach
    public void init() {

    }

    @Test
    public void getBestStudentTest1() {
        students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, johansson, marlyn));
        class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(levy, actual);
    }

    @Test
    public void getBestStudentTest2() {
        students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, marlyn, cage, stewart));
        class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(stewart, actual);
    }

    @Test
    public void getBestStudentTest3() {
        students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, marlyn, cage));
        class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(marlyn, actual);
    }
}
