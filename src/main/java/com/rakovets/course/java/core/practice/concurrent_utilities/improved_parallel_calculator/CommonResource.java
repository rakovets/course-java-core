package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Map;
import java.util.concurrent.Phaser;

public class CommonResource {
    private final Map<int[], Integer> mapMadeByThreads;
    private final Phaser phaser;

    public CommonResource(Map<int[], Integer> mapMadeByThreads, Phaser phaser) {
        this.mapMadeByThreads = mapMadeByThreads;
        this.phaser = phaser;
    }
}
