import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("\nPIZZERIA");
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.Стандартные семь рецептов пиццы \t 2.Свой рецепт пиццы \t 3.Выйти");
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
