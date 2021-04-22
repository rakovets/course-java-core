package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comporator.ActorAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comporator.ActorFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comporator.ActorLastNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Marat", "Gua", 10, 18));
        actors.add(new Actor("Marta", "Gue", 300, 20));
        actors.add(new Actor("Arrart", "Gubka", 451, 58));
        actors.add(new Actor("Ken", "Mymba", 201, 17));
        actors.add(new Actor("Block", "Ivanov", 250, 45));
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        Comparator<Actor> byNameAndAge = new ActorLastNameComparator().thenComparing(new ActorAgeComparator());
        actors.sort(byNameAndAge);
        for (Actor actor : actors) {
            System.out.println(actor);
        }
        System.out.println(Arrays.asList(actors));
        Studio studio = new Studio(actors);
        studio.fire(studio);
        System.out.println(Arrays.asList(actors));
    }
 }

