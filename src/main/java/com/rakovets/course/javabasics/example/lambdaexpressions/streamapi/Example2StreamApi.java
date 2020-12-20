package com.rakovets.course.javabasics.example.lambdaexpressions.streamapi;

import com.rakovets.course.javabasics.example.lambdaexpressions.streamapi.model.Student;

import java.util.List;
import java.util.stream.Stream;

public class Example2StreamApi {
    public static void main(String[] args) {
        List<Student> group = List.of(
                new Student("Bill", "Snow", 30, 1000),
                new Student("Jon", "Week", 40, 1200),
                new Student("Pit", "Pen", 18, 2000),
                new Student("Alias", "White", 25, 1300)
        );

        // Task: print ll students
        System.out.println("All students 1:");
        Stream<Student> stream = group.stream();
        stream.forEach((Student student) -> System.out.println(student));

        // Task: print ll students
        System.out.println("All students 2:");
        Stream<Student> stream2 = group.stream();
        stream2.forEach(System.out::println);
//        stream2.forEach(System.out::println); // IllegalStateException (Stream can be used ONLY ONE time)

        // Task: print ll students
        System.out.println("All students 3:");
        group.stream().forEach(System.out::println);

        // Task: print ll students
        System.out.println("All students 4:");
        group.forEach(System.out::println);

        // Task: filtered students by Criteria
        System.out.println("Filtered students 1:");
        Stream<Student> studentStream = group.stream();
        Stream<Student> filteredStudentStream = studentStream.filter(student -> fitsCriteria(student));
        filteredStudentStream.forEach(System.out::println);

        // Task: filtered students by Criteria
        System.out.println("Filtered students 2:");
        group.stream()
                .filter(student -> fitsCriteria(student))
                .forEach(System.out::println);

        // Task: filtered students by Criteria
        System.out.println("Filtered students 3:");
        group.stream()
                .filter(Example2StreamApi::fitsCriteria)
                .forEach(System.out::println);

        // Task: get all sum for fee.
        System.out.println("Total fee: ");
        int totalFee = group.stream()
                .mapToInt(Student::getFee)
                .reduce(0, Integer::sum);
        System.out.println(totalFee);
    }

    private static boolean fitsCriteria(Student student) {
        return student.getAge() < 25 && student.getFee() > 1400;
    }
}
