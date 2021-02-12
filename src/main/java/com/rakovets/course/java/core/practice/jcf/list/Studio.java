package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> act) {
        ActorCompareByFee actorCompareByFee = new ActorCompareByFee();
        ListIterator<Actor> iter = act.listIterator();
        act.sort(actorCompareByFee);
        act.remove(act.size() - 1);
    }

    public void sortByLastName(List<Actor> act) {
        ActorCompareByLastName actorCompareByLastName = new ActorCompareByLastName();
        act.sort(actorCompareByLastName);
    }

    public void sortByAge(List<Actor> act) {
        ActorCompareByAge actorCompareByAge = new ActorCompareByAge();
        act.sort(actorCompareByAge);
    }

    public void sortByFee(List<Actor> act) {
        ActorCompareByFee actorCompareByFee = new ActorCompareByFee();
        act.sort(actorCompareByFee);
    }

    public void sortByLastNameAndAge(List<Actor> act) {
        Comparator<Actor> actorsCompareByLastNameAndAge = new ActorCompareByLastName().thenComparing(new ActorCompareByFee());
        act.sort(actorsCompareByLastNameAndAge);
    }

    public void sortByFeeAndLastName(List<Actor> act) {
        Comparator<Actor> actorsCompareByFeeAndLastNam = new ActorCompareByFee().thenComparing(new ActorCompareByLastName());
        act.sort(actorsCompareByFeeAndLastNam);
    }
}
