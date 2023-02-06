package com.rakovets.course.java.core.practice.jcf_list;

public class StudioDemo {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Aaron", "Nels", 1150,24);
        Actor actor2 = new Actor("John", "Nicols", 1050,28);
        Actor actor3 = new Actor("Natalia", "Coach", 1100,27);
        Actor actor4 = new Actor("Bob", "Torrenton", 1200,32);
        Studio studio = new Studio();

        studio.actors.add(actor1);
        studio.actors.add(actor2);
        studio.actors.add(actor3);
        studio.actors.add(actor4);

        studio.printActors();
        System.out.println();
        studio.sortByLastNameAndAge();
        studio.printActors();
    }
}
