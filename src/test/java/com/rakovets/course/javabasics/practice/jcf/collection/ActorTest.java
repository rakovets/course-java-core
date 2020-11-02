package com.rakovets.course.javabasics.practice.jcf.collection;

import com.rakovets.course.javabasics.example.generics.model.Actor;
import com.rakovets.course.javabasics.example.generics.model.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
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
}
