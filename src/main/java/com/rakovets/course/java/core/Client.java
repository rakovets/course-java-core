package com.rakovets.course.java.core;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Client {
    private char clientName;
    //private final int serviceTime;
    private int leftTime;
    private int timeInQueue;
//    private final int priority;
    private final Queue<Client> serviceQueue = new LinkedList<>();
    private String login;
    private int password;

    public Client(String login, int password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public int getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    /*
    public Client() {
        Random randomTime = new Random();
        int randTime = randomTime.nextInt(5) + 5;
        Random randomPriority = new Random();
        int randPriority = randomPriority.nextInt(100);
        Random randomChar = new Random();
        this.clientName += (char) (randomChar.nextInt(25) + (int) 'A');
        this.serviceTime = randTime;
        this.leftTime = this.serviceTime;
        this.priority = randPriority;
        this.timeInQueue = 0;
    }

    public final char getClientName() {
        return clientName;
    }

    public final int getServiceTime() {
        return serviceTime;
    }

    public final int getLeftTime() {
        return leftTime;
    }

    public final int getTimeInQueue() {
        return timeInQueue;
    }

    public final int getPriority() {
        return priority;
    }

    public final void leftTime() {
        if (this.leftTime > 0)
            this.leftTime--;
        else
            this.leftTime = 0;
    }

    public final void updateTimeInQueue() {
        timeInQueue++;
    }

    private void timer() {
        for (int i = 0; i < serviceQueue.size(); i++) {
            Client peekedClient = serviceQueue.remove();
            peekedClient.updateTimeInQueue();
            serviceQueue.add(peekedClient);
        }
        if (serviceQueue.size() > 0) {
            Client peekedClient = serviceQueue.peek();
            peekedClient.leftTime();
            if (peekedClient.getLeftTime() == 0)
                serviceQueue.remove();
            displayServiceQueue(-1);
        }

        Random r = new Random();
        int rand = r.nextInt(7);
        if ((rand != 0 && serviceQueue.size() > 3) || serviceQueue.size() > 15)
            return;

        Client client = new Client();
        displayServiceQueue(addToQueue(client));
    }

    LinkedList<Client> reservedQueue = (LinkedList<Client>) serviceQueue;

    private void displayServiceQueue(int peeked) {
        for (int i = 0; i < reservedQueue.size(); i++) {
            Client peekedClient = reservedQueue.poll();
            assert peekedClient != null;
        }
    }

    private int addToQueue(Client client) {
        int count;
        for (int i = 0; i < serviceQueue.size(); i++) {
            Client peekedClient = serviceQueue.remove();
            if (client.getPriority() > peekedClient.getPriority() && !serviceQueue.contains(client))
                serviceQueue.add(client);
            serviceQueue.add(peekedClient);
        }
        if (!serviceQueue.contains(client))
            serviceQueue.add(client);
        count = serviceQueue.size();
        return count;
    }

 */
}
