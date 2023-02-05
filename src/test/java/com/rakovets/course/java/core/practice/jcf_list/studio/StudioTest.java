package com.rakovets.course.java.core.practice.jcf_list.studio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudioTest {
    Actor dzmitry = new Actor("Dzmitry", "Krasiuk", 850, 29);
    Actor alexander = new Actor("Alexander", "Braim", 940, 27);
    Actor elena = new Actor("Elena", "Pankova", 820, 33);
    Actor julia = new Actor("Julia", "Serbskaya", 875, 25);
    Studio sonyVision;

    @BeforeEach
    void init() {
        sonyVision = new Studio(new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia)));
    }

    @DisplayName("Test of fire(), returns actors list with removed actor who has highest salary")
    @Test
    void fireTest() {
        sonyVision = sonyVision.fire(sonyVision.getActors());
        Studio expected = new Studio(new ArrayList<>(Arrays.asList(dzmitry, elena, julia)));

        Assertions.assertEquals(expected.getActors(), sonyVision.getActors());
    }


}
