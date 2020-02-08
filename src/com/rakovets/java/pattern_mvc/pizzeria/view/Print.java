package com.rakovets.java.pattern_mvc.pizzeria.view;

import com.rakovets.java.pattern_mvc.pizzeria.database.Pizza;

import java.util.Map;

public class Print {

	public void printIngredients(Pizza pizza) {
		System.out.printf("Пицца %s, ингредиенты: %s", pizza.getName(), pizza.getIngredients());
	}

	public void printInfoForPayment(Pizza pizza, int number, double cost, double discountNumberPizza) {
		System.out.printf("\nВаш заказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f " +
				"= %.1f руб.\n", pizza.getName(), number, number, pizza.getPrice(), discountNumberPizza, cost);
	}

	public void printNeedInIngredients(Map<String, Integer> mapNeedIngredients) {
		System.out.println("\nНеобходимо докупить ингредиентов!!! Ингредиентов менее 10 шт.: \n");
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

	public void printInfoDate(String todayData) {
		System.out.println(todayData);
	}

	public void printInfoDiscount() {
		System.out.println("(Скидка 10% в будние дни ИЛИ 10% при заказе от 3 и более пицц)");
	}

	public void printActionOptionsUI() {
		System.out.println("\n1.Стандартные семь рецептов пиццы \t 2.Свой рецепт пиццы \t " +
				"3.Просмотреть количество проданных пицц \n4.Просмотреть прибыль \t 5.Информацию о наличии ингредиентов " +
				"\t 6.Выйти");
	}

	public void printMenuStandardPizza() {
		System.out.println("Выбор пиццы:");
		System.out.println("1.'Четыре сыра' - 9.9 руб. \n2.'Пепперони'   - 10.9 руб. \n" +
				"3.'Барбекю'     - 11.9 руб. \n4.'Деревенская' - 5.5 руб. \n5.'Болоньезе'   - 11.9 руб. \n" +
				"6.'Грибная'     - 5.6 руб. \n7.'Везувий'     - 6.3 руб. \n");
	}

	public void printError() {
		System.out.println("Не верно указан номер!!!");
	}

	public void printIndicateTheNumberOfPizzas() {
		System.out.print("\nУкажите количество пицц: ");
	}

	public void printChoiceOfPaymentMethod() {
		System.out.println("\nВыбор способа оплаты: ");
		System.out.println("1.Наличными \t2.Банковской картой \t3.На сайте");
	}

	public void printCustomPizzaIngredientsSelection() {
		System.out.println("\nВыбор ингридиентов собственной пиццы.");
	}

	public void printTypesOfMeat() {
		System.out.println("Мясо: ");
		System.out.println("1.Куриное филе \t2.Бекон");
	}

	public void printTypesOfCheese() {
		System.out.println("Сыр: ");
		System.out.println("1.Моцарелла \t2.Чеддер \t3.Моцарелла и Чеддер");
	}

	public void printTypesOfVegetables() {
		System.out.println("Овощи: ");
		System.out.println("1.Помидоры \t2.Перец \t3.Помидоры и перец");
	}

	public void printTypesOfDough() {
		System.out.println("Тип теста: ");
		System.out.println("1.Тонкое \t2.Толстое");
	}

	public void printTypesOfSide() {
		System.out.println("Тип борта: ");
		System.out.println("1.С бортом \t2.Без борта");
	}

	public void printExit() {
		System.out.println("Get out of the pizzeria!!!");
	}
}