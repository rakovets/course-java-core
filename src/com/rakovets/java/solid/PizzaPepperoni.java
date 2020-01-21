import java.util.List;

public class PizzaPepperoni {
	private String name = "'Пепперони'";
	private double price = 10.9;
	private String mozzarella = "'Моцарелла'";
	private String pepperoni = "'Колбаса пепперони'";
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	List<String> indigentsPizzaPepperoni = List.of(mozzarella, pepperoni, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
