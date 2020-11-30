package com.rakovets.course.javabasics.practice.jcf.list;

import com.rakovets.course.javabasics.example.generics.model.Actor;
import com.rakovets.course.javabasics.example.generics.model.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class ActorTest {

    @Test
    public void Test() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Batka", "Vysati", 1000, 26));
        actors.add(new Actor("Polina", "Kakaiato", 100, 32));
        actors.add(new Actor("Sasha", "Kazachonok", 200, 37));
        Studio studio = new Studio(actors);
    }

    @Test
    public void Test2() {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Batka", "Vysati", 1000, 26));
        actors.add(new Actor("Polina", "Kakaiato", 100, 32));
        actors.add(new Actor("Sasha", "Kazachonok", 200, 37));
        Studio studio = new Studio(actors);
        actors.sort(Studio.lastName);
        Assertions.assertEquals("Kakaiato Kazachonok Vysati", studio.getLastNames());
        actors.sort(Studio.age);
        Assertions.assertEquals("26 32 37", studio.getAges());
        actors.sort(Studio.fee);
        Assertions.assertEquals("1000 200 100", studio.getFees());
        studio.fire();
        Assertions.assertEquals("200 100", studio.getFees());
        actors.sort(Studio.lastNameAge);
        Assertions.assertEquals("Kakaiato Kazachonok", studio.getLastNames());
        Assertions.assertEquals("32 37", studio.getAges());
        actors.sort(Studio.feeLastName);
        Assertions.assertEquals("Sasha Polina", studio.getFirstNames());
        Assertions.assertEquals("200 100", studio.getFees());
    }
}
