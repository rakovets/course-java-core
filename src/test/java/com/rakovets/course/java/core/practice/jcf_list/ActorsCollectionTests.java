package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.models.Actor;
import com.rakovets.course.java.core.practice.jcf_list.models.Studio;
import com.rakovets.course.java.core.practice.jcf_list.comparators.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ActorsCollectionTests {
    List<Actor> actorsActual = new ArrayList<>(List.of(
        new Actor("Victor", "Polonnikov", 100.5, 40),
        new Actor("Andrew", "Airsmith", 101.5, 30),
        new Actor("John", "Turbey", 101.5, 20),
        new Actor("Bob", "Polonnikov", 90.5, 50)
    ));
    Studio studioActual = new Studio(actorsActual);

    @Test
    public void testToString() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("John", "Turbey", 101.5, 20),
            new Actor("Bob", "Polonnikov", 90.5, 50)
        ));
        Studio studioExpected = new Studio(actorsExpected);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testComparatorLastName() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Bob", "Polonnikov", 90.5, 50),
            new Actor("John", "Turbey", 101.5, 20)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        Comparator<Actor> comparatorLastName = new ActorsLastNameComparator();
        studioActual.getActors().sort(comparatorLastName);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testComparatorAge() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("John", "Turbey", 101.5, 20),
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Bob", "Polonnikov", 90.5, 50)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        Comparator<Actor> comparatorAge = new ActorsAgeComparator();
        studioActual.getActors().sort(comparatorAge);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testComparatorFee() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Bob", "Polonnikov", 90.5, 50),
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("John", "Turbey", 101.5, 20)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        Comparator<Actor> comparatorFee = new ActorsFeeComparator();
        studioActual.getActors().sort(comparatorFee);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testComparatorLastNameAndAge() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Bob", "Polonnikov", 90.5, 50),
            new Actor("John", "Turbey", 101.5, 20)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        Comparator<Actor> comparatorLastNameAndAge = new ActorsLastNameAndAgeComparator();
        studioActual.getActors().sort(comparatorLastNameAndAge);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testComparatorFeeAndLastName() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Bob", "Polonnikov", 90.5, 50),
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Andrew", "Airsmith", 101.5, 30),
            new Actor("John", "Turbey", 101.5, 20)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        Comparator<Actor> comparatorFeeAndLastName = new ActorsFeeAndLastNameComparator();
        studioActual.getActors().sort(comparatorFeeAndLastName);

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }

    @Test
    public void testFire() {
        List<Actor> actorsExpected = new ArrayList<>(List.of(
            new Actor("Victor", "Polonnikov", 100.5, 40),
            new Actor("Bob", "Polonnikov", 90.5, 50)
        ));
        Studio studioExpected = new Studio(actorsExpected);
        studioActual.fire(studioActual.getActors());

        Assertions.assertEquals(studioExpected.toString(), studioActual.toString());
    }
}
