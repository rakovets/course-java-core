package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import java.util.List;

public class Studio {
    public void fire(List<Actor> actors) {
        Actor maxFee = actors.get(0);
        for (Actor i : actors) {
            if (maxFee.getFee() < i.getFee()) {
                maxFee = i;
            }
        }
        actors.remove(maxFee);
    }
}
