package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.comparators.ActorFeeComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Studio {
    private ArrayList<Actor> actors;

    public Studio() {
    }

    public Studio(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void fire(ArrayList<Actor> actors) {
        actors.sort(new ActorFeeComparator());
        Collections.reverse(actors);
        actors.remove(0);
    }
}
