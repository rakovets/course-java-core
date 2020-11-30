package com.rakovets.course.javabasics.example.generics.model;

import java.util.ArrayList;
import java.util.Comparator;

public class Studio {
    private ArrayList<Actor> actors;

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void fire() {
        actors.sort(fee);
        actors.remove(0);
    }

    public static Comparator<? super Actor> fee = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return (int)(actor2.getFee() - actor1.getFee());
        }
    };

    public static Comparator<? super Actor> lastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return actor1.getLastName().compareTo(actor2.getLastName());
        }
    };

    public static Comparator<? super Actor> age = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            return actor1.getAge() - (actor2.getAge());
        }
    };

    public static Comparator<? super Actor> lastNameAge = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            if (actor1.getLastName().compareTo(actor2.getLastName()) != 0)
                return actor1.getLastName().compareTo(actor2.getLastName());
            else return actor1.getAge() - (actor2.getAge());
        }
    };

    public static Comparator<? super Actor> feeLastName = new Comparator<Actor>() {
        @Override
        public int compare(Actor actor1, Actor actor2) {
            if (actor2.getFee() - actor1.getFee() != 0)
                return (int)(actor2.getFee() - actor1.getFee());
            else return actor1.getLastName().compareTo(actor2.getLastName());
        }
    };

    public String getFirstNames() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFirstName() + " ";
        }
        return result.trim();
    }

    public String getLastNames() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getLastName() + " ";
        }
        return result.trim();
    }

    public String getFees() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getFee() + " ";
        }
        return result.trim();
    }

    public String getAges() {
        String result = "";
        for (Actor actor : actors) {
            result += actor.getAge() + " ";
        }
        return result.trim();
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }



}