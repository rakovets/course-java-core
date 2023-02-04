package com.rakovets.course.java.core.practice.jcf_list.studio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudioTest {

    private Studio studio;
    private List<Actor> actors;

    @BeforeEach
    public void init() {
        studio = new Studio();
        actors = new ArrayList<>(List.of(
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Nicolas", "Cage", 56, 400),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Scarlett", "Johansson", 35, 4300),
                new Actor("Maryl", "Streep", 65, 6000)));

    }

    @Test
    public void fireTest1() {
        List<Actor> actual = studio.fire(actors);

        List<Actor> expect = new ArrayList<>(List.of(
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Nicolas", "Cage", 56, 400),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Scarlett", "Johansson", 35, 4300)));

       // Assertions.assertArrayEquals(expect, actual);


    }
}
