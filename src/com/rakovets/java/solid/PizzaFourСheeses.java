import java.util.List;

public class PizzaFourСheeses {
	private String name = "'Четыре сыра'";
	private double price = 9.9;
	private String mozzarella = "'Моцарелла'";
	private String cheddar = "'Чеддер'";
	private String parmesan = "'Пармезан'";
	private String jugas = "'Джюгас'";
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	List<String> indigentsPizzaFourСheeses = List.of(mozzarella, cheddar, parmesan, jugas, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
