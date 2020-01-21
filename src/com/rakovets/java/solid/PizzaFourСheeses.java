import java.util.List;

public class PizzaFourСheeses implements IndigentsName{
	private String name = "'Четыре сыра'";
	private double price = 9.9;
	List<String> indigentsPizzaFourСheeses = List.of(mozzarellaName, cheddarName, parmesanName, jugasName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
