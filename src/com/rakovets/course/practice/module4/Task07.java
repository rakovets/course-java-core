package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для фитнес браслета:
 * Программа позволяет расчитать пробег за N тренировок, который необходимо совершить спортсмену для подготовки к марафону. Известно:
 * @param startDistance дистанция которую может пробегать спортсмен до начала очередной тренировки
 * @param finishDistance дистанция которую сможет пробежать спортсмен после окончания очередной тренировки
 * @param dailyProgress прогресс пробега спортсмена в %, полученный в результате очередной тренировки.
 * @return пробег (точность 10 метром)
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task07 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		int startDistance = (args.length!=3) ? scanner.nextInt():Integer.parseInt(args[0]);
		int finishDistance = (args.length!=3) ? scanner.nextInt():Integer.parseInt(args[1]);
		double dailyProgress = (args.length!=3) ? scanner.nextDouble():Double.parseDouble(args[2]);

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
        double result = startDistance;
        double result1 = 0.0;
        double result2 = 0.0;
        double answer = 0.0;
		if (startDistance > 0) {
				for (; result < finishDistance; ) {
				result = Math.round((result * (100.0 + dailyProgress)) / 1.0) * 0.01;
				answer = Math.round((answer + result) * 100.0 / 1.0) * 0.01;
			}
			System.out.print(answer - startDistance);
		}
		else {
			System.out.print("0.00");
		}
	}
}