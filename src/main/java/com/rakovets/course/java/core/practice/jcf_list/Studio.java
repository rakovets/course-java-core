package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Studio {
    private List<Actor> actors = new ArrayList<>();

    public Comparator<Actor> byFee = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            Float firstFee = a1.getFee();
            Float secondFee = a2.getFee();
            return firstFee.compareTo(secondFee);
        }
    };
    public Comparator<Actor> bySurname = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            String firstSurname = a1.getLastName();
            String secondSurname = a2.getLastName();
            return firstSurname.compareTo(secondSurname);
        }
    };
    public Comparator<Actor> byAge = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            Integer firstAge = a1.getAge();
            Integer secondAge = a2.getAge();
            return firstAge.compareTo(secondAge);
        }
    };
    public Comparator<Actor> byFeeSurname = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            String firstSurname = a1.getLastName();
            String secondSurname = a2.getLastName();
            Float firstFee = a1.getFee();
            Float secondFee = a2.getFee();
            if (!firstFee.equals(secondFee)) {
                return firstFee.compareTo(secondFee);
            }
            return firstSurname.compareTo(secondSurname);
        }
    };
    public Comparator<Actor> bySurnameAge = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            String firstSurname = a1.getLastName();
            String secondSurname = a2.getLastName();
            Integer firstAge = a1.getAge();
            Integer secondAge = a2.getAge();
            if (!Objects.equals(firstSurname, secondSurname)) {
                return firstSurname.compareTo(secondSurname);
            }
            return firstAge.compareTo(secondAge);
        }
    };

    public void addActors(Actor actor) {
        actors.add(actor);
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        actors.sort(byFee);
        actors.remove(actors.size() - 1);
        return actors;
    }
}
