package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    List<Student> students;

    public SchoolClass(List<Student> students) {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void getBestStudent(List<Student> students) {
        Collections.sort(students, getAverageMark);
        students.get(students.size() - 1);
    }

    public final static Comparator<Student>  getAverageMark = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
         return student1.getAverageAnnualMark() - student2.getAverageAnnualMark();
        }
    };

    public final static Comparator<Student> getAge = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return student1.getAge() - student2.getAge();
        }
    };

    public final static Comparator<Student> getAllName = new Comparator<Student>() {
        @Override
        public int compare(Student student1, Student student2) {
            return  (student1.getName() + student1.getSurname()).compareTo(student2.getName() + student2.getSurname());
        }
    };
}
