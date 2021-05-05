package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class University {
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

    public static Map<String, Map<Integer, List<Student>>> groupingBySpecialty(List<Student> students) {
        return students.stream()
                .sorted(Comparator
                        .comparing(Student::getSpec)
                        .thenComparing(Student::getCourse)
                )
                .collect(Collectors.groupingBy(
                        Student::getSpec,
                        LinkedHashMap::new,
                        Collectors.groupingBy(Student::getCourse)));
    }

    public static boolean checkStudents(List<Student> students, int course, List<Student> spec) {
        List<String> list = students.stream()
                .filter(student -> student.getCourse() == course)
                .map(Student::getSpec)
                .collect(Collectors.toList());
        list.removeAll(spec);
        return list.size() > 0;
    }
}
