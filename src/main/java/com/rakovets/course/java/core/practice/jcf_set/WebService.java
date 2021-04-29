package com.rakovets.course.java.core.practice.jcf_set;

import java.util.HashMap;
import java.util.Map;

public class WebService {
    private Map<String, Integer> clients = new HashMap<>();

    public WebService(Map<String, Integer> clients) {
        this.clients = clients;
    }


    public void setClients(String login, Integer password) {
        clients.put(login, password);
    }


    public void deleteClients(String login, Integer password) {
        clients.remove(login, password);
    }


    public boolean checkExistenceOfClient(String login) {
        if (clients.containsKey(login)) {
            return true;
        } else {
            return false;
        }
    }

    public void changeLogin(String login, String newLogin, int password) {
        clients.remove(login);
        clients.put(newLogin, password);
    }
}
