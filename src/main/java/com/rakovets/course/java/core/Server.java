package com.rakovets.course.java.core;

import com.rakovets.course.java.core.example.jcf.comparator.ClientPriorityComparator;
import jdk.jfr.Event;

import java.util.*;

public class Server {
    public static Queue<Client> queue = new PriorityQueue<>(10, new ClientPriorityComparator());

    Map<Client, Map> historyOfClientRequests = new HashMap<>();

    public void executeRequest() {
        Event request;
        for (int i = 0; i < queue.size(); i = 0) {
            Client client = queue.poll();
            for (int j = 0; j < client.getRequests().size(); i++) {
                request = (Event) client.getRequests().get(j);
                client.getEventDateMap().put(request, new Date().getTime());
                historyOfClientRequests.put(client, client.getEventDateMap());
            }
        }
    }
}
