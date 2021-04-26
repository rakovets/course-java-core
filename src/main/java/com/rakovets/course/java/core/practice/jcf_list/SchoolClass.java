package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    private List<Student> listOfStudents;

    public SchoolClass(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }


    public static Student getBestStudent(List<Student> listOfStudents) {
        double bestAverageMark =  0.0;
        int index = 0;
        for (int i = 0; i < listOfStudents.size(); i++) {
            if(listOfStudents.get(i).getAverageAnnualMark() > bestAverageMark) {
                bestAverageMark = listOfStudents.get(i).getAverageAnnualMark();
                index = i;
            }
        }
        return listOfStudents.get(index);
    }


}
