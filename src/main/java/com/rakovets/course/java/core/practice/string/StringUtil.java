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

        return text.toLowerCase().replaceAll("[\\pP\\s]","").equals(new StringBuilder(text.toLowerCase().replaceAll("[\\pP\\s]","")).reverse().toString());
    }

    public String[] splitText(String  text, int numberSymbols) {
        String[] splitText;
        int j = 0;
        if(text.length() % numberSymbols != 0){
            splitText = new String[text.length()/numberSymbols+1];
        } else{
            splitText = new String[text.length()/numberSymbols];
        }

        for(int i = 0; i < text.length() ; i += numberSymbols){
            if(text.length()-i < numberSymbols) {
                splitText[j] = text.substring(i);
            } else {
                splitText[j] = text.substring(i, i + numberSymbols);
            }
            j++;
        }

        return splitText;
    }

    public int numberOfWords(String text) {
        int countWords=0;
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            countWords++;
        }

        return  countWords;
    }

    public String getFirstLetters(String firstLastName) {
        String firstLetters = "";
        String[] container = firstLastName.split("\\s*(\\s)\\s*");
        for(int i = 0; i < container.length; i ++) {
            firstLetters += container[i].toUpperCase().charAt(0);
        }

        return  firstLetters;
    }

    public String getAllNumbers(String text){
        String allNumbers = "";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            allNumbers += matcher.group();
        }

        return allNumbers;
    }

    public String getUniqueSymbols(String firsWord, String secondWord) {
        String result = "";
        char[] firstWordChars = firsWord.toCharArray();
        char[] secondWordChars = secondWord.toCharArray();

        for (char firstWordChar : firstWordChars){
            int count = 0;
            for (int i = 0; i < secondWordChars.length; i++){
                if(firstWordChar == secondWordChars[i]){
                    count ++;
                    secondWordChars[i] = ' ';
                    break;
                }
            }
            if(count == 0){
                result += firstWordChar;
            }
        }
        for(int i = 0; i < secondWordChars.length; i ++ ) {
            if (secondWordChars[i] != ' ') {
                result += secondWordChars[i];
            }
        }
        return  result;
    }



}


