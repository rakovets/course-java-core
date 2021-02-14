package com.rakovets.course.java.core.practice.lambda_expressions.University;

import java.util.*;
import java.util.stream.Collectors;

public class University {
    private final List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public Object groupingByCourse() {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse));
    }

    public Object allSpeciality() {
        return students.stream()
                .map(Student::getSpeciality)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public Object numberPerSpeciality() {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getSpeciality,
                        Collectors.counting()));
    }

    public Object groupBySpecialityAndCourse() {
        return students.stream()
                .sorted(Comparator
                        .comparing(Student::getSpeciality)
                        .thenComparing(Student::getCourse)
                )
                .collect(Collectors.groupingBy(
                        Student::getSpeciality,
                        LinkedHashMap::new,
                        Collectors.groupingBy(Student::getCourse)));
    }

    public boolean checkStudents(int course, List<String> specificSpeciality) {
        List<String> list = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getSpeciality)
                .collect(Collectors.toList());
        list.removeAll(specificSpeciality);
        return list.size() > 0;
    }
}
