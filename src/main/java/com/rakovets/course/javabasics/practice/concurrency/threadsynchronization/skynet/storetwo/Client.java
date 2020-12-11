package com.rakovets.course.javabasics.practice.concurrency.threadsynchronization.skynet.storetwo;

import java.util.logging.Logger;

public class Client extends Thread {
    private final static Logger LOG = Logger.getLogger(Client.class);
    private Restaurant restaurant;
    private CashDesk cashDesk;
    private String name;
    private int itemsInOrder;

    public Client(Restaurant restaurant, int itemsInOrder, String name) {
        this.restaurant = restaurant;
        this.itemsInOrder = itemsInOrder;
        this.name = name;
    }

    public String getClientName() {
        return name;
    }

    public int getItemsInOrder() {
        return itemsInOrder;
    }

    @Override
    public void run() {
        System.out.println("Client " + name + " comes to restaurant " + restaurant.getName());
        this.cashDesk = chooseCashDesk();
        System.out.println("Client " + getClientName() + " choosed the cashDesk#"+ cashDesk.getNumber());
        cashDesk.addClient(this);
        while (true) {
            if (cashDesk.getLock().tryLock()) {
                try {
                } catch (ResourceException e) {
                    LOG.error("ResourceException!!! ", e);
                } finally {
                    cashDesk.getLock().unlock();
                    break;
                }
            } else {
                if (canChooseAnotherCashDesk()) {
                    cashDesk.removeClient(this);
                }
            }
        }
        cashDesk.removeClient(this);
        System.out.println("Client " + getClientName() + " leaves restaurant");
    }

    private CashDesk chooseCashDesk(){
        CashDesk result = restaurant.getCashDesks().get(0);
        for (CashDesk cashDesk : restaurant.getCashDesks()) {
            if(cashDesk.getClients().size() < result.getClients().size()) {
                result = cashDesk;
            }
        }
        return result;
    }

    private boolean canChooseAnotherCashDesk() {
        CashDesk result = chooseCashDesk();
        if(result.getClients().size() + 1 < cashDesk.getClients().size()) {
            cashDesk = result;
            cashDesk.addClient(this);
            System.out.println("Client " + getClientName() + " moved to cashDesk#" + cashDesk.getNumber());
            return true;
        }
        return false;
    }
}
