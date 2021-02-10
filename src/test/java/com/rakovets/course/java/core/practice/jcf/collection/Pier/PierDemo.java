package com.rakovets.course.java.core.practice.jcf.collection.Pier;

import java.util.Scanner;

class PierDemo {
    public static void main(String[] args) {

        PierSimulation pier = new PierSimulation();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWELCOME TO PIER SIMULATION PROGRAM! Enter required values to begin.\n");

        System.out.println("Choose what part of the day you want to simulate:");

        System.out.println("1. Morning (06:00 to 12:00)");
        System.out.println("2. Day (12:00 to 18:00)");
        System.out.println("3. Evening (18:00 to 00:00)");
        System.out.println("4. Night (00:00 to 06:00)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter average time between passengers arrivals at the pier (min):");
                pier.passengerArrival = sc.nextInt();
                System.out.println("Enter average time between boats arrivals at the pier (min):");
                pier.boatArrival = sc.nextInt();
                System.out.println("Is boat stop final? (Type y or n)");
                sc.next();
                pier.simulateMorning();
                break;
            case 2:
                System.out.println("Enter average time between passengers arrivals at the pier (min):");
                pier.passengerArrival = sc.nextInt();
                System.out.println("Enter average time between boats arrivals at the pier (min):");
                pier.boatArrival = sc.nextInt();
                System.out.println("Is boat stop final? (Type y or n)");
                sc.next();
                pier.simulateDay();
                break;
            case 3:
                System.out.println("Enter average time between passengers arrivals at the pier (min):");
                pier.passengerArrival = sc.nextInt();
                System.out.println("Enter average time between boats arrivals at the pier (min):");
                pier.boatArrival = sc.nextInt();
                System.out.println("Is boat stop final? (Type y or n)");
                sc.next();
                pier.simulateEvening();
                break;
            default:
                System.out.println("Enter average time between passengers arrivals at the pier (min):");
                pier.passengerArrival = sc.nextInt();
                System.out.println("Enter average time between boats arrivals at the pier (min):");
                pier.boatArrival = sc.nextInt();
                System.out.println("Is boat stop final? (Type y or n)");
                sc.next();
                pier.simulateNight();
        }
        System.out.println("Number of passengers carried: " + pier.numberPassengersCarried);
        System.out.println("Average waiting time is about " +
                pier.totalWaitingTime / pier.numberPassengersCarried + " minutes");
        System.out.println("A sufficient time interval between boats arrivals " +
                "so that the pier does not overflow - " + pier.passengerArrival
                * pier.MAX_NUMBER_PASSENGERS + " minutes");
        System.out.println("\nSIMULATION COMPLETED");
    }
}
