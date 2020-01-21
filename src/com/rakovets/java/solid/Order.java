import java.util.Scanner;

public class Order {
	Scanner scanner = new Scanner(System.in);
	double cost = 0;
	boolean run = true;
	double discount;

	void orderPizza(String pizza, int numberPizza, double price, Profit profit, NumberPizzasSold numberPizzasSold) {
		discount = new Discount().discountNumberPizza(numberPizza, price);
		cost = numberPizza * price - discount;
		new PrintInfoPizza().printInfoStandardPizza(pizza, numberPizza, price, cost, discount);
		new SaveToFile().saveFilePizza(pizza, numberPizza, price, cost, discount);
		while (run) {
			System.out.println("\n1.Оплатить \t 2. Отмена заказа");
			int scan = scanner.nextInt();
			if (scan == 1) {
				numberPizzasSold.setNumberPizzasSold(numberPizza);
				profit.setProfit(cost);
				new PaymentMethod().selectionMethodPayment(cost, numberPizza);
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
