package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

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
		return null;
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