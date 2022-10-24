package com.rakovets.course.java.core.practice.jcf_list;
import com.rakovets.course.java.core.practice.jcf_list.school.Person;
import com.rakovets.course.java.core.practice.jcf_list.school.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.AverageMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.FullNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
    public class TestSchoolClass {
        SchoolClass schoolClass = new SchoolClass();
        List<Person> personList = new ArrayList<>(List.of(
                new Person("Elena", "Shalokha", 16, 8.5),
                new Person("Angelina", "Prokhorova", 17, 7.5),
                new Person("Anastasia", "Alekseeva", 15, 4.3),
                new Person("Ksenia", "Pivchik", 16, 7.8),
                new Person("Anton", "Senevich", 17, 6.6)));

        @Test
        void testGetBestStudent() {
            //WHEN
            Person actual = schoolClass.getBestStudent(personList);
            Person expected = new Person("Elena", "Shalokha", 16, 8.5);

            //THEN
            Assertions.assertEquals(expected, actual);
        }

        @Test
        void testFullNameComparator() {
            personList.sort(new FullNameComparator());

            List<Person> expected = new ArrayList<>(List.of(
                    new Person("Elena", "Shalokha", 16, 8.5),
                    new Person("Ksenia", "Pivchik", 16, 7.8),
                    new Person("Anastasia", "Alekseeva", 15, 4.3),
                    new Person("Angelina", "Prokhorova", 17, 7.5),
                    new Person("Anton", "Senevich", 17, 6.6)));

            Assertions.assertEquals(expected, personList);
        }

        @Test
        void testAgeComparator() {
            personList.sort(new AgeComparator());

            List<Person> expected = new ArrayList<>(List.of(
                    new Person("Elena", "Shalokha", 16, 8.5),
                    new Person("Angelina", "Prokhorova", 17, 7.5),
                    new Person("Anton", "Senevich", 17, 6.6),
                    new Person("Ksenia", "Pivchik", 16, 7.8),
                    new Person("Anastasia", "Alekseeva", 15, 4.3)));

            Assertions.assertEquals(expected, personList);
        }
    }
