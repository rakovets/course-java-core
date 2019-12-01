package com.rakovets.java.task.collections.list.school;

import java.util.ArrayList;
import java.util.Collections;

public class SchoolUtil {

    public Student getBestStudent(ArrayList<Student> list) {
        Collections.sort(list, new CamporatorOfAvaverageAnnualMark());
        return list.get(list.size() - 1);
    }
}
