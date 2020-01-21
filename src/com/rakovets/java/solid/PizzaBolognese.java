import java.util.List;

public class PizzaBolognese implements IngredientsName {
	private String name = "'Болоньезе'";
	private double price = 11.9;
	List<String> indigentsPizzaBolognese = List.of(mozzarellaName, beefName, baconName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setBeef(numberPizza);
		numberIngredients.setBacon(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
