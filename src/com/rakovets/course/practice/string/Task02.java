package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;

/**
 * Разработать программу для анализа банковских отчетов.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		String text = INPUT_SCANNER.next();

		// Вызов методов
		text ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of type11$ and scrambled it to make a type specimen book. It has survived not only five centuries but also the leap into electronic typesetting remaining 10$ 12$ essentially 13$ unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem";
		getArrayMoneyFromReport(text);
		getSumMoneyFromReport(text);
	}

	/**
	 * Возвращает список сумм, которые встречаются в отчете
	 * @param report, в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
	 * @return список сумм
	 */
	static double[] getArrayMoneyFromReport(String report) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Pattern pettern = Pattern.compile("\\d*(\\$)");
		Matcher matcher = pettern.matcher(report);
		double [] money = new double[100];
		int i = 0;
		while (matcher.find()) {
			String result = matcher.group().replace("$", "");
			int number =Integer.parseInt(result);
			money[i] = number;
			i++;
		}
		return money;
	}

	/**
	 * Возвращает общую сумму всех денег, которые встречаются в отчете
	 * @param report, в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
	 * @return общую сумму всех денег
	 */
	static double getSumMoneyFromReport(String report) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		return 0.0;
	}
}