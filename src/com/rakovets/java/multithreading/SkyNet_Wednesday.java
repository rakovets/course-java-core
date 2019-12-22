package com.rakovets.java.multithreading;

public class SkyNet_Wednesday implements Runnable {
	SkyNet_Factory factory;
	SkyNet_Count countWednesday = new SkyNet_Count();

	public SkyNet_Wednesday(SkyNet_Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			countWednesday.countWednesday(factory.consumer());
		}
	}
}