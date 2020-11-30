package com.rakovets.course.javabasics.example.generics.model;

import java.util.ArrayList;
import java.util.Comparator;

public class SchoolClass {

    private ArrayList<Student> students;

    public SchoolClass(ArrayList<Student> students) {
        this.students = students;
    }

    public Student getBestStudent() {
        students.sort(mark);
        return students.get(0);
    }

    public Comparator<? super Student> mark = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            int accuracy = 10;
            return (int)((student2.getAverageAnnualMark() - student1.getAverageAnnualMark())*accuracy);
        }
    };

    public Comparator<? super Student> name = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            if (student1.getName().compareTo(student2.getName()) != 0)
                return student1.getName().compareTo(student2.getName());
            else return student1.getSurname().compareTo(student2.getSurname());
        }
    };

    public Comparator<? super Student> age = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student2.getAge() - student1.getAge();
        }
    };

    public String getNames() {
        String result = "";
        for (Student student : students) {
            result += student.getName() + " ";
        }
        return result.trim();
    }

    public String getSurnames() {
        String result = "";
        for (Student student : students) {
            result += student.getSurname() + " ";
        }
        return result.trim();
    }

    public String getAges() {
        String result = "";
        for (Student student : students) {
            result += student.getAge() + " ";
        }
        return result.trim();
    }

    public String getMarks() {
        String result = "";
        for (Student student : students) {
            result += student.getAverageAnnualMark() + " ";
        }
        return result.trim();
    }

}