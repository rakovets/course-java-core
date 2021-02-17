package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class University {
    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    public Map<Integer, List<Student>> getGroupByCourse() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));

    }

    public List<String> getListOfSpecialty() {
        return students.stream()
                .map(Student::getSpecialty)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Map<String, Long> getNumberStudentsOfSpeciality() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getSpecialty,
                        (Collectors.counting())));

    }

    public Map<Integer, List<Student>> getGroupBySpecialityAndCourse() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourse));

    }

    public boolean checkStudent(String name, String surname, List<String> listOfIgnoreSpeciality, int course) {
        long counter = students.stream()
                .filter(e -> !listOfIgnoreSpeciality.contains(e.getSpecialty()))
                .filter(e -> e.getCourse() == course)
                .filter(e -> e.getSurname().equals(surname))
                .filter(e -> e.getName().equals(name))
                .count();
        return counter > 0;
    }
}
