package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import java.util.List;

public class Studio {

    public void fire(List<Actor> actors) {
        int maxFee = 0;
        for (Actor i : actors) {
            if (maxFee < i.getFee()) {
                maxFee = i.getFee();
            }
        }
        for (Actor i : actors) {
            if (maxFee == i.getFee()) {
                actors.remove(i);
                break;
            }
        }
    }
}
