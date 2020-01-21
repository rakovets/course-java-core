import java.util.LinkedList;

public class PrintInfoPizza {
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
}
