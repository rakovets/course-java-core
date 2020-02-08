import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.database.IngredientsNames;
import com.rakovets.java.pattern_mvc.pizzeria.models.NeedIngredients;

import java.util.HashMap;
import java.util.Map;

class NeedIngredientsTest {
	private Map<String, Integer> mapNumberIngredients1 = new HashMap<>();
	private Map<String, Integer> needIngredients1 = new HashMap<>();
	private Map<String, Integer> mapNumberIngredients2 = new HashMap<>();
	private Map<String, Integer> needIngredients2 = new HashMap<>();//null

	@Test
	void needIngredientsTest1() {
		mapNumberIngredients1.put(IngredientsNames.TOMATOES.getIngredient(), 9);
		mapNumberIngredients1.put(IngredientsNames.DOUGH.getIngredient(), 50);
		needIngredients1.put(IngredientsNames.TOMATOES.getIngredient(), 9);
		Assertions.assertEquals(needIngredients1, new NeedIngredients().needIngredients(mapNumberIngredients1));
	}

	@Test
	void needIngredientsTest2() {
		mapNumberIngredients2.put(IngredientsNames.TOMATOES.getIngredient(), 50);
		mapNumberIngredients2.put(IngredientsNames.DOUGH.getIngredient(), 50);
		Assertions.assertEquals(needIngredients2, new NeedIngredients().needIngredients(mapNumberIngredients2));
	}
}