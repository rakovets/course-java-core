import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.junit.pizzeria.models.BaseIngredients;

import java.util.Map;

class BaseIngredientsTest {
	private Map<String, Integer> mapNumberIngredients = new BaseIngredients().getMapNumberIngredients();

	@Test
	void mapNumberIngredientsTest() {
		Assertions.assertEquals(mapNumberIngredients, new BaseIngredients().getMapNumberIngredients());
	}
}