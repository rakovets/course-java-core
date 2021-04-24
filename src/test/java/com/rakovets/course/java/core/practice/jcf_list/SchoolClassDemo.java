package com.rakovets.course.java.core.practice.jcf_list;


import com.rakovets.course.java.core.practice.jcf_list.project_class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparator.StudentAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparator.StudentLastNameAndNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SchoolClassDemo {
    public  static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Oleg", "Busheyko", 29, 8.1));
        studentList.add(new Student("Olga", "Kurach", 27, 8.1));
        studentList.add(new Student("Olga", "Ivanova", 26, 5.2));
        studentList.add(new Student("Olga", "Ivanovich", 27, 5.2));
        SchoolClass schoolClass = new SchoolClass(studentList);
       // schoolClass.getBestStudent(schoolClass);

        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(schoolClass);
        Comparator<Student> byName = new StudentLastNameAndNameComparator();
        studentList.sort(byName);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(studentList);
        Comparator<Student> byAge = new StudentAgeComparator();
        studentList.sort(byAge);
        System.out.println(studentList);
    }
}
