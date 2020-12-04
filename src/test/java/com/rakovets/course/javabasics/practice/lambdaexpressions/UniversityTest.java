package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.Student;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import java.util.List;

public class UniversityTest {

    @Test
    public void test() {
        List<Student> students = List.of(
                new Student(1,"Yulia", "Gankovich", "Java", 1),
                new Student(2, "Roman", "Goncharuk", "C++", 2),
                new Student(3, "Dmitry","Zmachinskij", "C",2),
                new Student(4, "Roman", "Mashkov", "PHP",3),
                new Student(5,"Anastasia", "Mihalkevich", "Python", 4),
                new Student(6,"Yan", "Pashik", "Python", 5),
                new Student(7,"Yulia", "Portnova", "JavaScript", 3),
                new Student(8,"Dmitry", "Sedun", "C++", 3),
                new Student(9,"Oleg", "Smargun", "Java", 3),
                new Student(10,"Yury", "Sudak", "Java", 4),
                new Student(11,"Innokenty", "Tunakin", "PHP", 3)
        );
        University university = new University(students);
        assertEquals("{1=[1], 2=[2, 3], 3=[4, 7, 8, 9, 11], 4=[5, 10], 5=[6]}", university.getStudentsGroupingByCourse().toString());
        assertEquals("[C, C++, Java, JavaScript, PHP, Python]", university.getSpecialtiesAlphabetic().toString());
        assertEquals("{C=1, C++=2, Java=3, JavaScript=1, PHP=2, Python=2}", university.getAmountOfStudentsOnCurrentSpecialties().toString());
        assertEquals("{C={2=[3]}, C++={2=[2], 3=[8]}, Java={1=[1], 3=[9], 4=[10]}, JavaScript={3=[7]}, PHP={3=[4, 11]}, Python={4=[5], 5=[6]}}",
                university.getStudentsGroupingBySpecialtiesThenByCourse().toString());
        int course = 3;
        List<String> exceptionSpecialities = List.of("PHP", "JavaScript", "Java");
        assertTrue(university.isPresent(course, exceptionSpecialities));
    }
}
