package com.rakovets.course.java.core.practice.jcf_list.clazz;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SchoolClass {
    List<Person> students;

    /**
     * Constructor.
     *
     * @param students students list.
     */
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

    /**
     * Comparator by name.
     */
    public static class NameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFullName().compareTo(o2.getFullName());
        }
    }

    /**
     * Comparator by age.
     */
    public static class AgeComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    /**
     * Comparator by average annual mark.
     */
    public static class AverageAnnualMarkComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return Double.compare(o1.getAverageAnnualMark(), o2.getAverageAnnualMark());
        }
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

    public List<Person> getStudents() {
        return students;
    }
}
