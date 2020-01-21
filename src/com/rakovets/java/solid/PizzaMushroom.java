import java.util.List;

public class PizzaMushroom implements IndigentsName{
	private String name = "'Грибная'";
	private double price = 5.6;
	List<String> indigentsPizzaMushroom = List.of(mozzarellaName, champignonName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
