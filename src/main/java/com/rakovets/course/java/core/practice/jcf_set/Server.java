package com.rakovets.course.java.core.practice.jcf_set;

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
            for (int j = 0; j < client.getCurrentRequests().size(); i++) {
                request = (Event) client.getCurrentRequests().get(j);
                client.getEventDateMap().put(request, new Date().getTime());
                historyOfClientRequests.put(client, client.getEventDateMap());
            }
        }
    }

    public void getHistoryOfClientRequests() {
        for (Map.Entry<Client, Map> nameOfClient : historyOfClientRequests.entrySet()) {
            Client client = nameOfClient.getKey();
            Map<Event, Long> whatClientHasDone = nameOfClient.getValue();

            for (Map.Entry<Event, Long> eventAndDate : whatClientHasDone.entrySet()) {
                System.out.println("Client : " + client.getLogin() + "Event : " + eventAndDate.getValue() + "Date : " + eventAndDate.getKey());
            }
        }
    }
}
