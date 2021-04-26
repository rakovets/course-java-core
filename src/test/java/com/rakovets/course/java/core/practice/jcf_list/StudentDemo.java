package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list._class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list._class.Student;
import com.rakovets.course.java.core.practice.jcf_list._class.comparator.StudentAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list._class.comparator.StudentAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list._class.comparator.StudentNameAndSurnameComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Joey", "Tribbiani", 24, 7));
        students.add(new Student("Ross", "Geller", 27, 10));
        students.add(new Student("Chandler", "Bing", 25, 9));
        students.add(new Student("Raychel", "Grin", 25, 6));
        students.add(new Student("Monica", "Geller", 26, 8));
        students.add(new Student("Phoebe", "Buffay", 23, 5));

        SchoolClass schoolClass = new SchoolClass(students);
        System.out.println(schoolClass.getBestStudent(students));
        students.sort(new StudentNameAndSurnameComparator());
        System.out.println(students);
        students.sort(new StudentAgeComparator());
        System.out.println(students);
        students.sort(new StudentAverageAnnualMarkComparator());
        System.out.println(students);
    }
}
