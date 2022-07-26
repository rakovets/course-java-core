package com.rakovets.course.java.core.practice.jcf_list.clazz;

import com.rakovets.course.java.core.practice.jcf_list.clazz.comparator.AverageAnnualMarkComparator;

import java.util.List;
import java.util.Objects;

public class SchoolClass {
    List<Person> students;

    public SchoolClass(List<Person> students) {
        this.students = students;
    }

    /**
     * Finds the student with the highest GPA.
     *
     * @param students list of students.
     * @return best student
     */
    public Person getBestStudent(List<Person> students) {
        students.sort(new AverageAnnualMarkComparator());

        return students.get(students.size() - 1);
    }

    public List<Person> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchoolClass that = (SchoolClass) o;

        return students.equals(that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}
