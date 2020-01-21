import java.util.List;

public class PizzaDerevenskaya implements IngredientsName {
	private String name = "'Деревенская'";
	private double price = 5.5;
	List<String> indigentsPizzaDerevenskaya = List.of(mozzarellaName, eggName, baconName, cucumberName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setEgg(numberPizza);
		numberIngredients.setBacon(numberPizza);
		numberIngredients.setCucumber(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
