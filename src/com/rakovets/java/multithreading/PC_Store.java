package com.rakovets.java.multithreading;

import java.util.LinkedList;
import java.util.Random;

public class PC_Store {
	LinkedList<Integer> numbers = new LinkedList();
	Random random = new Random();

	synchronized void produce() {
		while (numbers.size() >= 10) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		int numPut = random.nextInt(100) + 1;
		numbers.add(numPut);
		System.out.printf("\u001B[32m Добавлено число: %-11d     Хранилище: %-50s     Размер: %d\n",
				numPut, numbers, numbers.size());
		notify();
	}

	synchronized void consume() {
		try {
			Thread.sleep(random.nextInt(10));
		} catch (InterruptedException e) {
			System.out.println(" Поток РАЗОРВАЛО! :) ");
		}

		while (numbers.size() < 1) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}

		int numGet = numbers.getFirst();
		numbers.removeFirst();
		System.out.printf("\u001B[31m Удалено число:   %-11d     Хранилище: %-50s     Размер: %d\n",
				numGet, numbers, numbers.size());
		notify();
	}
}
