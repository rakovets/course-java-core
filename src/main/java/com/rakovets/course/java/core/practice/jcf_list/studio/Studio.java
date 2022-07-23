package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Studio {
    List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actors) {
        actors.sort(new FeeComparator());
        actors.remove(actors.size() - 1);
    }

    /**
     * Comparator by last name.
     */
    public static class LastNameComparator implements Comparator<Actor> {

        @Override
        public int compare(Actor o1, Actor o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    /**
     * Comparator by age.
     */
    public static class AgeComparator implements Comparator<Actor> {

        @Override
        public int compare(Actor o1, Actor o2) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }

    /**
     * Comparator by fee.
     */
    public static class FeeComparator implements Comparator<Actor> {

        @Override
        public int compare(Actor o1, Actor o2) {
            return Double.compare(o1.getFee(), o2.getFee());
        }
    }

    /**
     * Comparator by last name and age.
     */
    public static class LastNameAgeComparator implements Comparator<Actor> {

        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getLastName().equals(o2.getLastName())) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }
    }

    /**
     * Comparator by fee and last name.
     */
    public static class FeeLastNameComparator implements Comparator<Actor> {

        @Override
        public int compare(Actor o1, Actor o2) {
            if (o1.getFee() == o2.getFee()) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return Double.compare(o1.getFee(), o2.getFee());
            }
        }
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Studio studio = (Studio) o;

        return actors.equals(studio.actors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actors);
    }
}
