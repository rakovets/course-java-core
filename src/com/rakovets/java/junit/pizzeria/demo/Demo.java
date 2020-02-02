package com.rakovets.java.junit.pizzeria.demo;

import com.rakovets.java.junit.pizzeria.database.*;
import com.rakovets.java.junit.pizzeria.models.*;
import com.rakovets.java.junit.pizzeria.view.Print;
import com.rakovets.java.junit.pizzeria.view.SaveToFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Demo {
	private static Scanner scanner = new Scanner(System.in);
	private static Profit profit = new Profit(0.0);
	private static Map<String, Integer> mapNumberIngredients = new BaseIngredients().getMapNumberIngredients();
	private static Map<String, Integer> mapOrdersPizza = new HashMap<>();
	private static Pizza pizzaOrder;

	public static void main(String[] args) {
		System.out.println("\nPIZZERIA");
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Сегодня: EEEE HH:mm:ss");
		System.out.println(dateTime.format(formatter));
		String day = dateTime.format(DateTimeFormatter.ofPattern("EEEE"));
		System.out.println("(Скидка 10% в будние дни ИЛИ 10% при заказе от 3 и более пицц)");
		boolean runMain = true;
		while (runMain) {
			System.out.println("\n1.Стандартные семь рецептов пиццы \t 2.Свой рецепт пиццы \t " +
					"3.Просмотреть количество проданных пицц \n4.Просмотреть прибыль \t 5.Информацию о наличии ингредиентов " +
					"\t 6.Выйти");
			int scanMain = scanner.nextInt();
			switch (scanMain) {
				case 1:
					boolean run1 = true;
					while (run1) {
						System.out.println("Выбор пиццы:");
						System.out.println("1.'Четыре сыра' - 9.9 руб. \n2.'Пепперони'   - 10.9 руб. \n" +
								"3.'Барбекю'     - 11.9 руб. \n4.'Деревенская' - 5.5 руб. \n5.'Болоньезе'   - 11.9 руб. \n" +
								"6.'Грибная'     - 5.6 руб. \n7.'Везувий'     - 6.3 руб. \n");
						int pizza = scanner.nextInt();
						switch (pizza) {
							case 1:
								pizzaOrder = new PizzaFourСheeses();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 2:
								pizzaOrder = new PizzaPepperoni();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 3:
								pizzaOrder = new PizzaBarbecue();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 4:
								pizzaOrder = new PizzaDerevenskaya();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 5:
								pizzaOrder = new PizzaBolognese();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 6:
								pizzaOrder = new PizzaMushroom();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							case 7:
								pizzaOrder = new PizzaVesuvius();
								new Print().printIngredients(pizzaOrder);
								run1 = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					System.out.print("\nУкажите количество пицц: ");
					int numberPizza = scanner.nextInt();

					double discount = new Discount().discountNumberPizza(day, numberPizza, pizzaOrder.getPrice());
					double cost = new CostPizza().calculationCost(pizzaOrder.getPrice(), numberPizza, discount);
					new Print().printInfoForPayment(pizzaOrder, numberPizza, cost, discount);

					boolean runPay1 = true;
					while (runPay1) {
						System.out.println("Выбор способа оплаты: ");
						System.out.println("1.Наличными \t2.Банковской картой \t3.На сайте");
						int payment = scanner.nextInt();
						switch (payment) {
							case 1:
								new Print().printCash(cost);
								runPay1 = false;
								break;
							case 2:
								new Print().printCreditCard(cost);
								runPay1 = false;
								break;
							case 3:
								new Print().printOnline(cost);
								runPay1 = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					new SetOrders().setOrdersPizza(pizzaOrder, mapOrdersPizza, numberPizza);
					new SetIngredients().setIngredient(pizzaOrder, mapNumberIngredients, numberPizza);
					profit.setProfit(cost);
					new SaveToFile().saveFilePizza(pizzaOrder, numberPizza, cost, discount);
					break;
				case 2:
					LinkedList<String> ingredientsCustomPizza = new LinkedList<>();
					System.out.println("\nВыбор ингридиентов собственной пиццы.");
					boolean runMeat = true;
					while (runMeat) {
						System.out.println("Мясо: ");
						System.out.println("1.Куриное филе \t2.Бекон");
						int scanMeat = scanner.nextInt();
						switch (scanMeat) {
							case 1:
								ingredientsCustomPizza.add(IngredientsNames.CHICKEN.getIngredient());
								runMeat = false;
								break;
							case 2:
								ingredientsCustomPizza.add(IngredientsNames.BACON.getIngredient());
								runMeat = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					boolean runCheese = true;
					while (runCheese) {
						System.out.println("Сыр: ");
						System.out.println("1.Моцарелла \t2.Чеддер \t3.Моцарелла и Чеддер");
						int scanCheese = scanner.nextInt();
						switch (scanCheese) {
							case 1:
								ingredientsCustomPizza.add(IngredientsNames.MOZZARELLA.getIngredient());
								runCheese = false;
								break;
							case 2:
								ingredientsCustomPizza.add(IngredientsNames.CHEDDAR.getIngredient());
								runCheese = false;
								break;
							case 3:
								ingredientsCustomPizza.add(IngredientsNames.MOZZARELLA.getIngredient());
								ingredientsCustomPizza.add(IngredientsNames.CHEDDAR.getIngredient());
								runCheese = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					boolean runVegetables = true;
					while (runVegetables) {
						System.out.println("Овощи: ");
						System.out.println("1.Помидоры \t2.Перец \t3.Помидоры и перец");
						int scanVegetables = scanner.nextInt();
						switch (scanVegetables) {
							case 1:
								ingredientsCustomPizza.add(IngredientsNames.TOMATOES.getIngredient());
								runVegetables = false;
								break;
							case 2:
								ingredientsCustomPizza.add(IngredientsNames.PEPPER.getIngredient());
								runVegetables = false;
								break;
							case 3:
								ingredientsCustomPizza.add(IngredientsNames.TOMATOES.getIngredient());
								ingredientsCustomPizza.add(IngredientsNames.PEPPER.getIngredient());
								runVegetables = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					boolean runDough = true;
					while (runDough) {
						System.out.println("Тип теста: ");
						System.out.println("1.Тонкое \t2.Толстое");
						int scanDough = scanner.nextInt();
						switch (scanDough) {
							case 1:
								ingredientsCustomPizza.add(IngredientsNames.DOUGHTHIN.getIngredient());
								runDough = false;
								break;
							case 2:
								ingredientsCustomPizza.add(IngredientsNames.DOUGHTHICK.getIngredient());
								runDough = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					boolean runSide = true;
					while (runSide) {
						System.out.println("Тип борта: ");
						System.out.println("1.С бортом \t2.Без борта");
						int scanSide = scanner.nextInt();
						switch (scanSide) {
							case 1:
								ingredientsCustomPizza.add(IngredientsNames.WITHSIDE.getIngredient());
								runSide = false;
								break;
							case 2:
								ingredientsCustomPizza.add(IngredientsNames.NOSIDE.getIngredient());
								runSide = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					pizzaOrder = new PizzaCustomMade(ingredientsCustomPizza);
					new Print().printIngredients(pizzaOrder);

					System.out.print("\nУкажите количество пицц: ");
					int numberCustomPizza = scanner.nextInt();
					double discountCustomPizza = new Discount().discountNumberPizza(day, numberCustomPizza,
							pizzaOrder.getPrice());
					double costCustomPizza = new CostPizza().calculationCost(pizzaOrder.getPrice(), numberCustomPizza,
							discountCustomPizza);
					new Print().printInfoForPayment(pizzaOrder, numberCustomPizza, costCustomPizza, discountCustomPizza);

					boolean runPay2 = true;
					while (runPay2) {
						System.out.println("Выбор способа оплаты: ");
						System.out.println("1.Наличными \t2.Банковской картой \t3.На сайте");
						int payment = scanner.nextInt();
						switch (payment) {
							case 1:
								new Print().printCash(costCustomPizza);
								runPay2 = false;
								break;
							case 2:
								new Print().printCreditCard(costCustomPizza);
								runPay2 = false;
								break;
							case 3:
								new Print().printOnline(costCustomPizza);
								runPay2 = false;
								break;
							default:
								System.out.println("Не верно указан номер!!!");
						}
					}
					new SetOrders().setOrdersPizza(pizzaOrder, mapOrdersPizza, numberCustomPizza);
					ingredientsCustomPizza.remove(ingredientsCustomPizza.size() - 1);
					ingredientsCustomPizza.remove(ingredientsCustomPizza.size() - 1);
					new SetIngredients().setIngredient(new PizzaCustomMade(ingredientsCustomPizza), mapNumberIngredients,
							numberCustomPizza);
					profit.setProfit(costCustomPizza);
					new SaveToFile().saveFilePizza(pizzaOrder, numberCustomPizza, costCustomPizza, discountCustomPizza);
					break;
				case 3:
					int numberSalesPizza = new SalesPizza().sales(mapOrdersPizza);
					new Print().printNumberSalesPizza(numberSalesPizza);
					break;
				case 4:
					double numberProfit = profit.getNumberSalesProfit();
					new Print().printProfit(numberProfit);
					break;
				case 5:
					new Print().printNumberIngredients(mapNumberIngredients);
					break;
				case 6:
					runMain = false;
					System.out.println("Get out of the pizzeria!!!");
					break;
				default:
					System.out.println("Не верно указан номер!!!");
			}
			Map<String, Integer> mapNeedIngredients = new NeedIngredients().needIngredients(mapNumberIngredients);
			if (!mapNeedIngredients.isEmpty()) {
				new Print().printNeedInIngredients(mapNeedIngredients);
				mapNeedIngredients.clear();
			}
		}
	}
}