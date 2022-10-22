package com.rakovets.course.java.core.practice.jcf_list.project_class;

import com.rakovets.course.java.core.practice.jcf_list.comparators_for_students.StudentAverageAnnualMarkComparator;
import java.util.Comparator;
import java.util.List;

public class SchoolClass {
    private List<Person> students;

    public Person getBestStudent(List<Person> students) {
        Comparator<Person> comparator = new StudentAverageAnnualMarkComparator();
        students.sort(comparator);
        return students.get(students.size() - 1);
    }
}
