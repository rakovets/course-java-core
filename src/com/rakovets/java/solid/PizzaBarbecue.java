import java.util.List;

public class PizzaBarbecue {
	private String name = "'Барбекю'";
	private double price = 11.9;
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	private String chickenFillet = "'Куриное филе'";
	private String bacon = "'Бекон'";
	private String mozzarella = "'Моцарелла'";
	List<String> indigentsPizzaBarbecue = List.of(mozzarella, chickenFillet, bacon, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
