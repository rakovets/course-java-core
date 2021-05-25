package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.sky_net.factions.Factions;

public class ChooseWinner {
    Factions red;
    Factions blue;

    public ChooseWinner(Factions blue, Factions red) {
        this.blue = blue;
        this.red = red;
    }

    public void chooseWinner() {
        if (blue.getAmountRobots() > red.getAmountRobots()) {
            System.out.println("Blue team win !");
        } else if (red.getAmountRobots() > blue.getAmountRobots()) {
            System.out.println("Red team win !");
        } else {
            System.out.println("DRAW !");
        }
    }
}
