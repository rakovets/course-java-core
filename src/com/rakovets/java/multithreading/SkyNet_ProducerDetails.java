package com.rakovets.java.multithreading;

public class SkyNet_ProducerDetails implements Runnable {
	SkyNet_Factory factory;

	public SkyNet_ProducerDetails(SkyNet_Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		factory.makeDetails();
	}
}
