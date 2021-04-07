package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    public String glue(String str1, String str2) {
        return str1.concat(str2);
    }

    public  int  findIndexOfSymbol(char ch, String str) {
        return str.indexOf(ch);
    }

    public boolean compareLines(String str1, String str2) {
        return str1.equals(str2);
    }

    public String cutAndLowerCase(String str) {
        return (str.trim()).toLowerCase();
    }

    public String pieceExtraction(String str, int indexBegin, int indexEnd ) {
        String result;
        char[] container = new char[indexEnd - indexBegin];
        str.getChars(indexBegin, indexEnd, container, 0);
        result = new String(container);

        return result;
    }

    public String replaceEmoji(String str1, String str2, String str3){
        return  str1.replace(str2,str3);
    }

    public boolean correctBegin( String text, String word){
        return text.startsWith(word) && text.endsWith(word) ;
    }

    public int numberOfEnglishVowelLetters(String text) {
        int countVowel=0;
        Pattern pattern = Pattern.compile("[aAeEiIoOuU]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            countVowel++;
        }

        return countVowel;
    }

    public int numberOfPunktuationMarks(String text) {
        int countOfPunctuationMarks=0;
        Pattern pattern = Pattern.compile("[.,!?]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            countOfPunctuationMarks++;
        }

        return countOfPunctuationMarks;
    }

    public boolean palindromChekOut(String text) {

        return text.toLowerCase().replace(" ","").equals(new StringBuilder(text.toLowerCase().replace(" ","")).reverse().toString());
    }

    public String[] splitText (String  text, int numberSymbols) {
        String[] splitText = new String[text.length()/numberSymbols+1];
        int i = 0;
        int beginSplit = 0;
        for(int k = numberSymbols; k <= text.length(); k += numberSymbols){
            char[] containerChars = new char[numberSymbols];
            text.getChars(beginSplit, k , containerChars, 0);
            String container = new String(containerChars);
            splitText[i] = container;
            i++;
            beginSplit +=numberSymbols;
        }

        return splitText;

    }




}


