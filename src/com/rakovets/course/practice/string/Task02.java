package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		System.out.println(Arrays.toString(getArrayMoneyFromReport(text)));
		System.out.println(getSumMoneyFromReport(text));
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
		Pattern p = Pattern.compile("\\s\\u002D?\\d+?\\u002E?\\d*?\\u0024\\s+?");
		Matcher m = p.matcher(report);
		ArrayList<Double> list = new ArrayList<Double>();
		String stringAnswer = null;
		while (m.find()){
			stringAnswer = report.substring(m.start(), m.end() - 2);
			list.add(Double.parseDouble(stringAnswer));
		}
		double[] answer = new double[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
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
		Pattern p = Pattern.compile("\\s\\u002D?\\d+?\\u002E?\\d*?\\u0024\\s+?");
		Matcher m = p.matcher(report);
		double answer = 0;
		String number = null;
		while (m.find()){
			number = report.substring(m.start(), m.end() - 2);
			answer += Double.parseDouble(number);
		}
		return answer;
	}
}