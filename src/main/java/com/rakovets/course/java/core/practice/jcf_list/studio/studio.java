package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.compareFee;

import java.util.List;

public class studio {
    public void fire(List<Actor> list) {
        list.sort(new compareFee());
        list.remove(0);
    }
}
