package com.rakovets.java.multithreading.skynet;

public class Factory implements Runnable {
    Warehouse warehouse;

    public Factory(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        warehouse.makeDetails();
    }
}
