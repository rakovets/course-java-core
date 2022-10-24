package com.rakovets.course.java.core.practice.jcf_list.school.comparator;
import com.rakovets.course.java.core.practice.jcf_list.school.Person;
import java.util.Comparator;
public class FullNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        var result = person1.getName().compareTo(person2.getName());
        if (result == 0) {
            return person1.getSurname().compareTo(person2.getSurname());
        } else {
            return result;
        }
    }
}
