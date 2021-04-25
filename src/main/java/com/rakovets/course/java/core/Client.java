package com.rakovets.course.java.core;

import jdk.jfr.Event;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;

public class Client {

    private int priority;
    private String login;
    private String password;
    private Map<Event, Long> eventDateMap = new HashMap<>();
    private LinkedList<Event> requests = new LinkedList();

    {
        Random random = new Random();
        priority = random.nextInt(10);
        Server.queue.offer(this);
    }

    public Client(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public LinkedList getRequests() {
        return requests;
    }

    public int getPriority() {
        return priority;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Map<Event, Long> getEventDateMap() {
        return eventDateMap;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
