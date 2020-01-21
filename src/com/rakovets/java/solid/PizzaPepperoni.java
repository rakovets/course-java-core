import java.util.List;

public class PizzaPepperoni implements IngredientsName {
	private String name = "'Пепперони'";
	private double price = 10.9;
	List<String> indigentsPizzaPepperoni = List.of(mozzarellaName, pepperoniName, tomatoesName, doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setPepperoni(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
