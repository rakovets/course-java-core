import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.database.PizzaBarbecue;
import com.rakovets.java.pattern_mvc.pizzeria.database.PizzaBolognese;
import com.rakovets.java.pattern_mvc.pizzeria.models.SetOrders;
import com.rakovets.java.pattern_mvc.pizzeria.models.SalesPizza;

import java.util.HashMap;
import java.util.Map;

class SalesPizzaTest {
	private Map<String, Integer> mapOrdersPizza = new HashMap<>();

	@Test
	void salesTest() {
		new SetOrders().setOrdersPizza(new PizzaBolognese(), mapOrdersPizza, 15);
		new SetOrders().setOrdersPizza(new PizzaBarbecue(), mapOrdersPizza, 25);
		Assertions.assertEquals(40, new SalesPizza().sales(mapOrdersPizza));
	}
}