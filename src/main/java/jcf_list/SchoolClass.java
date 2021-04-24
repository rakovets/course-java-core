package jcf_list;

import com.rakovets.course.java.core.practice.Actor;
import jcf_list.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private ArrayList<Student> student;

    public SchoolClass(ArrayList<Student> student) {
        this.student = student;
    }

    public Student getBestStudent() {
        Student bestStudent = student.get(0);
        for (Student student : student) {
            if (student.getAverageAnnualMark() > bestStudent.getAverageAnnualMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
