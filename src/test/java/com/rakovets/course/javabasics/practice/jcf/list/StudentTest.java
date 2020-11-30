package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.example.generics.model.SchoolClass;
import com.rakovets.course.javabasics.example.generics.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    void Test1() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gora", "Konoplan", 24, 8.3));
        students.add(new Student("Boris", "Godynov", 21, 6.5));
        students.add(new Student("Oleg", "Vetrov", 22, 7.2));
        students.add(new Student("Andrey", "Lyga", 18, 5.9));
        students.add(new Student("Misha", "Bydenii", 27, 9.1));
        SchoolClass schoolClass = new SchoolClass(students);
        Assertions.assertEquals("Bydenii", schoolClass.getBestStudent().getSurname());
    }

    @Test
    void Test2() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gora", "Konoplan", 24, 8.3));
        students.add(new Student("Boris", "Godynov", 21, 6.5));
        students.add(new Student("Oleg", "Vetrov", 22, 7.2));
        students.add(new Student("Andrey", "Lyga", 18, 5.9));
        students.add(new Student("Misha", "Bydenii", 27, 9.1));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(schoolClass.name);
        Assertions.assertEquals("Andrey Boris Gora Misha Oleg", schoolClass.getNames());
        Assertions.assertEquals("Lyga Godynov Konoplan Bydenii Vetrov", schoolClass.getSurnames());
    }

    @Test
    void Test3() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gora", "Konoplan", 24, 8.3));
        students.add(new Student("Boris", "Godynov", 21, 6.5));
        students.add(new Student("Oleg", "Vetrov", 22, 7.2));
        students.add(new Student("Andrey", "Lyga", 18, 5.9));
        students.add(new Student("Misha", "Bydenii", 27, 9.1));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(schoolClass.age);
        Assertions.assertEquals("27 24 22 21 18", schoolClass.getAges());
    }
    @Test
    void Test4() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Gora", "Konoplan", 24, 8.3));
        students.add(new Student("Boris", "Godynov", 21, 6.5));
        students.add(new Student("Oleg", "Vetrov", 22, 7.2));
        students.add(new Student("Andrey", "Lyga", 18, 5.9));
        students.add(new Student("Misha", "Bydenii", 27, 9.1));
        SchoolClass schoolClass = new SchoolClass(students);
        students.sort(schoolClass.mark);
        Assertions.assertEquals("9.1 8.3 7.2 6.5 5.9", schoolClass.getMarks());
    }
}

