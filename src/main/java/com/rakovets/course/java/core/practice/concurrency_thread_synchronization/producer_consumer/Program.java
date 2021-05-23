package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.producer_consumer;

import com.rakovets.course.java.core.util.AnsiColorCode;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Properties;

public class Program {
    public static void main(String[] args) {
        Path pathToProperties = Paths.get("src", "main", "resources", "user.properties");
        Properties p = new Properties();
        try (FileReader reader = new FileReader(pathToProperties.toFile())) {
            p.load(reader);
        } catch (IOException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing path for properties", AnsiColorCode.RESET);
        }
        String filePathForLogging = p.getProperty("filePathForLogging");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathForLogging))) {
            writer.write(LocalDateTime.now().toString() + " - The program started\n");
            System.out.println(LocalDateTime.now().toString() + " - The program started");

            int totalNumberOfNumbers = 30;
            int numberOfProducer = 12;
            int numberOfConsumer = 5;

            int numberOfNumbersForProducers = totalNumberOfNumbers / numberOfProducer;
            int numberOfNumbersForLastProducer = numberOfNumbersForProducers + totalNumberOfNumbers % numberOfProducer;
            int numberOfNumbersForConsumers = totalNumberOfNumbers / numberOfConsumer;
            int numberOfNumbersForLastConsumer = numberOfNumbersForConsumers + totalNumberOfNumbers % numberOfConsumer;

            Store store = new Store(filePathForLogging);
            ProducerThread producerThread = new ProducerThread(store, numberOfNumbersForProducers);
            ProducerThread lastProducerThread = new ProducerThread(store, numberOfNumbersForLastProducer);
            ConsumerThread consumerThread = new ConsumerThread(store, numberOfNumbersForConsumers);
            ConsumerThread lastConsumerThread = new ConsumerThread(store, numberOfNumbersForLastConsumer);

            for (int i = 1; i <= numberOfProducer - 1; i++) {
                new Thread(producerThread, "Producer-" + i).start();
            }
            new Thread(lastProducerThread, "Producer-" + numberOfProducer).start();

            for (int i = 1; i <= numberOfConsumer - 1; i++) {
                new Thread(consumerThread, "Consumer-" + i).start();
            }
            new Thread(lastConsumerThread, "Consumer-" + numberOfConsumer).start();

        } catch (IOException ex) {
            System.out.printf("%s%s%s\n", AnsiColorCode.FG_RED_BOLD,
                    "There is a problem with writing", AnsiColorCode.RESET);
        }
    }
}
