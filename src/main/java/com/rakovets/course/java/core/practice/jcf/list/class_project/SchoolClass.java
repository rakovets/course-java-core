package com.rakovets.course.java.core.practice.jcf.list.class_project;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        Student best = students.get(0);

        for (Student student : students) {
            if (best.compareTo(student) < 0) {
                best = student;
            }
        }
        return best;
    }

    public void printClassList() {
        for (Student a : this.getStudents()) {
            System.out.println(a);
        }
        System.out.print("\n");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
