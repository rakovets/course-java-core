import java.util.List;

public class PizzaFourСheeses implements IngredientsName {
	private String name = "'Четыре сыра'";
	private double price = 9.9;
	List<String> indigentsPizzaFourСheeses = List.of(mozzarellaName, cheddarName, parmesanName, jugasName, tomatoesName,
			doughName);

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	void setNumberIngredients(NumberIngredients numberIngredients, int numberPizza) {
		numberIngredients.setMozzarella(numberPizza);
		numberIngredients.setCheddar(numberPizza);
		numberIngredients.setParmesan(numberPizza);
		numberIngredients.setJugas(numberPizza);
		numberIngredients.setTomatoes(numberPizza);
		numberIngredients.setDough(numberPizza);
	}
}
