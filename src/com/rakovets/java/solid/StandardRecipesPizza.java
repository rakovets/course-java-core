import java.util.Scanner;

public class StandardRecipesPizza {
	Scanner scanner = new Scanner(System.in);
	Order order = new Order();

	public void selection(Profit profit, NumberPizzasSold numberPizzasSold) {
			System.out.println("Выбор пиццы:");
			System.out.println("1.'Четыре сыра' - 9.9 руб. \n2.'Пепперони'   - 10.9 руб. \n3.'Барбекю'     - 11.9 руб. \n" +
					"4.'Деревенская' - 5.5 руб. \n5.'Болоньезе'   - 11.9 руб. \n6.'Грибная'     - 5.6 руб. \n" +
					"7.'Везувий'     - 6.3 руб. \n8.Отмена заказа");
			int scanPizza = scanner.nextInt();
			if (scanPizza != 8) {
				numberPizza(scanPizza, profit, numberPizzasSold);
			} else {
				System.out.println("Заказ отменен!!!");
		}
	}

	void numberPizza(int scanPizza, Profit profit, NumberPizzasSold numberPizzasSold) {
		switch (scanPizza) {
			case 1:
				new PrintInfoPizza().printInfoIndigentsPizza("'Четыре сыра'");
				System.out.print("\n'Четыре сыра', укажите количество пицц: ");
				int scanNumberPizzaFourСheeses = scanner.nextInt();
				order.orderPizza(new PizzaFourСheeses().getName(), scanNumberPizzaFourСheeses,
						new PizzaFourСheeses().getPrice(), profit, numberPizzasSold);
				break;
			case 2:
				new PrintInfoPizza().printInfoIndigentsPizza("'Пепперони'");
				System.out.print("\n'Пепперони', укажите количество пицц: ");
				int scanNumberPizzaPepperoni = scanner.nextInt();
				order.orderPizza(new PizzaPepperoni().getName(), scanNumberPizzaPepperoni,
						new PizzaPepperoni().getPrice(), profit, numberPizzasSold);
				break;
			case 3:
				new PrintInfoPizza().printInfoIndigentsPizza("'Барбекю'");
				System.out.print("\n'Барбекю', укажите количество пицц: ");
				int scanNumberPizzaBarbecue = scanner.nextInt();
				order.orderPizza(new PizzaBarbecue().getName(), scanNumberPizzaBarbecue,
						new PizzaBarbecue().getPrice(), profit, numberPizzasSold);
				break;
			case 4:
				new PrintInfoPizza().printInfoIndigentsPizza("'Деревенская'");
				System.out.print("\n'Деревенская', укажите количество пицц: ");
				int scanNumberPizzaDerevenskaya = scanner.nextInt();
				order.orderPizza(new PizzaDerevenskaya().getName(), scanNumberPizzaDerevenskaya,
						new PizzaDerevenskaya().getPrice(), profit, numberPizzasSold);
				break;
			case 5:
				new PrintInfoPizza().printInfoIndigentsPizza("'Болоньезе'");
				System.out.print("\n'Болоньезе', укажите количество пицц: ");
				int scanNumberPizzaBolognese = scanner.nextInt();
				order.orderPizza(new PizzaBolognese().getName(), scanNumberPizzaBolognese,
						new PizzaBolognese().getPrice(), profit, numberPizzasSold);
				break;
			case 6:
				new PrintInfoPizza().printInfoIndigentsPizza("'Грибная'");
				System.out.print("\n'Грибная', укажите количество пицц: ");
				int scanNumberPizzaMushroom = scanner.nextInt();
				order.orderPizza(new PizzaMushroom().getName(), scanNumberPizzaMushroom,
						new PizzaMushroom().getPrice(), profit, numberPizzasSold);
				break;
			case 7:
				new PrintInfoPizza().printInfoIndigentsPizza("'Везувий'");
				System.out.print("\n'Везувий', укажите количество пицц: ");
				int scanNumberPizzaVesuvius = scanner.nextInt();
				order.orderPizza(new PizzaVesuvius().getName(), scanNumberPizzaVesuvius,
						new PizzaVesuvius().getPrice(), profit, numberPizzasSold);
				break;
			default:
				System.out.println("Не верно указан номер!!!");
		}
	}
}
