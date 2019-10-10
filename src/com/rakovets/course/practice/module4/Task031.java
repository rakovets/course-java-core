package com.rakovets.course.practice.module4;

import java.util.Scanner;

public class Task031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        double depositStart = scanner.nextDouble();
        System.out.println("Введите процент");
        double percentYear = scanner.nextDouble();
        System.out.println("Введите продолжительность вклада (в годах)");
        double depositYear = scanner.nextDouble();
        //System.out.println(depositStart + percentYear + depositYear);

        double result = depositStart;
        while(depositYear> 0) {
            result = result + result * percentYear / 100;
            depositYear--;
        }
        result = result * 100;
        result = (int)result;
        result = (double) result / 100;
        System.out.println("Ваша сумма вклада " + result);
    }
}
