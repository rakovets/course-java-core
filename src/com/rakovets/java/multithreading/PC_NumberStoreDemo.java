package com.rakovets.java.multithreading;

public class PC_NumberStoreDemo {
	public static void main(String[] args) {
		PC_Store store = new PC_Store();
		PC_ProducerThread producerThread = new PC_ProducerThread(store);
		PC_ConsumerThread consumerThread = new PC_ConsumerThread(store);
		new Thread(producerThread).start();
		new Thread(consumerThread).start();
	}
}
