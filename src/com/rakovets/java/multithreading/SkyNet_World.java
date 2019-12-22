package com.rakovets.java.multithreading;

public class SkyNet_World implements Runnable {
	SkyNet_Factory factory;
	SkyNet_Count countWorld = new SkyNet_Count();

	public SkyNet_World(SkyNet_Factory factory) {
		this.factory = factory;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			countWorld.countWorld(factory.consumer());
		}
	}
}