import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.models.CostPizza;

public class CostPizzaTest {

	@Test
	void calculationCost() {
		Assertions.assertEquals(195.0, new CostPizza().calculationCost(20.0, 10,
				5.0));
	}
}