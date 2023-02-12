package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.comparators.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProjectStudioTest {
    Studio studio;
    ArrayList<Actor> actorsList;
    private final Actor JAMES_GOSLING = new Actor(" James", "Gosling", 195500, 67);
    private final Actor WILLIAM_JOY = new Actor(" William", "Joy", 195400, 68);
    private final Actor GUY_STEELE = new Actor(" Guy", "Steele", 195400, 68);
    private final Actor ROSSUM_GUIDO_VAN = new Actor(" Rossum", "Guido van", 195600, 67);
    private final Actor LINUS_TORVALDS = new Actor(" Linus", "Torvalds", 196900, 53);

    @BeforeEach
    void initTestData() {
        studio = new Studio();
        actorsList = new ArrayList<>(Arrays.asList(JAMES_GOSLING, WILLIAM_JOY, GUY_STEELE, ROSSUM_GUIDO_VAN, LINUS_TORVALDS));
    }

    @Test
    void fireTest() {
        List<Actor> expectedList = Arrays.asList(ROSSUM_GUIDO_VAN, JAMES_GOSLING, GUY_STEELE, WILLIAM_JOY);

        studio.fire(actorsList);

        Assertions.assertEquals(expectedList, actorsList);
    }

    @Test
    void actorLastNameComparatorTest() {
        List<Actor> expectedList = Arrays.asList(JAMES_GOSLING, ROSSUM_GUIDO_VAN, WILLIAM_JOY, GUY_STEELE, LINUS_TORVALDS);
        Comparator<Actor> comparator = new ActorLastNameComparator();

        actorsList.sort(comparator);

        Assertions.assertEquals(expectedList, actorsList);
    }

    @Test
    void actorAgeComparatorTest() {
        List<Actor> expectedList = Arrays.asList(LINUS_TORVALDS, JAMES_GOSLING, ROSSUM_GUIDO_VAN, WILLIAM_JOY, GUY_STEELE);
        Comparator<Actor> comparator = new ActorAgeComparator();

        actorsList.sort(comparator);

        Assertions.assertEquals(expectedList, actorsList);
    }

    @Test
    void actorFeeComparatorTest() {
        List<Actor> expectedList = Arrays.asList(WILLIAM_JOY, GUY_STEELE, JAMES_GOSLING, ROSSUM_GUIDO_VAN, LINUS_TORVALDS);
        Comparator<Actor> comparator = new ActorFeeComparator();

        actorsList.sort(comparator);

        Assertions.assertEquals(expectedList, actorsList);
    }

    @Test
    void actorLastNameAndAgeComparatorTest() {
        List<Actor> expectedList = Arrays.asList(JAMES_GOSLING, ROSSUM_GUIDO_VAN, WILLIAM_JOY, GUY_STEELE, LINUS_TORVALDS);
        Comparator<Actor> comparator = new ActorLastNameAndAgeComparator();

        actorsList.sort(comparator);

        Assertions.assertEquals(expectedList, actorsList);
    }

    @Test
    void actorFeeAndLastNameComparatorTest() {
        List<Actor> expectedList = Arrays.asList(WILLIAM_JOY, GUY_STEELE, JAMES_GOSLING, ROSSUM_GUIDO_VAN, LINUS_TORVALDS);
        Comparator<Actor> comparator = new ActorFeeAndLastNameComparator();

        actorsList.sort(comparator);

        Assertions.assertEquals(expectedList, actorsList);
    }
}
