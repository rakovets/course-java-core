package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Studio {
    ArrayList<Actor> actors = new ArrayList<>();

    Comparator<Actor> byFee = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            Float firstFee = a1.getFee();
            Float secondFee = a2.getFee();
            return firstFee.compareTo(secondFee);
        }
    };

    Comparator<Actor> bySurname = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            String firstSurname = a1.getLastName();
            String secondSurname = a2.getLastName();
            return firstSurname.compareTo(secondSurname);
        }
    };

    Comparator<Actor> byAge = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            Integer firstAge = a1.getAge();
            Integer secondAge = a2.getAge();
            return firstAge.compareTo(secondAge);
        }
    };

    Comparator<Actor> byFeeSurname = new Comparator<>() {
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

    Comparator<Actor> bySurnameAge = new Comparator<>() {
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

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public ArrayList<Actor> fire(ArrayList<Actor> actors) {
        actors.sort(byFee);
        actors.remove(actors.size() - 1);
        return actors;
    }

    public ArrayList<Actor> sortByAge(ArrayList<Actor> actors) {
        actors.sort(byAge);
        return actors;
    }

    public ArrayList<Actor> sortBySurname(ArrayList<Actor> actors) {
        actors.sort(bySurname);
        return actors;
    }

    public ArrayList<Actor> sortBySurnameAge(ArrayList<Actor> actors) {
        actors.sort(bySurnameAge);
        return actors;
    }

    public ArrayList<Actor> sortByFeeSurname(ArrayList<Actor> actors) {
        actors.sort(byFeeSurname);
        return actors;
    }
}
