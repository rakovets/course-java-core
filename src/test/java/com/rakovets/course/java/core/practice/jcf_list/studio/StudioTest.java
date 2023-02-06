package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorLastNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudioTest {
    private final Actor monroe = new Actor("Marilyn", "Monroe", 85, 3330);
    private final Actor stewart = new Actor("Patric", "Stewart", 82, 5450);
    private final Actor patel = new Actor("Dev", "Patel", 37, 5300);
    private final Actor penn = new Actor("Sean", "Penn", 62, 4700);
    private final Actor pitt = new Actor("Brad", "Pitt", 55, 5000);
    private final Actor cage = new Actor("Nicolas", "Cage", 56, 400);
    private final Actor levy = new Actor("Jane", "Levy", 35, 3000);
    private final Actor johansson = new Actor("Scarlett", "Johansson", 35, 4300);
    private final Actor streep = new Actor("Maryl", "Streep", 65, 6000);

    @Test
    public void fireTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, levy, streep));
        Studio warnerBroth = new Studio(actors);

        List<Actor> actual = warnerBroth.fire(actors);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, penn, pitt, patel));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fireTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, cage, pitt, levy, johansson));
        Studio warnerBroth = new Studio(actors);

        List<Actor> actual = warnerBroth.fire(actors);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, levy, johansson, pitt, patel));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ActorLastNameComparatorTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Actor> comparator = new ActorLastNameComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(johansson, levy, patel, pitt, stewart));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void ActorLastNameComparatorTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Actor> comparator = new ActorLastNameComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, monroe, patel, penn, pitt, streep));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void ActorAgeComparatorTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Actor> comparator = new ActorAgeComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(patel, pitt, cage, penn, streep, monroe));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void ActorAgeComparatorTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Actor> comparator = new ActorAgeComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, johansson, patel, pitt, stewart));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void ActorFeeComparatorTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Actor> comparator = new ActorFeeComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, monroe, penn, pitt, patel, streep));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void ActorFeeComparatorTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Actor> comparator = new ActorFeeComparator();

        actors.sort(comparator);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, johansson, pitt, patel, stewart));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void LastNameAndAgeComparatorTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Actor> comparator = new ActorLastNameComparator();
        Comparator<Actor> comparator2 = new ActorAgeComparator();

        actors.sort(comparator.thenComparing(comparator2));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(johansson, levy, patel, pitt, stewart));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void LastNameAndAgeComparatorTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Actor> comparator = new ActorLastNameComparator();
        Comparator<Actor> comparator2 = new ActorAgeComparator();

        actors.sort(comparator.thenComparing(comparator2));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, monroe, patel, penn, pitt, streep));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void FeeAndLastNameComparatorTest1() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Actor> comparator = new ActorFeeComparator();
        Comparator<Actor> comparator2 = new ActorLastNameComparator();

        actors.sort(comparator.thenComparing(comparator2));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, johansson, pitt, patel, stewart));
        Assertions.assertEquals(expected, actors);
    }

    @Test
    public void FeeAndLastNameComparatorTest2() {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Actor> comparator = new ActorFeeComparator();
        Comparator<Actor> comparator2 = new ActorLastNameComparator();

        actors.sort(comparator.thenComparing(comparator2));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, monroe, penn, pitt, patel, streep));
        Assertions.assertEquals(expected, actors);
    }
}
