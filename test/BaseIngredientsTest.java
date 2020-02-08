import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.database.IngredientsBase;

import java.util.Map;

class BaseIngredientsTest {
	private Map<String, Integer> mapNumberIngredients = new IngredientsBase().getMapNumberIngredients();

	@Test
	void mapNumberIngredientsTest() {
		Assertions.assertEquals(mapNumberIngredients, new IngredientsBase().getMapNumberIngredients());
	}
}