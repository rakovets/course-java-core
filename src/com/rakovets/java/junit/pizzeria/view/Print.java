package com.rakovets.java.junit.pizzeria.view;

import com.rakovets.java.junit.pizzeria.database.Pizza;

import java.util.Map;

public class Print {

	public void printInfoForPayment(Pizza pizza, int number, double cost, double discountNumberPizza) {
		System.out.printf("\nВаш заказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f " +
				"= %.1f руб.\n", pizza.getName(), number, number, pizza.getPrice(), discountNumberPizza, cost);
	}

	public void printIngredients(Pizza pizza) {
		System.out.printf("Пицца %s, ингредиенты: %s", pizza.getName(), pizza.getIngredients());
	}

	public void printNeedInIngredients(Map<String, Integer> mapNeedIngredients) {
		System.out.println("\nИнгредиентов менее 10 шт.: \n");
		mapNeedIngredients.entrySet().forEach(System.out::println);
	}

	public void printNumberSalesPizza(int salesPizza) {
		System.out.printf("Количество проданных пицц = %d шт.\n", salesPizza);
	}

	public void printProfit(double profit) {
		System.out.printf("Прибыль = %.1f руб.\n", profit);
	}

	public void printNumberIngredients(Map<String, Integer> numberIngredients) {
		System.out.println("Количество ингредиентов: ");
		numberIngredients.entrySet().forEach(System.out::println);
	}

	public void printCash(double cost) {
		System.out.printf("\nОплата наличными проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}

	public void printCreditCard(double cost) {
		System.out.printf("\nОплата кредитной картой проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}

	public void printOnline(double cost) {
		System.out.printf("\nОплата на сайте проведена успешно!\nЧек на сумму: %.1f руб.\n", cost);
	}
}