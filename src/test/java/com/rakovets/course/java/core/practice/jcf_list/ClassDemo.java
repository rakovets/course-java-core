package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.Class.comparator.StudentComparatorForAge;
import com.rakovets.course.java.core.practice.jcf_list.Class.comparator.StudentComparatorForAverageAnnualMark;
import com.rakovets.course.java.core.practice.jcf_list.Class.comparator.StudentComparatorForNameAndUsername;
import com.rakovets.course.java.core.practice.jcf_list.Class.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassDemo {
    public static void main(String[] args) {
        SchoolClass schoolClass = new SchoolClass();
        StudentComparatorForNameAndUsername compNameUsername = new StudentComparatorForNameAndUsername();
        StudentComparatorForAge compAge = new StudentComparatorForAge();
        StudentComparatorForAverageAnnualMark compAverageMark = new StudentComparatorForAverageAnnualMark();
        List<Student> studentsList = new ArrayList<>(List.of(
                new Student("Tokamo", "Senti", 12, 2),
                new Student("Johnny", "Silverhand", 13, 8.5),
                new Student("Kerry", "Evrodin", 11, 3.2),
                new Student("Judy", "Alvarez", 14, 5.6),
                new Student("Viktor", "Vektor", 14, 9)));

        listOutput(studentsList);
        studentsList.sort(compNameUsername);
        listOutput(studentsList);
        studentsList.sort(compAge);
        listOutput(studentsList);
        studentsList.sort(compAverageMark);
        listOutput(studentsList);
        System.out.println(schoolClass.getBestStudent(studentsList));
    }

    private static void listOutput(List<Student> actors) {
        for (Student i : actors) {
            System.out.println(i.toString());
        }
        System.out.print("\n");
    }
}
