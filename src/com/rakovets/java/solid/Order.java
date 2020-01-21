import java.util.Scanner;

public class Order {
	Scanner scanner = new Scanner(System.in);
	double cost = 0;
	boolean run = true;

	void orderPizza(String pizza, int number, double price) {
		cost = number * price;
		System.out.printf("\nВаш заказ: Пицца %s, количество %d шт., стоимость %d * %.1f = %.1f руб.\n",
				pizza, number, number, price, cost);
		while (run) {
			System.out.println("\n1.Оплатить \t 2. Отмена заказа");
			int scan = scanner.nextInt();
			if (scan == 1) {
				System.out.println("Оплачено!\n");
				run = false;
			} else if (scan == 2) {
				System.out.println("Заказ отменен!!!");
				run = false;
			} else {
				System.out.println("Не сложно выбрать - 1 или 2. Попытайся ещё!!!");
			}
		}
	}
}
