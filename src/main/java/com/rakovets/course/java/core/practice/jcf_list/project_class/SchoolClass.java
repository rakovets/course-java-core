package com.rakovets.course.java.core.practice.jcf_list.project_class;

import java.util.List;

public class SchoolClass {
    private List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public Student getBestStudent(List<Student> students) {
        Student bestStudent = students.get(0);

        for (Student student : students) {
            if (bestStudent.compareTo(student) < 0) {
                bestStudent = student;
            }
        }
        return bestStudent;
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
}
