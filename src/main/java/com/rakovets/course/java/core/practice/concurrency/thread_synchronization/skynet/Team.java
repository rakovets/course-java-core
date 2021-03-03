package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

import java.util.LinkedList;
import java.util.List;

public class Team implements Runnable {
    private final FactoryStore store;
    private final List<Details> parts;
    private final List<Details> heads;
    private final List<Details> hands;
    private final List<Details> torsos;
    private final List<Details> feet;
    private int numberOfRobots = 0;

    public Team(FactoryStore store) {
        this.store = store;
        this.parts = new LinkedList<>();
        this.hands = new LinkedList<>();
        this.heads = new LinkedList<>();
        this.torsos = new LinkedList<>();
        this.feet = new LinkedList<>();
    }

    @Override
    public void run() {
        parts.addAll(store.loot());
        assembleRobots();
    }

    private void assembleRobots() {
        for (Details detail : parts) {
            switch (detail) {
                case HEAD:
                    heads.add(Details.HEAD);
                    break;
                case TORSO:
                    torsos.add(Details.TORSO);
                    break;
                case FEET:
                    feet.add(Details.FEET);
                    break;
                case HAND:
                    hands.add(Details.HAND);
                    break;
            }
        }
        parts.clear();
        while (!heads.isEmpty()) {
            if (torsos.size() >= 1 && hands.size() >= 2 && feet.size() >= 2) {
                numberOfRobots += 1;
                heads.remove(Details.HEAD);
                torsos.remove(Details.TORSO);
                hands.remove(Details.HAND);
                hands.remove(Details.HAND);
                feet.remove(Details.FEET);
                feet.remove(Details.FEET);
            } else {
                parts.addAll(heads);
                parts.addAll(torsos);
                parts.addAll(hands);
                parts.addAll(feet);
                heads.clear();
                torsos.clear();
                hands.clear();
                feet.clear();
            }
        }
    }

    public int getNumberOfRobots() {
        return numberOfRobots;
    }

    public List<Details> getParts() {
        return parts;
    }
}
