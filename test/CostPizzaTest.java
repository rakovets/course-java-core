import com.rakovets.java.junit.pizzeria.models.CostPizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CostPizzaTest {
	@Test
	void calculationCost() {
		Assertions.assertEquals(195.0, new CostPizza().calculationCost(20.0, 10,
				5.0));
	}
}