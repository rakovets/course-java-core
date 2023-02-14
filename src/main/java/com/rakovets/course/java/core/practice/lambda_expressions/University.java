package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class University {
    private Collection<Student> students = new ArrayList<>();

    public boolean addToUniversity(Collection<Student> students) {
        if (students != null) {
            this.students = students;
            return true;
        } else {
            return false;
        }
    }

    public Collection<Student> getStudents() {
        for (Student student : students) {
            System.out.print(student + "; ");
        }
        return this.students;
    }

    public Collection<Student> getStudentsBySemester(int semester) {
        return students.stream().filter((student -> student.getCurrentSemester() == semester)).collect(Collectors.toCollection(ArrayList::new));
    }
    public Collection<Specialty> getListOfSpecialties() {
        return students.stream().map(Student::getSpecialty).collect(Collectors.toCollection(TreeSet::new));
    }
    public Map<Specialty, Long> getStudentsGroupedBySpecialty() {
        return students.stream().collect(Collectors.groupingBy(Student::getSpecialty, Collectors.counting()));
    }
}
