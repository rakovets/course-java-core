import java.util.Scanner;

public class StandardRecipesPizza {
	Scanner scanner = new Scanner(System.in);
	Order order = new Order();

	public void selection() {
			System.out.println("Выбор пиццы:");
			System.out.println("1.'Четыре сыра' - 9.9 руб. \n2.'Пепперони'   - 10.9 руб. \n3.'Барбекю'     - 11.9 руб. \n" +
					"4.'Деревенская' - 5.5 руб. \n5.'Болоньезе'   - 11.9 руб. \n6.'Грибная'     - 5.6 руб. \n" +
					"7.'Везувий'     - 6.3 руб. \n8.Отмена заказа");
			int scanPizza = scanner.nextInt();
			if (scanPizza != 8) {
				numberPizza(scanPizza);
			} else {
				System.out.println("Заказ отменен!!!");
		}
	}

	void numberPizza(int scanPizza) {
		switch (scanPizza) {
			case 1:
				System.out.print("\n'Четыре сыра', укажите количество пицц: ");
				int scanNumberPizzaFourСheeses = scanner.nextInt();
				order.orderPizza(new PizzaFourСheeses().getName(), scanNumberPizzaFourСheeses, new PizzaFourСheeses().getPrice());
				break;
			case 2:
				System.out.print("\n'Пепперони', укажите количество пицц: ");
				int scanNumberPizzaPepperoni = scanner.nextInt();
				order.orderPizza(new PizzaPepperoni().getName(), scanNumberPizzaPepperoni, new PizzaPepperoni().getPrice());
				break;
			case 3:
				System.out.print("\n'Барбекю', укажите количество пицц: ");
				int scanNumberPizzaBarbecue = scanner.nextInt();
				order.orderPizza(new PizzaBarbecue().getName(), scanNumberPizzaBarbecue, new PizzaBarbecue().getPrice());
				break;
			case 4:
				System.out.print("\n'Деревенская', укажите количество пицц: ");
				int scanNumberPizzaDerevenskaya = scanner.nextInt();
				order.orderPizza(new PizzaDerevenskaya().getName(), scanNumberPizzaDerevenskaya, new PizzaDerevenskaya().getPrice());
				break;
			case 5:
				System.out.print("\n'Болоньезе', укажите количество пицц: ");
				int scanNumberPizzaBolognese = scanner.nextInt();
				order.orderPizza(new PizzaBolognese().getName(), scanNumberPizzaBolognese, new PizzaBolognese().getPrice());
				break;
			case 6:
				System.out.print("\n'Грибная', укажите количество пицц: ");
				int scanNumberPizzaMushroom = scanner.nextInt();
				order.orderPizza(new PizzaMushroom().getName(), scanNumberPizzaMushroom, new PizzaMushroom().getPrice());
				break;
			case 7:
				System.out.print("\n'Везувий', укажите количество пицц: ");
				int scanNumberPizzaVesuvius = scanner.nextInt();
				order.orderPizza(new PizzaVesuvius().getName(), scanNumberPizzaVesuvius, new PizzaVesuvius().getPrice());
				break;
			default:
				System.out.println("Не верно указан номер!!!");
		}
	}
}
