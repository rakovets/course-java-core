package com.rakovets.course.java.core.practice.jcf.list.project_studio;

import com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator.ActorComparatorByFee;

import java.util.Comparator;
import java.util.List;

public class Studio {
    private final List<Actor> actorList;

    public Studio(List<Actor> actorList) {
        this.actorList = actorList;
    }

    public void fire(List<Actor> actorList) {
        Comparator<Actor> actorFeeComparator = new ActorComparatorByFee();
        this.actorList.sort(actorFeeComparator);
        this.actorList.remove(0);
    }

    @Override
    public String toString() {
        return "Studio{" +
                "actorList=" + actorList.toString() +
                '}';
    }
}
