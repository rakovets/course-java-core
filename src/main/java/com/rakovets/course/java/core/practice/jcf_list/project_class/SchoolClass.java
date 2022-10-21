package com.rakovets.course.java.core.practice.jcf_list.project_class;

import java.util.Collection;
import java.util.List;

public class SchoolClass {
    private Collection<Person> students;

    /**
     * The method takes a list of students and returns the student with the highest GPA
     *
     * @param persons input parameter in the form list of students
     * @return the student with the highest GPA
     */
    public Person getBestStudent(List<Person> persons) {
        int index = 0;
        double temporaryAverageAnnualMarkForComparing = 0;

        for (Person person : persons) {

            if (person.getAverageAnnualMark() > temporaryAverageAnnualMarkForComparing) {
                temporaryAverageAnnualMarkForComparing = person.getAverageAnnualMark();
                index = persons.indexOf(person);
            }
        }
        return persons.get(index);
    }
}
