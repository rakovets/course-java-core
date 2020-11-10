package com.rakovets.course.javabasics.studio;

import java.util.LinkedList;

public class StudioDemo {
    public static void main(String[] args) {
        LinkedList<Actor> actors = new LinkedList<Actor>();
        actors.add(new Actor("Tom", "Crouse", 40000.0, 48));
        actors.add(new Actor("Vin", "Diesel", 44000.0, 43));
        actors.add(new Actor("Tom", "Hanks", 20000.0, 55));
        actors.add(new Actor("Jimm", "Hanks", 14000.0, 50));
        actors.add(new Actor("Frank", "Sinatra", 46000.0, 99));
        Studio studioWB = new Studio(actors);

       // System.out.println(studioWB.fire());
       // System.out.println(studioWB.getSortedListByAge());
      //  System.out.println(studioWB.getSortedByLastName());
        System.out.println(studioWB.getSortedByLastNameAge());
        System.out.println(studioWB.getSortedActorsByFeeLastName());







    }
}
