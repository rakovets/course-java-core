package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;
import java.util.regex.Pattern;
import  java.util.regex.Matcher;

import java.util.Arrays;

/**
 * Разработать программу для анализа банковских отчетов.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
	/**
	 * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
	 */
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		System.out.println("Enter report with money format: ' count$ '");
		String text = INPUT_SCANNER.nextLine();

		// Вызов методов
		text ="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s when an unknown printer took a galley of type11$ and scrambled it to make a type specimen book. It has survived not only five centuries but also the leap into electronic typesetting remaining 10$ 12$ essentially 13$ unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem";
		getArrayMoneyFromReport(text);
		getSumMoneyFromReport(text);


	}

	/**
	 * Возвращает список сумм, которые встречаются в отчете.
	 * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
	 * @return список сумм
	 */
	static double[] getArrayMoneyFromReport(String report) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Pattern pattern = Pattern.compile("\\s[^a-zA-Z|,|\\s]+\\$\\s");
		Matcher matcher = pattern.matcher(report);
		String patternString = "";
		while (matcher.find()) {
			patternString += matcher.group();
		}
		patternString = patternString.replace(" ", "");
		String[] arrayMoneyString = patternString.split("[$]");
		double[] arrayMoneyDouble = (patternString == "") ? new double[0] : new double[arrayMoneyString.length];
		if (patternString != "") {
			for (int i = 0; i < arrayMoneyString.length; i++) {
				arrayMoneyDouble[i] = Double.parseDouble(arrayMoneyString[i]);
			}
		}
		return arrayMoneyDouble;
	}

	/**
	 * Возвращает общую сумму всех денег, которые встречаются в отчете.
	 * @param report в котором содержатся суммы в виде ' ${money}$ ', где ${money} - это сумма
	 * @return общую сумму всех денег
	 */
	static double getSumMoneyFromReport(String report) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Pattern pattern = Pattern.compile("\\s[^a-zA-Z|,|\\s]+\\$\\s");
		Matcher matcher = pattern.matcher(report);
		String patternString = "";
		while (matcher.find()) {
			patternString += matcher.group();
		}
		patternString = patternString.replace(" ", "");
		String[] arrayMoneyString = patternString.split("[$]");
		double[] arrayMoneyDouble = new double[arrayMoneyString.length];
		double amountMoney = 0;
		if (patternString != "") {
			for (int i = 0; i < arrayMoneyString.length; i++) {
				arrayMoneyDouble[i] = Double.parseDouble(arrayMoneyString[i]);
				amountMoney += arrayMoneyDouble[i];
			}
		}
		return amountMoney;
	}
}