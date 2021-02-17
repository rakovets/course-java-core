package com.rakovets.course.java.core.practice.lambda_expressions.university;

import java.util.*;
import java.util.stream.Collectors;

public abstract class StudentSorter {
    public static Map<Integer, List<Student>> getByStudyYear(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getYearOfStudy));
    }

    public static List<String> getSpecialityList(List<Student> students) {
        return students.stream()
                .map(student -> student.getSpeciality().toLowerCase(Locale.ROOT))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Map<String, Long> getCountBySpeciality(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSpeciality, Collectors.counting()));
    }

    public static Map<String, Map<Integer, List<Student>>> getBySpecialityAndYear(List<Student> students) {
        return students.stream()
                .sorted(Comparator.comparing(Student::getSpeciality).thenComparing(Student::getYearOfStudy))
                .collect(Collectors.groupingBy(Student::getSpeciality,
                        LinkedHashMap::new,
                        Collectors.groupingBy(Student::getYearOfStudy)));
    }

    public static boolean isStudentsExist(List<Student> students, int year, List <String> exceptSpecialities) {
        return students.stream()
                .filter(student -> !exceptSpecialities.contains(student.getSpeciality()))
                .anyMatch(student -> student.getYearOfStudy() == year);
    }
}
