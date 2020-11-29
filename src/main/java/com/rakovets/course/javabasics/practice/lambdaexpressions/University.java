package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class University {
    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public Map<Integer, List<Student>> getStudentsByCourse() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));
    }

    public List<String> getSpecialtiesAlphabetic() {
        return students.stream()
                .map(Student::getSpecialty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Map<String, Long> getAmountsOfSpecialties() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSpecialty,
                        TreeMap::new,
                        Collectors.counting()));
    }

    public Map<String, Map<Integer, List<Student>>> getStudentsBySpecialtiesThenByCourse() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSpecialty,
                        TreeMap::new,
                        Collectors.groupingBy(Student::getCourse)));
    }

    public boolean isPresent(int course, List<String> exceptionSpecialities) {
        List<String> list = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getSpecialty)
                .collect(Collectors.toList());
                list.removeAll(exceptionSpecialities);
        return list.size() > 0;
    }
}
