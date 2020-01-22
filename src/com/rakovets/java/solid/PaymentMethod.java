package com.rakovets.java.solid;

import java.util.Scanner;

public class PaymentMethod {
	Scanner scanner = new Scanner(System.in);
	boolean run = true;

	void selectionMethodPayment(double cost, int numberPizzas) {
		while (run) {
			System.out.println("Выбор способа оплаты: ");
			System.out.println("1.Наличными \t2.Банковской картой \t3.На сайте");
			int scan = scanner.nextInt();
			if (scan == 1) {
				cash(cost);
				run = false;
			} else if (scan == 2) {
				creditCard(cost);
				run = false;
			} else if (scan == 3) {
				online(cost);
				run = false;
			} else {
				System.out.println("Не сложно выбрать - 1, 2 или 3. Попытайся ещё!!!");
			}
		}
	}

	void cash(double cost) {
		System.out.printf("\nОплата наличными проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}

	void creditCard(double cost) {
		System.out.printf("\nОплата кредитной картой проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}

	void online(double cost) {
		System.out.printf("\nОплата на сайте проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}
}
