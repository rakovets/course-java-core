package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.controller;

public class StoreStarterController {
    public static void main(String[] args) {
        StoreController storeController = new StoreController();
        storeController.start();
    }
}
