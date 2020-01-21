import java.util.List;

public class PizzaBarbecue implements IndigentsName{
	private String name = "'Барбекю'";
	private double price = 11.9;
	List<String> indigentsPizzaBarbecue = List.of(mozzarellaName, chickenFilletName, baconName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
