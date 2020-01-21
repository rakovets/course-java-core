import java.util.List;

public class PizzaBolognese {
	private String name = "'Болоньезе'";
	private double price = 11.9;
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	private String beef = "'Фарш из говядины'";
	private String bacon = "'Бекон'";
	private String mozzarella = "'Моцарелла'";
	List<String> indigentsPizzaBolognese = List.of(mozzarella, beef, bacon, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
