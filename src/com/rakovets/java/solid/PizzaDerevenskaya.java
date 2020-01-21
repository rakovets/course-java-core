import java.util.List;

public class PizzaDerevenskaya implements IndigentsName{
	private String name = "'Деревенская'";
	private double price = 5.5;
	List<String> indigentsPizzaDerevenskaya = List.of(mozzarellaName, eggName, baconName, cucumberName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
