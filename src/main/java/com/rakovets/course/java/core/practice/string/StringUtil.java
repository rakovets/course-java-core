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

    public int numberOfEnglishVowelLetters(String text){
        int countVowel=0;
        Pattern pattern = Pattern.compile("[aeiou]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            countVowel++;
        }

        return countVowel;
    }




}


