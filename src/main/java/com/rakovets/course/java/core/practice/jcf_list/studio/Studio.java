package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comporators.ActorFeeComparator;

import java.util.Comparator;
import java.util.List;

public class Studio {
    public List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actorsForStudio) {
        Comparator<Actor> actorFeeComparator = new ActorFeeComparator();
        actorsForStudio.sort(actorFeeComparator);
        actorsForStudio.remove(actorsForStudio.size() - 1);
    }
}
