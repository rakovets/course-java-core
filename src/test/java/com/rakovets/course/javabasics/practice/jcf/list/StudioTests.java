package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.StringCollectionUtil.StringCollectionUtil;
import com.rakovets.course.javabasics.studio.Actor;
import com.rakovets.course.javabasics.studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class StudioTests {
   private LinkedList<Actor> actors = new LinkedList<Actor>();
    @BeforeEach
    public void intro(){
        actors.add(new Actor("Tom", "Crouse", 40000.0, 48));
        actors.add(new Actor("Vin", "Diesel", 44000.0, 43));
        actors.add(new Actor("Frank", "Sinatra", 46000.0, 52));
        actors.add(new Actor("Tom", "Sinatra", 20000.0, 55));
        actors.add(new Actor("Jimm", "Hanks", 14000.0, 50));

    }

    @Test
    void fireTest() {
        Studio studioWB = new Studio(actors);
        Assertions.assertEquals("Actor FirstName Jimm, LastName Hanks, Cash=14000.0, Age=50\n", actors.getLast().toString());
        studioWB.fire();
        Assertions.assertEquals("Actor FirstName Vin, LastName Diesel, Cash=44000.0, Age=43\n", actors.getLast().toString());

    }
    @Test
    void getSortedListByAgeTest() {
        Studio studioWB = new Studio(actors);
        Assertions.assertEquals("Actor FirstName Jimm, LastName Hanks, Cash=14000.0, Age=50\n", actors.getLast().toString());
        studioWB.getSortedListByAge();
        Assertions.assertEquals("Actor FirstName Tom, LastName Sinatra, Cash=20000.0, Age=55\n", actors.getLast().toString());

    }

    @Test
    void getSortedByLastNameTest() {
        Studio studioWB = new Studio(actors);
        Assertions.assertEquals("Actor FirstName Jimm, LastName Hanks, Cash=14000.0, Age=50\n", actors.getLast().toString());
        studioWB.getSortedByLastName();
        Assertions.assertEquals("Actor FirstName Tom, LastName Sinatra, Cash=20000.0, Age=55\n", actors.getLast().toString());

    }

    @Test
    void getSortedByLastNameAgeTest() {
        Studio studioWB = new Studio(actors);
        Assertions.assertEquals("Actor FirstName Jimm, LastName Hanks, Cash=14000.0, Age=50\n", actors.getLast().toString());
        studioWB.getSortedByLastNameAge();
        Assertions.assertEquals("Actor FirstName Tom, LastName Sinatra, Cash=20000.0, Age=55\n", actors.getLast().toString());

    }

    @Test
    void getSortedActorsByFeeLastNameTest() {
        Studio studioWB = new Studio(actors);
        Assertions.assertEquals("Actor FirstName Jimm, LastName Hanks, Cash=14000.0, Age=50\n", actors.getLast().toString());
        studioWB.getSortedActorsByFeeLastName();
        Assertions.assertEquals("Actor FirstName Frank, LastName Sinatra, Cash=46000.0, Age=52\n", actors.getLast().toString());

    }
}
