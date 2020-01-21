import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("PIZZERIA");
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n1.Новый заказ \t 2.Выйти");
			int scan = scanner.nextInt();
			if (scan == 1) {
				new SelectionPizza().selection();
			} else if (scan == 2) {
				run = false;
				System.out.println("Go away, THE END!!!");
			} else {
				System.out.println("Не сложно выбрать - 1 или 2. Попытайся ещё!!!");
			}
		}
	}
}
