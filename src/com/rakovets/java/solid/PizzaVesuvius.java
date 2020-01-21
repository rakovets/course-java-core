import java.util.List;

public class PizzaVesuvius implements IndigentsName{
	private String name = "'Везувий'";
	private double price = 6.3;
	//соус из протертых томатов, сыр Моцарелла, ветчина, приправа к пицце, чесночное масло
	List<String> indigentsPizzaVesuvius = List.of(mozzarellaName, hamName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
