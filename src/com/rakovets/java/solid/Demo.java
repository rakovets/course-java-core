package com.rakovets.java.solid;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("\nPIZZERIA");
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE HH:mm:ss");
		System.out.println(dateTime.format(formatter));
		System.out.println("(Скидка 10% в будние дни и при заказе от 3 и более пицц)");
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		Profit profit = new Profit(0.0);
		NumberPizzasSold numberPizzasSold = new NumberPizzasSold(0);
		NumberIngredients numberIngredients = new NumberIngredients(10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10);
		while (run) {
			System.out.println("\n1.Стандартные семь рецептов пиццы \t 2.Свой рецепт пиццы \t " +
					"3.Просмотреть количество проданных пицц \n4.Просмотреть прибыль \t 5.Информацию о наличии ингредиентов " +
					"\t 6.Выйти");
			int scan = scanner.nextInt();
			if (scan == 1) {
				new StandardRecipesPizza().selection(profit, numberPizzasSold, numberIngredients);
			} else if (scan == 2) {
				new YourRecipePizza().selection(profit, numberPizzasSold, numberIngredients);
			} else if (scan == 3) {
				new PrintInfoPizza().printInfoNumberPizzasSold(numberPizzasSold);
			} else if (scan == 4) {
				new PrintInfoPizza().printInfoProfit(profit);
			} else if (scan == 5) {
				new PrintInfoPizza().printInfoNumberIngredients(numberIngredients);
			} else if (scan == 6) {
				run = false;
				System.out.println("Go away, THE END!!!");
			} else {
				System.out.println("Не сложно выбрать - от 1 до 5. Попытайся ещё!!!");
			}
			numberIngredients.needIngredients();
		}
	}
}
