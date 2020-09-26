package com.rakovets.course.javabasics.example.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", Speciality.Physics, 1),
                new Student("Rika", Speciality.Biology, 4),
                new Student("Julia", Speciality.Biology, 2),
                new Student("Steve", Speciality.History, 4),
                new Student("Mike", Speciality.Finance, 1),
                new Student("Hinata", Speciality.Biology, 2),
                new Student("Richard", Speciality.History, 1),
                new Student("Kate", Speciality.Psychology, 2),
                new Student("Sergey", Speciality.ComputerScience, 4),
                new Student("Maximilian", Speciality.ComputerScience, 3),
                new Student("Tim", Speciality.ComputerScience, 5),
                new Student("Ann", Speciality.Psychology, 1)
        );

        students.stream()
                .forEach(student -> System.out.printf("%s -> %d\n", student, student.hashCode()));

        List<Student> firstCourse = students.stream()
                .filter(student -> student.getCourse() == 1)
                .collect(Collectors.toList());

        students.stream()
                .map(student -> student.getFutureProfession())
                .distinct()
                .sorted((x, y) -> -x.compareTo(y))
                .forEach(speciality -> System.out.println(speciality));

        Map<Object, Long> collect = students.stream()
                .collect(Collectors.groupingBy(x -> x.getFutureProfession(), Collectors.counting()));

        System.out.println();

    }
}
