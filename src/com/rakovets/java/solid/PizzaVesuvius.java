import java.util.List;

public class PizzaVesuvius {
	private String name = "'Везувий'";
	private double price = 6.3;
	//соус из протертых томатов, сыр Моцарелла, ветчина, приправа к пицце, чесночное масло
	private String tomatoes = "'Помидоры'";
	private String dough = "'Тесто'";
	private String ham = "'Ветчина'";
	private String mozzarella = "'Моцарелла'";
	List<String> indigentsPizzaVesuvius = List.of(mozzarella, ham, tomatoes, dough);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
