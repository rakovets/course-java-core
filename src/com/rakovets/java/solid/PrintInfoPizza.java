import java.util.LinkedList;
import java.util.Map;

public class PrintInfoPizza implements IngredientsName {
	String textInfoPizza;

	void printInfoStandardPizza(String pizza, int number, double price, double cost, double discountNumberPizza) {
		textInfoPizza = String.format("\nВаш заказ: Пицца %s, количество %d шт., стоимость %d * %.1f - скидка %.1f = %.1f руб.",
				pizza, number, number, price, discountNumberPizza, cost);
		System.out.println(textInfoPizza);
	}

	void printInfoIndigentsPizza(String name) {
		switch (name) {
			case "'Четыре сыра'":
				System.out.printf("Ингридиенты: %s", new PizzaFourСheeses().indigentsPizzaFourСheeses);
				break;
			case "'Пепперони'":
				System.out.printf("Ингридиенты: %s", new PizzaPepperoni().indigentsPizzaPepperoni);
				break;
			case "'Барбекю'":
				System.out.printf("Ингридиенты: %s", new PizzaBarbecue().indigentsPizzaBarbecue);
				break;
			case "'Деревенская'":
				System.out.printf("Ингридиенты: %s", new PizzaDerevenskaya().indigentsPizzaDerevenskaya);
				break;
			case "'Болоньезе'":
				System.out.printf("Ингридиенты: %s", new PizzaBolognese().indigentsPizzaBolognese);
				break;
			case "'Грибная'":
				System.out.printf("Ингридиенты: %s", new PizzaMushroom().indigentsPizzaMushroom);
				break;
			case "'Везувий'":
				System.out.printf("Ингридиенты: %s", new PizzaVesuvius().indigentsPizzaVesuvius);
				break;
		}
	}

	void printInfoYourRecipePizza(String name, LinkedList<String> linkedListIndigents) {
		System.out.printf("Пицца %s: %s \n", name, linkedListIndigents);
	}

	void printInfoNumberPizzasSold(NumberPizzasSold numberPizzasSold) {
		System.out.printf("Количество проданных пицц = %d шт.\n", numberPizzasSold.getNumberPizzasSold());
	}

	void printInfoProfit(Profit profit) {
		System.out.printf("Прибыль = %.1f руб.\n", profit.getProfit());
	}

	void printInfoNumberIngredients(NumberIngredients numberIngredients) {
		System.out.println("Количество ингредиентов: ");
		numberIngredients.mapNumberIngredients().entrySet().forEach(System.out::println);
	}
}
