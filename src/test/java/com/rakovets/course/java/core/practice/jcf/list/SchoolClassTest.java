package com.rakovets.course.java.core.practice.jcf.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolClassTest {

    @Test
    void getBestStudentTest() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("fName3", "lName5", 48, 8));
        students.add(new Student("fName4", "lName1", 38, 5));
        students.add(new Student("fName1", "lName3", 28, 9));
        students.add(new Student("fName2", "lName2", 18, 7));
        SchoolClass schoolClass = new SchoolClass(students);
        schoolClass.getBestStudent(students);
        Assertions.assertEquals(5, students.get(0).getAverageAnnualMark() );

    }
}
