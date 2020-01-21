import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
	String textInfoOrder;
	FileWriter fileWriter = null;

	void saveFilePizza(String pizza, int number, double price, double cost) {
		textInfoOrder = String.format("\nЗаказ: Пицца %s, количество %d шт., стоимость %d * %.1f = %.1f руб.",
				pizza, number, number, price, cost);

		try {
			fileWriter = new FileWriter("textInfoOrder.txt", true);
			fileWriter.write(textInfoOrder);
			fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
