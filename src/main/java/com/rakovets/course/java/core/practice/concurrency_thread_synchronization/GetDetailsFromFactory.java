package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

public interface GetDetailsFromFactory {
    public default void getDetailsFromFactory() {
        Factory.getDetails();

    }
}
