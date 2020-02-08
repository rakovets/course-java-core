import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.database.PizzaBarbecue;
import com.rakovets.java.pattern_mvc.pizzeria.database.IngredientsNames;
import com.rakovets.java.pattern_mvc.pizzeria.database.PizzaNames;

import java.util.List;

class PizzaTest {
	private List<String> ingredients = List.of(IngredientsNames.MOZZARELLA.getIngredient(),
			IngredientsNames.CHICKEN.getIngredient(), IngredientsNames.BACON.getIngredient(),
			IngredientsNames.TOMATOES.getIngredient(), IngredientsNames.DOUGH.getIngredient());

	@Test
	void getNameTest() {
		Assertions.assertEquals(PizzaNames.BARBECUE.getPizzaName(), new PizzaBarbecue().getName());
	}

	@Test
	void getPriceTest() {
		Assertions.assertEquals(11.9, new PizzaBarbecue().getPrice());
	}

	@Test
	void getIngredientsTest() {
		Assertions.assertEquals(ingredients, new PizzaBarbecue().getIngredients());
	}
}
