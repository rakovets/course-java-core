package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.controller;

public class SkyNetControllerStarter {
    public static void main(String[] args) {
        SkyNetController skyNetController = new SkyNetController();
        skyNetController.start();
    }
}
