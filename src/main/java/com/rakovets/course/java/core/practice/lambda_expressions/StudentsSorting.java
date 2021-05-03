package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.HashMap;
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

}


        /*
    Дан список студентов. Каждый студент имеет:

Написать utility class, который реализует следующие методы:

групировка студентов по курсу

получение списка специальностей (в алфавитном порядке), на которых учатся студенты

получение количество учащихся на каждой из специальностей

групировка студентов по специальностям (сохраняя алфавитный порядок специальности), а затем группировки по курсу

проверка, есть ли среди учащихся кокретного курса, за исключение списка каких-то специальностей
     */

