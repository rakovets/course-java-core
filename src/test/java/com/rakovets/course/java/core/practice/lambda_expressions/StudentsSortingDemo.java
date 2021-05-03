package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.example.lambda_expressions.lambda.model.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsSortingDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("name1", "sur1", "B", 2));
        students.add(new Student("name2", "sur2", "ZZ", 2));
        students.add(new Student("name3", "sur3", "A", 1));
        students.add(new Student("n", "s", "K", 2));

        Map<Integer, List<Student>> map = StudentsSorting.groupingByCourse(students);

        for (Map.Entry<Integer, List<Student>> m : map.entrySet()) {
            System.out.println("Course:" + m.getKey());
            for (Student s : m.getValue()) {
                System.out.println(" ----> " + s.getName());
            }


            List<String> spec = StudentsSorting.getSpec(students);
            for (String s : spec) {
                System.out.println(s);
            }



        }
    }
}
