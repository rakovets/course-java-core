import java.util.LinkedList;
import java.util.Scanner;

public class YourRecipePizza {
	Scanner scanner = new Scanner(System.in);
	Order order = new Order();
	LinkedList<String> indigentsYourRecipePizza = new LinkedList<>();
	String name;

	public void selection() {
		System.out.println("\nВыбор ингридиентов собственной пиццы.");
		System.out.println("Мясные ингридиенты: ");
		indigentsPizza(1);
		System.out.println("Сыр: ");
		indigentsPizza(2);
		System.out.println("Овощи: ");
		indigentsPizza(3);
		System.out.println("Тип теста: ");
		indigentsPizza(4);
		System.out.println("Тип борта: ");
		indigentsPizza(5);
		name =  new PizzaOwn().getName();
		new PrintInfoPizza().printInfoYourRecipePizza(name, indigentsYourRecipePizza);
		System.out.printf("\nУкажите количество пицц: ");
		int scanNumberYourRecipePizza = scanner.nextInt();
		order.orderPizza(new PizzaOwn().getName(), scanNumberYourRecipePizza, new PizzaOwn().getPrice());
	}

	void indigentsPizza(int indigent) {
		switch (indigent) {
			case 1:
				System.out.println("1.'Куриное филе' \t2.'Бекон' \t3.Без мяса");
				int scanIndigentMeat = scanner.nextInt();
				if (scanIndigentMeat == 1) {
					indigentsYourRecipePizza.add(new PizzaOwn().getChickenFillet());
				} else if (scanIndigentMeat == 2) {
					indigentsYourRecipePizza.add(new PizzaOwn().getBacon());
				} else if (scanIndigentMeat == 3) {
					break;
				} else {
					System.out.println("Не сложно выбрать - 1, 2 или 3. Попытайся ещё!!!");
					indigentsPizza(1);
				}
				break;
			case 2:
				System.out.println("1.'Моцарелла' \t2.'Чеддер' \t3.Моцарелла и Чеддер");
				int scanIndigentCheese = scanner.nextInt();
				if (scanIndigentCheese == 1) {
					indigentsYourRecipePizza.add(new PizzaOwn().getMozzarella());
				} else if (scanIndigentCheese == 2) {
					indigentsYourRecipePizza.add(new PizzaOwn().getCheddar());
				} else if (scanIndigentCheese == 3) {
					indigentsYourRecipePizza.add(new PizzaOwn().getMozzarella());
					indigentsYourRecipePizza.add(new PizzaOwn().getCheddar());
				} else {
					System.out.println("Не сложно выбрать - 1, 2 или 3. Попытайся ещё!!!");
					indigentsPizza(2);
				}
				break;
			case 3:
				System.out.println("1.'Помидоры' \t2.'Перец' \t3.Помидоры и перец");
				int scanIndigentVegetables = scanner.nextInt();
				if (scanIndigentVegetables == 1) {
					indigentsYourRecipePizza.add(new PizzaOwn().getTomatoes());
				} else if (scanIndigentVegetables == 2) {
					indigentsYourRecipePizza.add(new PizzaOwn().getPepper());
				} else if (scanIndigentVegetables == 3) {
					indigentsYourRecipePizza.add(new PizzaOwn().getTomatoes());
					indigentsYourRecipePizza.add(new PizzaOwn().getPepper());
				} else {
					System.out.println("Не сложно выбрать - 1, 2 или 3. Попытайся ещё!!!");
					indigentsPizza(3);
				}
				break;
			case 4:
				System.out.println("1.Тонкое \t2.Толстое");
				int scanIndigentDough = scanner.nextInt();
				if (scanIndigentDough == 1) {
					indigentsYourRecipePizza.add(new PizzaOwn().getThin());
				} else if (scanIndigentDough == 2) {
					indigentsYourRecipePizza.add(new PizzaOwn().getThick());
				} else {
					System.out.println("Не сложно выбрать - 1 или 2. Попытайся ещё!!!");
					indigentsPizza(4);
				}
				break;
			case 5:
				System.out.println("1.С бортом \t2.Без борта");
				int scanIndigentSide = scanner.nextInt();
				if (scanIndigentSide == 1) {
					indigentsYourRecipePizza.add(new PizzaOwn().getWithSide());
				} else if (scanIndigentSide == 2) {
					indigentsYourRecipePizza.add(new PizzaOwn().getNoSide());
				} else {
					System.out.println("Не сложно выбрать - 1 или 2. Попытайся ещё!!!");
					indigentsPizza(5);
				}
				break;
			default:
				System.out.println("Не верно указан номер!!!");
		}
	}
}
