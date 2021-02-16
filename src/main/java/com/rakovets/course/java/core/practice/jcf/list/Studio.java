package com.rakovets.course.java.core.practice.jcf.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Studio {
    List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actors) {
        Collections.sort(actors, compareByFee);
        actors.remove(actors.size() - 1);
    }

    public final static Comparator<Actor> compareByFee = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return actor1.getFee() - actor2.getFee();
        }
    };

    public final static Comparator<Actor> compareByLastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return actor1.getLastName().compareTo(actor2.getLastName());
        }
    };

    public final static Comparator<Actor> compareByAge = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return actor1.getAge() - actor2.getAge();
        }
    };

    public final static Comparator<Actor> compareByLastNameAndAge = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            int result = actor1.getLastName().compareTo(actor2.getLastName());
            if (result == 0) {
                return actor1.getAge() - actor2.getAge();
            }
            return result;
        }
    };

    public final static Comparator<Actor> compareByFeeAndLastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            int result = actor1.getFee() - actor2.getFee();
            if (result == 0) {
                return actor1.getLastName().compareTo(actor2.getLastName());
            }
            return result;
        }
    };

}
