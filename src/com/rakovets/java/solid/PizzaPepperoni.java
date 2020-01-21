import java.util.List;

public class PizzaPepperoni implements IndigentsName{
	private String name = "'Пепперони'";
	private double price = 10.9;
	List<String> indigentsPizzaPepperoni = List.of(mozzarellaName, pepperoniName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
