package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Actor> actors;

    public List<Actor> fire(List<Actor> actors) {
        List<Actor> list = new ArrayList<>(actors);
        list.sort(new ActorFeeComparator());
        Actor actor = list.remove(list.size() - 1);
        actors.remove(actor);
        return actors;
    }
}
