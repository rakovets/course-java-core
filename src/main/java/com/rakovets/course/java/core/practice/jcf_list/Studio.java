package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Studio {
    List<Actor> actors = new LinkedList<>();

    public void fire(List<Actor> actors) {
        Actor actorToFire = new Actor("Default", "Default", 0, 0);
        for (Actor actor : actors) {
            if (actor.getFee() > actorToFire.getFee()) {
                actorToFire = actor;
            }
        }
        actors.remove(actorToFire);
    }

    public void sortByLastName() {
        actors.sort(new Comparator<>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    public void sortByAge() {
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
    }

    public void sortByFee() {
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return Double.compare(o1.getFee(), o2.getFee());
            }
        });
    }

    public void sortByLastNameAndAge() {
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }.thenComparing(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        }));
    }

    public void sortByFeeAndLastName() {
        actors.sort(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return Double.compare(o1.getFee(), o2.getFee());
            }
        }.thenComparing(new Comparator<Actor>() {
            @Override
            public int compare(Actor o1, Actor o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }));
    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }
}
