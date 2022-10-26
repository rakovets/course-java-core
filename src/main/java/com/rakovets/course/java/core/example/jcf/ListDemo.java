package com.rakovets.course.java.core.example.jcf;

import com.rakovets.course.java.core.example.jcf.comparator.StudentFeeComparator;
import com.rakovets.course.java.core.example.jcf.comparator.StudentNameAndFeeComparator;
import com.rakovets.course.java.core.example.jcf.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Student> groupJd1_117 = new ArrayList<>();
        groupJd1_117.add(new Student("Petr", 123));
        groupJd1_117.add(0, new Student("Olga", 234));
        groupJd1_117.add(1, new Student("Petr",345));
        groupJd1_117.add(0, new Student("Lol",456));

        System.out.println(groupJd1_117);

        Comparator<Student> comparator = new StudentNameAndFeeComparator();
        groupJd1_117.sort(comparator);

        System.out.println(groupJd1_117);
    }
}
