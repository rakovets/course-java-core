package com.rakovets.course.challenge;

import java.util.Scanner;

public class StringChallengeSolutions {
    public static void main(String[] args) {

//        glueStrings();
//        getIndexBySymbol();
//        compareStringsOfUser();
//        deleteSpaces();
//        extractTextFromTill();
//        replaceSmiles();
        startAnnFinishTheSameWord();

    }

    /**Написать функцию, принимающую 2 параметра: string и word - и возвращающую true,
     * если строка начинается и заканчивается этим словом.
     */
    static void startAnnFinishTheSameWord() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = reader.nextLine();

        str = str.trim();
        int spaceFirst = str.indexOf(" ");
        int spaceLast = str.lastIndexOf(" ");
        String substr1 = str.substring(0, spaceFirst);
        String substr2 = str.substring((spaceLast + 1));

        System.out.println(substr1.equalsIgnoreCase(substr2));
    }

   /*Заменить все грустные смайлы :( в строке на весёлые :)
    */
    static void replaceSmiles() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your String with Sad smiles \":(\" : ");
        String str = reader.nextLine();
        str = str.replace(":(", ":)");
        System.out.printf("Don't worry, be happy, my frend :)\n%s", str);
    }

    /*Дан текст. Из данной строки извлечь подстроку начиная с 10 символа. Новая строка должна быть не более 23 символов.
     */
    static void extractTextFromTill() {
        int i = 0;
        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter Your String Not smaller then 10 symbols: ");
            String str = reader.nextLine();
            if (str.length() > 10) {
                str = str.substring(10,33);
                System.out.printf("String between 10 And 23 symbols = %s", str);
                i = 1;
            } else {
                System.out.printf("Your String is SMALLER than 10 symbols - try Again!\n");
            }
        }
         while (i == 0);
    }

     /*Вводится строка. Удалить пробелы в начале и конце строки. Сделать что бы вся строка состояла из прописных букв.
     */
    static void deleteSpaces() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String deleteSpacesInBeginningAndInTheEnd = reader.nextLine();
        deleteSpacesInBeginningAndInTheEnd = deleteSpacesInBeginningAndInTheEnd.trim();
        System.out.printf("Your String without spases in the beginning and in the end =\n%s\n", deleteSpacesInBeginningAndInTheEnd);
        System.out.printf("Your String in UPPERCASE =\n%s", deleteSpacesInBeginningAndInTheEnd.toUpperCase());
    }

    /*Две строки вводятся пользователем. Определить, являются ли эти строки одинаковыми (регистр важен).
     */
    static void compareStringsOfUser() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = reader.nextLine();
        System.out.println("Enter second String: ");
        String str2 = reader.nextLine();
        System.out.println((str1.equals(str2)) ? ("Your Strings are EQUIVALENT") : "Your Strings are NOT equivalent" );
    }

    /*   Дана строка. Найти индекс символа x (x – символ вводимый пользователем). Если такого символа нет, то вывести сообщение что его нет.
     */
    static void getIndexBySymbol() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = reader.nextLine();
        System.out.println("Enter Your symbol: ");
        int numberOfSymbol = (reader.nextInt() - 1);
        if (numberOfSymbol <= str.length()) {
            String result = str.substring(numberOfSymbol,(numberOfSymbol + 1));
//            System.out.println(result);
            System.out.printf("Symbol № %d = %s \n", (numberOfSymbol + 1), result);
        }
        else {
            System.out.printf("Symbol № %d is out of range (%d) of Your String", numberOfSymbol, str.length());
        }
    }

     /*  Используя методы класса String вывести строку, которая является результатом склеивания двух заданных строк.
       */
    static void glueStrings() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = reader.nextLine();
        System.out.println("Enter second String: ");
        String str2 = reader.nextLine();

        String result = str2.concat(str1);
        System.out.printf("Result 1: (second String + first String) = \"%s\" \n", result);

        String result1 = str2+str1;
        System.out.printf("Result 2: (second String + first String) = \"%s\" \n", result1);

        String result2 = str2.join("", str2, str1);
        System.out.printf("Result 3: (second String + first String) = \"%s\" \n", result2);
    }
}
