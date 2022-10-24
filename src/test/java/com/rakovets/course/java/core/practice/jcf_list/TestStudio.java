package com.rakovets.course.java.core.practice.jcf_list;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.FeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.LastNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.FeeLastNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.LastNameAgeComparator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestStudio {
    Studio studio = new Studio();
    List<Actor> actors = new ArrayList<>(List.of(
            new Actor("Masha", "Popova", 100, 15),
            new Actor("Vika", "Sergeeva", 200, 17),
            new Actor("Pasha", "Bobko", 300, 20),
            new Actor("Roman", "Malushin", 400, 22),
            new Actor("Dima", "Kolas", 500, 35)));

    @Test
    void testFire() {
        List<Actor> actual = studio.fire(actors);
        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Roman", "Malushin", 400, 22),
                new Actor("Pasha", "Bobko", 300, 20),
                new Actor("Vika", "Sergeeva", 200, 17),
                new Actor("Masha", "Popova", 100, 15)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAgeComparator() {
        actors.sort(new AgeComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Masha", "Popova", 100, 15),
                new Actor("Vika", "Sergeeva", 200, 17),
                new Actor("Pasha", "Bobko", 300, 20),
                new Actor("Roman", "Malushin", 400, 22),
                new Actor("Dima", "Kolas", 500, 35)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testLastNameComparator() {
        actors.sort(new LastNameComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Pasha", "Bobko", 300, 20),
                new Actor("Dima", "Kolas", 500, 35),
                new Actor("Roman", "Malushin", 400, 22),
                new Actor("Masha", "Popova", 100, 15),
                new Actor("Vika", "Sergeeva", 200, 17)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testFeeAndLastNameComparator() {
        actors.sort(new FeeLastNameComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Roman", "Malushin", 400, 22),
                new Actor("Pasha", "Bobko", 300, 20),
                new Actor("Vika", "Sergeeva", 200, 17),
                new Actor("Masha", "Popova", 100, 15)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testLastNameAndAgeComparator() {
        actors.sort(new LastNameAgeComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Pasha", "Bobko", 300, 20),
                new Actor("Dima", "Kolas", 500, 35),
                new Actor("Roman", "Malushin", 400, 22),
                new Actor("Masha", "Popova", 100, 15),
                new Actor("Vika", "Sergeeva", 200, 17)));

        Assertions.assertEquals(expected, actors);
    }
}
