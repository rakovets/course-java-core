import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.models.Discount;

public class DiscountTest {
	@Test
	void discountNumberPizzaTest() {
		Assertions.assertEquals(20.0, new Discount().discountNumberPizza("понедельник", 10,
				20));
		Assertions.assertEquals(4.0, new Discount().discountNumberPizza("понедельник", 2,
				20));
		Assertions.assertEquals(20.0, new Discount().discountNumberPizza("воскресенье", 10,
				20));
		Assertions.assertEquals(0.0, new Discount().discountNumberPizza("воскресенье", 2,
				20));
	}

	@Test
	void discountDayPizzaTest() {
		Assertions.assertEquals(4.0, new Discount().discountDayPizza("понедельник", 2,
				20));
		Assertions.assertEquals(0.0, new Discount().discountDayPizza("воскресенье", 2,
				20));
	}
}