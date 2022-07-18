package com.rakovets.course.java.core.practice.jcf_list.projectstudio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List actors) {
        this.actors = actors;
    }

    public static List fire(List<Actor> actors) {
            int maxFee = 0;
            int maxFeeIndex = 0;
            for (Actor a : actors) {
                if (a.getFee() > maxFee) {
                    maxFee = a.getFee();
                    maxFeeIndex = actors.indexOf(a);
                }
            }
            actors.remove(maxFeeIndex);
            return actors;
    }

}
