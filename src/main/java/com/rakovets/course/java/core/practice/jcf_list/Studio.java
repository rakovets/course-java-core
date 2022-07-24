package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Studio {
    public Comparator<Actor> byFee = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            return Float.compare(a1.getFee(), a2.getFee());
        }
    };
    public Comparator<Actor> bySurname = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            return a1.getLastName().compareTo(a2.getLastName());
        }
    };
    public Comparator<Actor> byAge = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    };
    public Comparator<Actor> byFeeSurname = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            if (a1.getFee() != a2.getFee()) {
                return Float.compare(a1.getFee(), a2.getFee());
            }
            return a1.getLastName().compareTo(a2.getLastName());
        }
    };
    public Comparator<Actor> bySurnameAge = new Comparator<>() {
        @Override
        public int compare(Actor a1, Actor a2) {
            if (!Objects.equals(a1.getLastName(), a2.getLastName())) {
                return a1.getLastName().compareTo(a2.getLastName());
            }
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    };
    private List<Actor> actors = new ArrayList<>();

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
        List<Actor> list = new ArrayList<>(actors);
        list.sort(byFee);
        Actor actor = list.remove(list.size() - 1);
        actors.remove(actor);
        return actors;
    }
}
