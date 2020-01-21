import java.util.List;

public class PizzaMushroom implements IngredientsName {
	private String name = "'Грибная'";
	private double price = 5.6;
	List<String> indigentsPizzaMushroom = List.of(mozzarellaName, champignonName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setChampignon(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
