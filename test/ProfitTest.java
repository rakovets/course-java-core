import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.rakovets.java.pattern_mvc.pizzeria.models.Profit;

class ProfitTest {
	private Profit profit = new Profit(50.0);

	@Test
	void getNumberSalesProfitTest() {
		profit.setProfit(35.0);
		Assertions.assertEquals(85.0, profit.getNumberProfit());
	}
}