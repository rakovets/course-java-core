package com.rakovets.course.java.core.practice.jcf.list.project_class;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SchoolClassTest {

    @Test
    void getBestStudent() {
        //Given
        List<Student> studentList = new ArrayList<>();
        SchoolClass schoolClass = new SchoolClass(studentList);
        studentList.add(new Student("Seregich", "Potapov", 19, 5.9));
        studentList.add(new Student("Igor", "Rotkevich", 22, 8.6));
        studentList.add(new Student("Evgen", "Dunin", 23, 8.5));
        studentList.add(new Student("Vit", "Rotkevich", 22, 8.9));
        studentList.add(new Student("Kate", "Dementsevich", 23, 8.5));
        studentList.add(new Student("Translit", "Ostrovsku", 21, 7.4));
        studentList.add(new Student("Pishera", "Pomenova", 21, 5.4));
        studentList.add(new Student("Krzystof", "Zabka", 21, 8.3));
        Student expectedResult = studentList.get(3);

        //When
        Student actualResult = schoolClass.getBestStudent();

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
