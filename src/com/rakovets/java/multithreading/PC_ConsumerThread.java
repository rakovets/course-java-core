package com.rakovets.java.multithreading;

public class PC_ConsumerThread implements Runnable {
	PC_Store store;

	public PC_ConsumerThread(PC_Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		while (true) {
			store.consume();
		}
	}
}
