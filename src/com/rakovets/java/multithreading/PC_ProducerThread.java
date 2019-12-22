package com.rakovets.java.multithreading;

public class PC_ProducerThread implements Runnable {
	PC_Store store;

	public PC_ProducerThread(PC_Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			store.produce();
		}
	}
}
