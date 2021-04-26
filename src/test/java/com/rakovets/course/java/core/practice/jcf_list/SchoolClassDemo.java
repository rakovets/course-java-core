package com.rakovets.course.java.core.practice.jcf_list;


import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.comparator.compAve;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.comparator.compAge;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.comparator.compareFullname;
import com.rakovets.course.java.core.practice.jcf_list.SchoolClass.model.Student;


import java.util.ArrayList;
import java.util.List;

public class SchoolClassDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Omen", "Antichrist", 1, 6.66));
        studentList.add(new Student("Ivan", "Ivanov", 15, 5.55));
        studentList.add(new Student("Igor", "Smirnov", 14, 4.44));
        studentList.add(new Student("Ivor", "Ragnarovich", 13, 3.33));
        compAge compareAge = new compAge();
        compAve compareAve = new compAve();
        compareFullname compareFullname = new compareFullname();
        SchoolClass schoolClass = new SchoolClass(studentList);

        studentList.sort(compareAge);
        listOutput(studentList);
        studentList.sort(compareAve);
        listOutput(studentList);
        studentList.sort(compareFullname);
        listOutput(studentList);
        System.out.println(schoolClass.getBestStudent(studentList));

    }

    private static void listOutput(List<Student> students) {
        for (Student i : students) {
            System.out.println(i.toString());
        }
        System.out.print("\n");
    }
}
