package com.rakovets.java.multithreading;

public class SkyNet_Demo {
	public static void main(String[] args) {
		SkyNet_Factory factory = new SkyNet_Factory();
		SkyNet_World world = new SkyNet_World(factory);
		SkyNet_Wednesday wednesday = new SkyNet_Wednesday(factory);
		SkyNet_Count count = new SkyNet_Count();
		for (int i = 1; i < 6; i++) {
			factory.producer();
			new Thread(world).start();
			new Thread(wednesday).start();
		}
	}
}