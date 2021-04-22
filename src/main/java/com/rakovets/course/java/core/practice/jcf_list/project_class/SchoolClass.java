package com.rakovets.course.java.core.practice.jcf_list.project_class;

import com.rakovets.course.java.core.practice.jcf_list.project_class.model.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    List<Student> students;

    public SchoolClass(List<Student> students) {
        this.students = students;
    }

    public void getBestStudent(SchoolClass listOfStudent) {
        double averageAnnualMark = 0;
        List<Student> bestStudent = new ArrayList<>();
        for (int i = 0; i < listOfStudent.students.size(); i++) {
            if (listOfStudent.students.get(i).getAverageAnnualMark() > averageAnnualMark) {
                averageAnnualMark = listOfStudent.students.get(i).getAverageAnnualMark();
            }
        }
        for(int i = 0; i<listOfStudent.students.size(); i++) {
            if(listOfStudent.students.get(i).getAverageAnnualMark() == averageAnnualMark) {
                bestStudent.add(listOfStudent.students.get(i));
            }
        }
        listOfStudent.students.retainAll(bestStudent);
    }
    @Override
    public String toString() {
        return "Students -"+students;
    }
}
