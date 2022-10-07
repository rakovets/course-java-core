package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String gluingText(String text1, String text2) {
        return text1.concat(text2);
    }

    public int indexSymbol(String text, char symbol) {
        return text.indexOf(symbol);
    }

    public boolean identicalString(String str1, String str2) {
        return str1.equals(str2);
    }

    public String formattedString(String text) {
        return text.trim().toLowerCase();
    }

    public String substring(String text, char startySymbol, char endSymbol) {
        return text.substring(startySymbol, endSymbol);
    }

    public String changeSmile(String smile) {

        return smile.replace(":(", ":)");
    }

    public boolean sameStartEnd(String text, String word) {

        return text.startsWith(word) && text.endsWith(word);
    }

    public int numberEnglishVowels(String text) {
        char[] vowels = {'e', 'y', 'u', 'i', 'o', 'a', 'E', 'Y', 'U', 'I', 'O', 'A'};
        int count = 0;
        for (char vowel : vowels) {
            for (char litter : text.toLowerCase().toCharArray()) {
                if (litter == vowel) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        return count;
    }

    public int numberPunctuation(String text) {
        String punctuation = ".,?!;:-()";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (punctuation.contains(String.valueOf(text.charAt(i)))) {
                count++;
            }
        }
        return count;
    }

    public boolean palindrome(String text) {
        return new StringBuffer(text).reverse().toString() == text;
    }

    public String[] brokenLine(String text, int numberSymbol) {
        return text.split("(?<=\\G.{" + numberSymbol + "})");
    }

    public int wordCount(String str) {
        int count = 0;
        String[] words = str.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i] != " ") {
                count++;
            }
        }
        return count;
    }

    public String writeInitials(String str) {
        String[] nameAndLastname = str.toUpperCase().split("\\s");
        return nameAndLastname[0].charAt(0) + "" + nameAndLastname[1].charAt(0);
    }

    public String returnNumber(String str) {
        String allNumber = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                allNumber += str.charAt(i);
            }
        }
        return allNumber;
    }
}
