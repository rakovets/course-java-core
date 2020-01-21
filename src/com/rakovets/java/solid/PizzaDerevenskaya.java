import java.util.List;

public class PizzaDerevenskaya {
	private String name = "'Деревенская'";
	private double price = 5.5;
	private String dough = "'Тесто'";
	private String bacon = "'Бекон'";
	private String mozzarella = "'Моцарелла'";
	private String egg = "'Яйцо'";
	private String cucumber = "'Огурцы марнованые'";
	List<String> indigentsPizzaDerevenskaya = List.of(mozzarella, egg, bacon, cucumber, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
