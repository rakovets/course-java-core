package com.rakovets.course.puzzle.module3;

import java.util.Random;

/**
 * 
 * Бесплатная программа-словарь Rhymes позволит легко подобрать рифму
 *
 */

public class Rhymes {
	// Класс для получения случайных чисел
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        // метод nextInt возвращает случайное число от 0 до 2 
        switch(rnd.nextInt(2)) {
            case 1:  word = new StringBuffer('P');
            case 2:  word = new StringBuffer('G');
            default: word = new StringBuffer('M');
        }
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
        //FIXME исправь программу таким образом,чтобы она выводила случайные слова Pain, Gain или Main
    }
}