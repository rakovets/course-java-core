package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.FeeComparator;

import java.util.List;
import java.util.Objects;

public class Studio {
    List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        actors.sort(new FeeComparator());
        actors.remove(actors.size() - 1);

        return actors;
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

    @Override
    public String toString() {
        return "Studio{" +
                "actors=" + actors +
                '}';
    }
}
