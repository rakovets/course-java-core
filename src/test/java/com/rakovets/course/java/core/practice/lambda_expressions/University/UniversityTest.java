package com.rakovets.course.java.core.practice.lambda_expressions.University;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    List<Student> students = List.of(
            new Student("Andrei", "Vegera", "Management", 1),
            new Student("Anastasia", "Gawriljuk", "Marketing", 2),
            new Student( "Andrey", "German", "Programming",3),
            new Student( "Roman", "Mashkov", "Finance",4),
            new Student("Sergey", "Grinkevich", "Economics", 5),
            new Student("Eugene","Dunin", "Management", 1),
            new Student("Tanya", "Yermalitskaya", "Economics", 2),
            new Student("Oxana", "Peregud", "Programming", 3),
            new Student("Aliaksei", "Rudoi", "Management", 4),
            new Student("Vladislav", "Tushinskiy", "Political Science", 5),
            new Student("Yauhen", "Filipau", "Finance", 1),
            new Student("Anton", "Khramau", "Marketing", 2)
    );

    University university = new University(students);

    @Test
    void groupingByCourse() {
        assertEquals(
                "{1=[Student{firstname='Andrei', lastname='Vegera', speciality='Management', course=1}, " +
                        "Student{firstname='Eugene', lastname='Dunin', speciality='Management', course=1}, " +
                        "Student{firstname='Yauhen', lastname='Filipau', speciality='Finance', course=1}], " +
                        "2=[Student{firstname='Anastasia', lastname='Gawriljuk', speciality='Marketing', course=2}, " +
                        "Student{firstname='Tanya', lastname='Yermalitskaya', speciality='Economics', course=2}, " +
                        "Student{firstname='Anton', lastname='Khramau', speciality='Marketing', course=2}], " +
                        "3=[Student{firstname='Andrey', lastname='German', speciality='Programming', course=3}, " +
                        "Student{firstname='Oxana', lastname='Peregud', speciality='Programming', course=3}], " +
                        "4=[Student{firstname='Roman', lastname='Mashkov', speciality='Finance', course=4}, " +
                        "Student{firstname='Aliaksei', lastname='Rudoi', speciality='Management', course=4}], " +
                        "5=[Student{firstname='Sergey', lastname='Grinkevich', speciality='Economics', course=5}, " +
                        "Student{firstname='Vladislav', lastname='Tushinskiy', speciality='Political Science', course=5}]}",
                university.groupingByCourse().toString());
    }

    @Test
    void allSpeciality() {
        assertEquals("[Economics, Finance, Management, Marketing, Political Science, Programming]",
                university.allSpeciality().toString());
    }

    @Test
    void numberPerSpeciality() {
        assertEquals("{Economics=2, Finance=2, Programming=2, Management=3, Political Science=1, Marketing=2}",
                university.numberPerSpeciality().toString());
    }

    @Test
    void groupBySpecialityAndCourse() {
        assertEquals(
                "{Economics={" +
                        "2=[Student{firstname='Tanya', lastname='Yermalitskaya', speciality='Economics', course=2}], " +
                        "5=[Student{firstname='Sergey', lastname='Grinkevich', speciality='Economics', course=5}]}, " +
                        "Finance={" +
                        "1=[Student{firstname='Yauhen', lastname='Filipau', speciality='Finance', course=1}], " +
                        "4=[Student{firstname='Roman', lastname='Mashkov', speciality='Finance', course=4}]}, " +
                        "Management={" +
                        "1=[Student{firstname='Andrei', lastname='Vegera', speciality='Management', course=1}, " +
                        "Student{firstname='Eugene', lastname='Dunin', speciality='Management', course=1}], " +
                        "4=[Student{firstname='Aliaksei', lastname='Rudoi', speciality='Management', course=4}]}, " +
                        "Marketing={" +
                        "2=[Student{firstname='Anastasia', lastname='Gawriljuk', speciality='Marketing', course=2}, " +
                        "Student{firstname='Anton', lastname='Khramau', speciality='Marketing', course=2}]}, " +
                        "Political Science={" +
                        "5=[Student{firstname='Vladislav', lastname='Tushinskiy', speciality='Political Science', course=5}]}, " +
                        "Programming={3=[Student{firstname='Andrey', lastname='German', speciality='Programming', course=3}, " +
                        "Student{firstname='Oxana', lastname='Peregud', speciality='Programming', course=3}]}}",
                university.groupBySpecialityAndCourse().toString());
    }

    @Test
    void checkStudents() {
        assertTrue(university.checkStudents(5, List.of("Economics", "Programming")));
    }
}
