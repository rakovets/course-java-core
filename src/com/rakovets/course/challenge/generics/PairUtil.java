package com.rakovets.course.challenge.generics;

/**
 * Создать final класс PairUtil:
 * иметь статический обобщённый метод swap(), принимающий объект класса Pair и возвращать пару,
 * в которой элементы поменялись местами
 */

public final class PairUtil {
	static void swap(Pair <String, String> colour) {
		Pair  <String, String> colourSwap = new Pair <String, String> (colour.getBlack(), colour.getWhite());
		colour.setBlack(colourSwap.getWhite());
		colour.setWhite(colourSwap.getBlack());
		System.out.println("Method SWAP");
	}
}
