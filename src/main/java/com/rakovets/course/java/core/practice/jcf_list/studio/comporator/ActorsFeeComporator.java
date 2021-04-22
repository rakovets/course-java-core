package com.rakovets.course.java.core.practice.jcf_list.studio.comporator;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import java.util.Comparator;

public class ActorsFeeComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return ((Integer) o1.getFee()).compareTo(((Integer) o2.getFee()));

    }

}
