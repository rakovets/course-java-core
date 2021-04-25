package com.rakovets.course.java.core.practice.jcf_set.web_service;

import java.util.Comparator;

public class ComparatorForQueue implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
