package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentsSorting {
    public static Map<Integer, List<Student>> groupingByCourse(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourse));
    }

    public static List<String> getSpec(List<Student> students) {
        return students.stream()
                .map(x -> x.getSpec())
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Map<String, Long> countStudentsInSpec(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getSpec, Collectors.counting()));
    }

    public boolean checkStudents(List<Student> students, int course, List<Student> spec) {
        List<String> list = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getSpec)
                .collect(Collectors.toList());
        list.removeAll(spec);
        return list.size() > 0;
    }
}


