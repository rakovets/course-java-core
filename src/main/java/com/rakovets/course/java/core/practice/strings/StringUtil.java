package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String glue(String text1, String text2) {
        return text1.concat(text2);
    }

    public int index(String text, char i) {
        return text.indexOf(i);
    }

    public boolean equality(String text1, String text2) {
        return text1.equals(text2);
    }

    public String spaces(String text1) {
        return text1.trim().toLowerCase();
    }

    public String extraction(String string, char startSymbol, char endSymbol) {
        return string != null ? string.substring(string.indexOf(startSymbol), string.indexOf(endSymbol)) : null;
    }

    public String smiles(String text1) {
        return text1.replace(":(", ":)");
    }

    public boolean checkText (String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    public int amountVowels (String text) {
        char[] vowels = new char[] {'a', 'e', 'i', 'u', 'y', 'o', 'A', 'E', 'I', 'U', 'Y', 'O'};
        int vowelsNumber = 0;
        for (char vowel : vowels) {
            for(char lit : text.toCharArray()) {
                if(vowel == lit) {
                    vowelsNumber++;
                }
            }
        }
        return vowelsNumber;
    }

    public int amountPunctuation (String text) {
        char[] punctuations = new char[] {',' , '.' , ':', ';', '!', '?', '-'};
        int punctNumber = 0;
        for (char punct : punctuations) {
            for (char lit : text.toCharArray()) {
                if (punct == lit) {
                    punctNumber++;
                }
            }
        }
        return punctNumber;
    }

    public boolean palindrome(String text) {
        text = text.replaceAll("[.,!?;:'\\\" ]", "").toLowerCase();
        String textReverse = new StringBuffer(text).reverse().toString();
        return text.equals(textReverse);
    }

    public String[] splitString(String text, int n) {
        return text.split("(?<=\\G.{" + n + "})");
    }

    public int wordsCount(String text) {
        int count = 0;
        String[] words = text.trim().split(" ");
        for (String word : words) {
            if (word != " ") {
                count++;
            }
        }
        return count;
    }

    public String initials(String text) {
        String[] nameSurname = text.toUpperCase().split(" ");
         return nameSurname[0].charAt(0) + "" + nameSurname[1].charAt(0);
    }

    public String numbersFromText(String text) {
        String allNumber = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                allNumber += text.charAt(i);
            }
        }
        return allNumber;
    }
}
