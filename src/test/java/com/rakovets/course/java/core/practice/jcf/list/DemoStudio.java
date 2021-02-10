package com.rakovets.course.java.core.practice.jcf.list;

import java.util.ArrayList;
import java.util.List;

public class DemoStudio {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("bill", "dodlin", 120, 15));
        actors.add(new Actor("jack", "shmoblin", 126, 18));
        actors.add(new Actor("nick", "lala", 125, 12));
        actors.add(new Actor("jim", "klas", 121, 17));
        actors.add(new Actor("tim", "duglas", 119, 12));
        Studio actorsOfStudio = new Studio(actors);

        System.out.println(actorsOfStudio.fire(actors));

        actors.sort(new ActorComparatorByLastName());

        actors.sort(new ActorComparatorByAge());

        actors.sort(new ActorComparatorByFee());

        actors.sort(new ActorComparatorByLastNameAndAge());

        actors.sort(new ActorComparatorByFeeAndLastName());
    }
}
