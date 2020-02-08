package com.rakovets.java.pattern_mvc.pizzeria.controllers;

import com.rakovets.java.pattern_mvc.pizzeria.database.*;
import com.rakovets.java.pattern_mvc.pizzeria.models.*;
import com.rakovets.java.pattern_mvc.pizzeria.view.Print;
import com.rakovets.java.pattern_mvc.pizzeria.view.SaveToFile;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
	private Scanner scanner = new Scanner(System.in);
	private Pizza pizza;
	private double discount;
	private double cost;
	private int numberPizza;
	private String day;
	private Profit profit;
	private Map<String, Integer> mapNumberIngredients;
	private Map<String, Integer> mapOrdersPizza;

	public void pizzeriaRunController() {
		System.out.println("\nPIZZERIA");
		day = new DateTime().toDay();
		String todayDate = new DateTime().todayDate();
		new Print().printInfoDate(todayDate);
		new Print().printInfoDiscount();
		setProfit(new Profit(0.0));
		setMapNumberIngredients(new IngredientsBase().getMapNumberIngredients());
		setMapOrdersPizza(new HashMap<>());
		boolean runMain = true;
		while (runMain) {
			new Print().printActionOptionsUI();
			int scanMain = scanner.nextInt();
			switch (scanMain) {
				case 1:
					boolean run1 = true;
					while (run1) {
						new Print().printMenuStandardPizza();
						int pizza = scanner.nextInt();
						switch (pizza) {
							case 1:
								pizzaController(new PizzaFourСheeses());
								run1 = false;
								break;
							case 2:
								pizzaController(new PizzaPepperoni());
								run1 = false;
								break;
							case 3:
								pizzaController(new PizzaBarbecue());
								run1 = false;
								break;
							case 4:
								pizzaController(new PizzaDerevenskaya());
								run1 = false;
								break;
							case 5:
								pizzaController(new PizzaBolognese());
								run1 = false;
								break;
							case 6:
								pizzaController(new PizzaMushroom());
								run1 = false;
								break;
							case 7:
								pizzaController(new PizzaVesuvius());
								run1 = false;
								break;
							default:
								new Print().printError();
						}
					}
					new Print().printIndicateTheNumberOfPizzas();
					setNumberPizza(scanner.nextInt());
					discountController();
					costController();
					boolean runPay1 = true;
					while (runPay1) {
						new Print().printChoiceOfPaymentMethod();
						int payment = scanner.nextInt();
						switch (payment) {
							case 1:
								new Print().printCash(getCost());
								runPay1 = false;
								break;
							case 2:
								new Print().printCreditCard(getCost());
								runPay1 = false;
								break;
							case 3:
								new Print().printOnline(getCost());
								runPay1 = false;
								break;
							default:
								new Print().printError();
						}
					}
					new SetOrders().setOrdersPizza(getPizza(), getMapOrdersPizza(), getNumberPizza());
					new SetIngredients().setIngredient(getPizza(), getMapNumberIngredients(), getNumberPizza());
					profit.setProfit(getCost());
					new SaveToFile().saveFilePizza(todayDate, getPizza(), getNumberPizza(), getCost(), getDiscount());
					break;
				case 2:
					LinkedList<String> ingredientsCustomPizza = new LinkedList<>();
					new Print().printCustomPizzaIngredientsSelection();
					boolean runMeat = true;
					while (runMeat) {
						new Print().printTypesOfMeat();
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
								new Print().printError();
						}
					}
					boolean runCheese = true;
					while (runCheese) {
						new Print().printTypesOfCheese();
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
								new Print().printError();
						}
					}
					boolean runVegetables = true;
					while (runVegetables) {
						new Print().printTypesOfVegetables();
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
								new Print().printError();
						}
					}
					boolean runDough = true;
					while (runDough) {
						new Print().printTypesOfDough();
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
								new Print().printError();
						}
					}
					boolean runSide = true;
					while (runSide) {
						new Print().printTypesOfSide();
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
								new Print().printError();
						}
					}
					pizzaController(new PizzaCustomMade(ingredientsCustomPizza));

					new Print().printIndicateTheNumberOfPizzas();
					setNumberPizza(scanner.nextInt());
					discountController();
					costController();
					boolean runPay2 = true;
					while (runPay2) {
						new Print().printChoiceOfPaymentMethod();
						int payment = scanner.nextInt();
						switch (payment) {
							case 1:
								new Print().printCash(getCost());
								runPay2 = false;
								break;
							case 2:
								new Print().printCreditCard(getCost());
								runPay2 = false;
								break;
							case 3:
								new Print().printOnline(getCost());
								runPay2 = false;
								break;
							default:
								new Print().printError();
						}
					}
					new SetOrders().setOrdersPizza(getPizza(), getMapOrdersPizza(), getNumberPizza());
					ingredientsCustomPizza.remove(ingredientsCustomPizza.size() - 1);
					ingredientsCustomPizza.remove(ingredientsCustomPizza.size() - 1);
					new SetIngredients().setIngredient(new PizzaCustomMade(ingredientsCustomPizza),
							getMapNumberIngredients(), getNumberPizza());
					profit.setProfit(getCost());
					new SaveToFile().saveFilePizza(todayDate, getPizza(), getNumberPizza(), getCost(), getDiscount());
					break;
				case 3:
					int numberSalesPizza = new SalesPizza().sales(getMapOrdersPizza());
					new Print().printNumberSalesPizza(numberSalesPizza);
					break;
				case 4:
					new Print().printProfit(profit.getNumberProfit());
					break;
				case 5:
					new Print().printNumberIngredients(getMapNumberIngredients());
					break;
				case 6:
					runMain = false;
					new Print().printExit();
					break;
				default:
					new Print().printError();
			}
			Map<String, Integer> mapNeedIngredients = new NeedIngredients().needIngredients(getMapNumberIngredients());
			if (!mapNeedIngredients.isEmpty()) {
				new Print().printNeedInIngredients(mapNeedIngredients);
				mapNeedIngredients.clear();
			}
		}
	}

	private void discountController() {
		discount = new Discount().discountNumberPizza(getDay(), getNumberPizza(), getPizza().getPrice());
	}

	private void costController() {
		cost = new CostPizza().calculationCost(getPizza().getPrice(), getNumberPizza(),
				getDiscount());
		new Print().printInfoForPayment(getPizza(), getNumberPizza(), getCost(),
				getDiscount());
	}

	private void pizzaController(Pizza pizza) {
		this.pizza = pizza;
		new Print().printIngredients(pizza);
	}

	private int getNumberPizza() {
		return numberPizza;
	}

	private void setNumberPizza(int numberPizza) {
		this.numberPizza = numberPizza;
	}

	public Pizza getPizza() {
		return pizza;
	}

	private String getDay() {
		return day;
	}

	private double getDiscount() {
		return discount;
	}

	private double getCost() {
		return cost;
	}

	private Map<String, Integer> getMapNumberIngredients() {
		return mapNumberIngredients;
	}

	private void setMapNumberIngredients(Map<String, Integer> mapNumberIngredients) {
		this.mapNumberIngredients = mapNumberIngredients;
	}

	private Map<String, Integer> getMapOrdersPizza() {
		return mapOrdersPizza;
	}

	private void setMapOrdersPizza(Map<String, Integer> mapOrdersPizza) {
		this.mapOrdersPizza = mapOrdersPizza;
	}

	private void setProfit(Profit profit) {
		this.profit = profit;
	}
}
