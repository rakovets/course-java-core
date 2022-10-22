package com.rakovets.course.java.core.practice.jcf_list.project_class;

import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsNameAndSurnameComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.models.Person;
import com.rakovets.course.java.core.practice.jcf_list.project_class.models.SchoolClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoSchoolClass {
    public static void main(String[] args) {
        List<Person> students = new ArrayList<>();
        students.add(new Person("Victor", "Polonnikov", 15, 8.2));
        students.add(new Person("Andrew", "Throw", 16, 7.2));
        students.add(new Person("Victor", "Tarken", 15, 7.8));
        students.add(new Person("Sam", "Dillan", 16, 8.5));

        SchoolClass schoolClass = new SchoolClass(students);
        System.out.println(schoolClass);
        System.out.println(schoolClass.getBestStudent(students));

        Comparator<Person> comparatorAge = new StudentsAgeComparator();
        schoolClass.getStudents().sort(comparatorAge);
        System.out.println(schoolClass);

        Comparator<Person> comparatorAverageAnnualMark = new StudentsAverageAnnualMarkComparator();
        schoolClass.getStudents().sort(comparatorAverageAnnualMark);
        System.out.println(schoolClass);

        Comparator<Person> comparatorNameAndSurname = new StudentsNameAndSurnameComparator();
        schoolClass.getStudents().sort(comparatorNameAndSurname);
        System.out.println(schoolClass);
    }
}
