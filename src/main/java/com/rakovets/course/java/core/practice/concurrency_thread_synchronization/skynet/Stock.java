package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.skynet;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Stock {
    private static final Map<Integer,PathOfBody> CACHE = new ConcurrentHashMap<>();

    public PathOfBody put(Integer key,PathOfBody pathOfBody){
        return CACHE.put(key,pathOfBody);
    }

}
