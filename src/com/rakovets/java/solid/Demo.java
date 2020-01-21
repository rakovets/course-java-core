import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		System.out.println("\nPIZZERIA");
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE HH:mm:ss");
		System.out.println(dateTime.format(formatter));
		System.out.println("(Скидка 10% в будние дни и при заказе от 3 и более пицц)");
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n1.Стандартные семь рецептов пиццы \t 2.Свой рецепт пиццы \t 3.Выйти");
			int scan = scanner.nextInt();
			if (scan == 1) {
				new StandardRecipesPizza().selection();
			} else if (scan == 2) {
				new YourRecipePizza().selection();
			} else if (scan == 3) {
				run = false;
				System.out.println("Go away, THE END!!!");
			} else {
				System.out.println("Не сложно выбрать - 1 или 2. Попытайся ещё!!!");
			}
		}
	}
}
