package com.rakovets.course.java.core.example.jcf.comparator;

import com.rakovets.course.java.core.Client;
import com.rakovets.course.java.core.practice.Actor;

import java.util.Comparator;

public class ClientPriorityComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
       return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
