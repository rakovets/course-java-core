package com.rakovets.course.challenge.generics;

public class PairTests {
	public static void main(String[] args) {
		Pair <String, String> colour = new Pair <String, String> ("black", "white");
		System.out.printf("Параметр K = %s \nПараметр V = %s\n", colour.getBlack(), colour.getWhite());
		PairUtil.swap(colour);
		System.out.printf("Параметр K = %s \nПараметр V = %s", colour.getBlack(), colour.getWhite());
	}
}
