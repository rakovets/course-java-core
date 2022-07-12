package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActorTest {

    Actor actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
    Actor actor2 = new Actor("Peter", "Petrov", 500, 25);
    Actor actor3 = new Actor("Inna", "Innova", 1000, 67);

    List <Actor> list = new ArrayList<>(){
    };





    Studio studio = new Studio();



    @Test
    public void testAddActor() {
        studio.addActor(actor1);
        studio.addActor(actor2);
        studio.addActor(actor3);
        Assertions.assertEquals(,studio.getActors());
    }


    @Test
    public void testFire() {
        studio.addActor(actor1);
        studio.addActor(actor2);
        studio.addActor(actor3);
    }


}
