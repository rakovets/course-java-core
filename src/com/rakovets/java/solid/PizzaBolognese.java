import java.util.List;

public class PizzaBolognese implements IndigentsName{
	private String name = "'Болоньезе'";
	private double price = 11.9;
	List<String> indigentsPizzaBolognese = List.of(mozzarellaName, beefName, baconName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
