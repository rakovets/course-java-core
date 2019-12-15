package com.rakovets.java.task.stream_api;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MathStatistics {
	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> listRandom = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			listRandom.add(random.nextInt(11));
		}
		System.out.printf("Сгенерированные числа:  %s", listRandom);

		long countEven = listRandom.stream()
				.filter(unit -> unit % 2 == 0)
				.count();
		long countOdd = listRandom.stream()
				.filter(unit -> unit % 2 == 1)
				.count();
		long countEqualZero = listRandom.stream()
				.filter(unit -> unit == 0)
				.count();

		System.out.print("\nВведите число для поиска: ");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		long countEnterUser = listRandom.stream()
				.filter(unit -> unit == value)
				.count();

		System.out.printf("\nЧетных - %d; Нечетных - %d; Равных 0 - %d; Равные числу пользователя - %d",
				countEven, countOdd, countEqualZero, countEnterUser);
	}
}
