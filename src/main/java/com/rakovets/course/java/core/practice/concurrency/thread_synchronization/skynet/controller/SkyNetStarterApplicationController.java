package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller;

public class SkyNetStarterApplicationController {
    public static void main(String[] args) {
        SkyNetStarterController skyNetStarterController = new SkyNetStarterController();
        skyNetStarterController.start();
    }
}
