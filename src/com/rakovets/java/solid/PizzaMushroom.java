import java.util.List;

public class PizzaMushroom {
	private String name = "'Грибная'";
	private double price = 5.6;
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	private String champignon = "'Шампиньоны'";
	private String mozzarella = "'Моцарелла'";
	List<String> indigentsPizzaMushroom = List.of(mozzarella, champignon, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
