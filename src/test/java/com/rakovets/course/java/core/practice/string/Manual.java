package com.rakovets.course.java.core.practice.string;

import com.rakovets.course.java.core.example.string.Example;
public class Manual {
    public static void main(String[] args) {
        int quantityOfVowels = 0;
        String str1 = "Meet my family";
        for (int i = 0; i<str1.length();i++)
        {
            char currentLetter = str1.charAt(i);
            if (currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u' || currentLetter == 'y'
                    || currentLetter == 'A'|| currentLetter == 'E' || currentLetter == 'I' || currentLetter == 'O' || currentLetter == 'U' || currentLetter == 'Y')
            {
                quantityOfVowels++;
            }
        }
        System.out.println(quantityOfVowels);


     //   int result = StringUtil.existsVowels("Meet my family");
     //   System.out.println(result);
    }
}
