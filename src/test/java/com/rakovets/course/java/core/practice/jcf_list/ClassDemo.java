package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.сlass.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.сlass.Student;
import com.rakovets.course.java.core.practice.jcf_list.сlass.comporators.StudentAgeComporator;
import com.rakovets.course.java.core.practice.jcf_list.сlass.comporators.StudentAverageAnnualMarkComporator;
import com.rakovets.course.java.core.practice.jcf_list.сlass.comporators.StudentNameAndSurnameComporator;

import java.util.ArrayList;
import java.util.Comparator;

public class ClassDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Aleksandrov", 14, 7.9));
        students.add(new Student("Ivan", "Aleksandrov", 15, 9.6));
        students.add(new Student("Serg", "Petrov", 17, 5.3));
        students.add(new Student("Andrey", "Andreev", 19, 9.1));
        System.out.println(students);

        Comparator<Student> studentAgeComporator = new StudentAgeComporator();
        students.sort(studentAgeComporator);
        System.out.println('\n' + "Sorts for age" + '\n');
        for (Student student : students) {
            System.out.print(student);
        }

        Comparator<Student> studentNameAndSurnameComporator = new StudentNameAndSurnameComporator();
        students.sort(studentNameAndSurnameComporator);
        System.out.println('\n' + "Sorts for name and surname" + '\n');
        for (Student student : students) {
            System.out.print(student);
        }

        Comparator<Student> studentAverageAnnualMarkComporator = new StudentAverageAnnualMarkComporator();
        students.sort(studentAverageAnnualMarkComporator);
        System.out.println('\n' + "Sorts for average annual mark" + '\n');
        for (Student student : students) {
            System.out.print(student);
        }

        SchoolClass schoolClass = new SchoolClass(students);
        System.out.println('\n' + "The best student is - " + schoolClass.getBestStudent(students));
    }
}
