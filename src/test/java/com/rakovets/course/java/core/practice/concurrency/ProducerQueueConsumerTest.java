package com.rakovets.course.java.core.practice.concurrency;

import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ProducerQueueConsumerTest {
    ProducerQueueConsumer producerQueueConsumer = new ProducerQueueConsumer();

    @Test
    void testGetInfoFromConsole() throws IOException {
        producerQueueConsumer.getInfoFromConsole();
    }
}
