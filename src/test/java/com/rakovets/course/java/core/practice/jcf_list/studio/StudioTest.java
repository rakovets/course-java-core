package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorLastNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    private final Actor johansson = new Actor("Scarlett", "Johansson", 33, 4300);
    private final Actor streep = new Actor("Maryl", "Streep", 65, 6000);
    private ArrayList<Actor> actorsOne;
    private ArrayList<Actor> actorsTwo;
    private Comparator<Actor> comparatorLastName;
    private Comparator<Actor> comparatorAge;
    private Comparator<Actor> comparatorFee;

    @BeforeEach
    public void init() {
        actorsOne = new ArrayList<>(Arrays.asList(
                new Actor("Marilyn", "Monroe", 85, 3330),
                new Actor("Dev", "Patel", 37, 5300),
                new Actor("Sean", "Penn", 62, 4700),
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Maryl", "Streep", 65, 6000)));
        actorsTwo = new ArrayList<>(Arrays.asList(
                new Actor("Patric", "Stewart", 82, 5450),
                new Actor("Dev", "Patel", 37, 5300),
                new Actor("Nicolas", "Cage", 56, 400),
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Scarlett", "Johansson", 33, 4300)));
        comparatorLastName = new ActorLastNameComparator();
        comparatorAge = new ActorAgeComparator();
        comparatorFee = new ActorFeeComparator();
    }

    @Test
    public void fireTest1() {
        Studio warnerBroth = new Studio(actorsOne);

        List<Actor> actual = warnerBroth.fire(actorsOne);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, penn, pitt, patel));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void fireTest2() {
        Studio warnerBroth = new Studio(actorsTwo);

        List<Actor> actual = warnerBroth.fire(actorsTwo);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, levy, johansson, pitt, patel));
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ActorLastNameComparatorTest1() {
        actorsOne.sort(comparatorLastName);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, patel, penn, pitt, streep));
        Assertions.assertEquals(expected, actorsOne);
    }

    @Test
    public void ActorLastNameComparatorTest2() {
        actorsTwo.sort(comparatorLastName);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, johansson, levy, patel, pitt, stewart));
        Assertions.assertEquals(expected, actorsTwo);
    }

    @Test
    public void ActorAgeComparatorTest1() {
        actorsOne.sort(comparatorAge);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, patel, pitt, penn, streep, monroe));
        Assertions.assertEquals(expected, actorsOne);
    }

    @Test
    public void ActorAgeComparatorTest2() {
        actorsTwo.sort(comparatorAge);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(johansson, levy, patel, pitt, cage, stewart));
        Assertions.assertEquals(expected, actorsTwo);
    }

    @Test
    public void ActorFeeComparatorTest1() {
        actorsOne.sort(comparatorFee);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, penn, pitt, patel, streep));
        Assertions.assertEquals(expected, actorsOne);
    }

    @Test
    public void ActorFeeComparatorTest2() {
        actorsTwo.sort(comparatorFee);

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, levy, johansson, pitt, patel, stewart));
        Assertions.assertEquals(expected, actorsTwo);
    }

    @Test
    public void LastNameAndAgeComparatorTest1() {
        actorsTwo.sort(comparatorLastName.thenComparing(comparatorAge));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, johansson, levy, patel, pitt, stewart));
        Assertions.assertEquals(expected, actorsTwo);
    }

    @Test
    public void LastNameAndAgeComparatorTest2() {
        actorsOne.sort(comparatorLastName.thenComparing(comparatorAge));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, patel, penn, pitt, streep));
        Assertions.assertEquals(expected, actorsOne);
    }

    @Test
    public void FeeAndLastNameComparatorTest1() {
        actorsTwo.sort(comparatorFee.thenComparing(comparatorLastName));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(cage, levy, johansson, pitt, patel, stewart));
        Assertions.assertEquals(expected, actorsTwo);
    }

    @Test
    public void FeeAndLastNameComparatorTest2() {
        actorsOne.sort(comparatorFee.thenComparing(comparatorLastName));

        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(levy, monroe, penn, pitt, patel, streep));
        Assertions.assertEquals(expected, actorsOne);
    }
}
