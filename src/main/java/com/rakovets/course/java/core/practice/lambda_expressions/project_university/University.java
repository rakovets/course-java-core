package com.rakovets.course.java.core.practice.lambda_expressions.project_university;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class University {
    public static Map<Integer, List<Student>> groupStudentByCourse(List<Student> studentList) {
        return studentList.stream().collect(Collectors.groupingBy(Student::getCourse));
    }

    public static List<String> getSpecialty(List<Student> studentList) {
        return studentList.stream()
                .map(Student::getSpecialty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Map<String, Long> getCountSpecialty(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getSpecialty, Collectors.counting()));
    }

    public static Map<String, Map<Integer, List<Student>>> groupStudentBySpecialty(List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getSpecialty))
                .collect(Collectors.groupingBy(Student::getSpecialty,
                        LinkedHashMap::new,
                        Collectors.groupingBy(Student::getCourse)));
    }

    public static boolean checkIfStudentIsOnCourse(List<Student> studentList, String name, String surname, int course) {
        return studentList.stream()
                .filter(s -> s.getCourse() == course)
                .filter(s -> s.getSurname().equals(surname))
                .anyMatch(s -> s.getName().equals(name));
    }

    public static void printMapGroupByCourse(Map<Integer, List<Student>> map) {
        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
            Integer course = entry.getKey();
            List<Student> studentList = entry.getValue();
            System.out.println(course + "=" + studentList);
        }
    }

    public static void printMapGroupBySpecialty(Map<String, Map<Integer, List<Student>>> map) {
        for (Map.Entry<String, Map<Integer, List<Student>>> entry : map.entrySet()) {
            String specialty = entry.getKey();
            Map<Integer, List<Student>> listMap = entry.getValue();
            System.out.println(specialty + "=" + listMap);
        }
    }
}
