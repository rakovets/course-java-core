package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import java.util.*;

public class Studio {
    private Collection<Actor> actors;

    /**
     * The method accepts a list of actors and removes the actor with the highest fee from it.
     *
     * @param actorsList input parameter in the form of list of actors
     * @return list of actors with removed actor with the highest fee from it
     */
    public List<Actor> fire(List<Actor> actorsList) {
        int index = 0;

        for (Actor actor : actorsList) {
            double temporarySalaryForComparing = 0;

            if (actor.getFee() > temporarySalaryForComparing) {
                index = actorsList.indexOf(actor);
            }
        }
        actorsList.remove(index);
        return actorsList;
    }
}
