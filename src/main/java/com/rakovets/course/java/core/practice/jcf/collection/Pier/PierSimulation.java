package com.rakovets.course.java.core.practice.jcf.collection.Pier;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class PierSimulation {
    Passenger passenger;
    int boatArrival;
    int passengerArrival;
    int totalWaitingTime;
    int numberPassengersCarried;
    int MAX_NUMBER_PASSENGERS = 50; // maximum capacity of pier

    public PierSimulation() {
        totalWaitingTime = 0;
        numberPassengersCarried = 0;
    }

    public void simulateMorning() {
        Queue<Passenger> queue = new ArrayDeque<>(700);
        Random rand = new Random();
        int travelTime = rand.nextInt(100) + 5;
        for (int time = 0; time < travelTime; time++) {
            for (int i = 1; i <= passengerArrival; i++) {
                queue.add(new Passenger());
                if (!(queue.size() == 0))
                    passenger = queue.remove();
                    boatArrival = time + travelTime;
                    int timePassengerWaited = time - passenger.getArrivalTime();
                    totalWaitingTime += timePassengerWaited;
                    numberPassengersCarried++;
            }
        }
    }

    public void simulateDay() {
        Queue<Passenger> queue = new ArrayDeque<>(200);
        Random rand = new Random();
        int travelTime = rand.nextInt(100) + 5;
        for (int time = 0; time < travelTime; time++) {
            for (int i = 1; i <= passengerArrival; i++) {
                queue.add(new Passenger());
                if (!(queue.size() == 0))
                    passenger = queue.remove();
                boatArrival = time + travelTime;
                int timePassengerWaited = time - passenger.getArrivalTime();
                totalWaitingTime += timePassengerWaited;
                numberPassengersCarried++;
            }
        }
    }

    public void simulateEvening() {
        Queue<Passenger> queue = new ArrayDeque<>(1000);
        Random rand = new Random();
        int travelTime = rand.nextInt(100) + 5;
        for (int time = 0; time < travelTime; time++) {
            for (int i = 1; i <= passengerArrival; i++) {
                queue.add(new Passenger());
                if (!(queue.size() == 0))
                    passenger = queue.remove();
                boatArrival = time + travelTime;
                int timePassengerWaited = time - passenger.getArrivalTime();
                totalWaitingTime += timePassengerWaited;
                numberPassengersCarried++;
            }
        }
    }

    public void simulateNight() {
        Queue<Passenger> queue = new ArrayDeque<>(20);
        Random rand = new Random();
        int travelTime = rand.nextInt(100) + 5;
        for (int time = 0; time < travelTime; time++) {
            for (int i = 1; i <= passengerArrival; i++) {
                queue.add(new Passenger());
                if (!(queue.size() == 0))
                    passenger = queue.remove();
                boatArrival = time + travelTime;
                int timePassengerWaited = time - passenger.getArrivalTime();
                totalWaitingTime += timePassengerWaited;
                numberPassengersCarried++;
            }
        }
    }
}
