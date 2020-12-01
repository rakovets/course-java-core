package com.rakovets.course.javabasics.practice.lambdaexpressions.university;

import com.sun.source.tree.Tree;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class University {
    public static Map<String, List<Student>> getStudentGroupByYearOfStudy(Collection<Student> university) {
        return university.stream().
                collect(Collectors.groupingBy(Student::getYearOfStudy));
    }
    public static List<String> getListSpecialities(Collection<Student> university) {
        return university.stream().
                map(Student::getSpecialty).
                distinct().
                sorted().
                collect(Collectors.toList());
    }
    public static Map<String, Long> getNumberOfStudentsForEachSpecialty(Collection<Student> university) {
        return university.stream().
                collect(Collectors.groupingBy(Student::getSpecialty, Collectors.counting()));
    }
    public static TreeMap<String, Map<String,List<Student>>> getStudentsGroupedBySpecialtiesAndYearOfStudy(Collection<Student> university) {
        Map<String, Map<String, List<Student>>> students = university.stream().
                collect(Collectors.groupingBy(Student::getSpecialty,
                                Collectors.groupingBy(Student::getYearOfStudy)));
        TreeMap<String, Map<String,List<Student>>> sortedStudents = new TreeMap<>(students);
        return sortedStudents;
    }
    public static Map<String, Map<Boolean, List<Student>>> isStudentOnSpecialty(Collection<Student> university, String specialty) {
        return university.stream().
                collect(Collectors.groupingBy(Student::getYearOfStudy,
                        Collectors.partitioningBy(st -> st.getSpecialty().equals(specialty))));
    }
}
