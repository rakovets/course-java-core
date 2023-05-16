package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    //Task01
    public String getConcatStr (String firstStr, String secondStr) {
        return firstStr.concat(secondStr);
    }
    //Task02
    public int getIndexOfChar(String firstStr, char c) {
        return firstStr.indexOf(c);
    }
    //Task03
    public boolean getEqualsString(String firstStr, String secondStr, boolean expected) {
        return firstStr.equals(secondStr);
    }
    //Task04
    public String getTrimToUpperCase(String firstStr, String expected) {
        return firstStr.trim().toUpperCase();
    }
    //Task06
    public String getRepalceEmoji(String firstStr, String expected) {
        return firstStr.replace(":(", ":)");
    }
    //Task07
    public boolean getFindWord(String text, String word, boolean expected) {
        return text.startsWith("text") && word.endsWith("word");
    }
    //Task08
    public int getPunctuation(String firstStr, int expected) {
        int dot = 0;
        int comma = 0;
        int question = 0;
        int exclamation = 0;
        int total = 0;

        for (int i = 0; i < firstStr.length(); i++) {
            switch (firstStr.charAt(i)) {
                case '.':
                    dot++;
                    break;
                case ',':
                    comma++;
                    break;
                case '?':
                    question++;
                    break;
                case '!':
                    exclamation++;
                    break;
            }
            total = dot + comma + question + exclamation;
        }
        return total;
    }
}
