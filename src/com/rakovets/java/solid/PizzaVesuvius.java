import java.util.List;

public class PizzaVesuvius implements IngredientsName {
	private String name = "'Везувий'";
	private double price = 6.3;
	List<String> indigentsPizzaVesuvius = List.of(mozzarellaName, hamName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setHam(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
