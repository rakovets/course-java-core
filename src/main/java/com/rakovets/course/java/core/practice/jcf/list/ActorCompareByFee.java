package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class ActorCompareByFee implements Comparator<Actor>{

    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getFee() - o2.getFee();
    }
}
