package com.rakovets.course.java.core.practice.jcf.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static com.rakovets.course.java.core.practice.jcf.list.Studio.*;
import static org.junit.jupiter.api.Assertions.*;

class StudioTest {

    @Test
    void fireTest() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("fName1", "lName1", 1000, 23));
        actors.add(new Actor("fName2", "lName2", 700, 53));
        Studio studio = new Studio(actors);
        studio.fire(actors);
        Assertions.assertEquals(700, actors.get(0).getFee());
    }

    @Test
    void compareByLastNameTest() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("fName5", "lName6", 1000, 23));
        actors.add(new Actor("fName3", "lName2", 700, 53));
        actors.add(new Actor("fName2", "lName3", 1800, 27));
        actors.add(new Actor("fName1", "lName4", 101, 13));
        actors.add(new Actor("fName4", "lName4", 100, 33));
        actors.add(new Actor("fName6", "lName1", 100, 35));
        Studio studio = new Studio(actors);
        Collections.sort(actors, compareByLastName);
        Assertions.assertEquals("lName1", actors.get(0).getLastName());
    }

    @Test
    void compareByAgeTest() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("fName5", "lName1", 1000, 23));
        actors.add(new Actor("fName3", "lName2", 700, 53));
        actors.add(new Actor("fName2", "lName3", 1800, 27));
        actors.add(new Actor("fName1", "lName4", 101, 13));
        actors.add(new Actor("fName4", "lName4", 100, 33));
        actors.add(new Actor("fName6", "lName6", 100, 35));
        Studio studio = new Studio(actors);
        Collections.sort(actors, compareByAge);
        Assertions.assertEquals(13, actors.get(0).getAge());
    }

    @Test
    void compareByLastNameAndAgeTest() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("fName5", "lName2", 1000, 23));
        actors.add(new Actor("fName3", "lName1", 700, 53));
        actors.add(new Actor("fName2", "lName4", 1800, 27));
        actors.add(new Actor("fName1", "lName3", 101, 13));
        actors.add(new Actor("fName4", "lName6", 100, 33));
        actors.add(new Actor("fName6", "lName5", 100, 35));
        Studio studio = new Studio(actors);
        Collections.sort(actors, compareByLastNameAndAge);
        Assertions.assertEquals("lName1", actors.get(0).getLastName());
        Assertions.assertEquals(53, actors.get(0).getAge());
    }

    @Test
    void compareByFeeAndLastNameTest() {
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("fName5", "lName2", 1000, 23));
        actors.add(new Actor("fName3", "lName1", 700, 53));
        actors.add(new Actor("fName2", "lName4", 1800, 27));
        actors.add(new Actor("fName1", "lName3", 101, 13));
        actors.add(new Actor("fName4", "lName6", 100, 33));
        actors.add(new Actor("fName6", "lName5", 100, 35));
        Studio studio = new Studio(actors);
        Collections.sort(actors, compareByFeeAndLastName);
        Assertions.assertEquals(100, actors.get(0).getFee());
        Assertions.assertEquals("lName5", actors.get(0).getLastName());
    }

}
