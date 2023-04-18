package com.rakovets.course.java.core.practice.strings;


public class StringUtil {
    //Task01
    public String getConcatinatedString (String firstInputString, String secondInputString) {
        return firstInputString.concat(secondInputString);
    }
    //Task02
    public int getIndexOfSymbol(String inputString, String inputChar) {
        return inputString.indexOf(inputChar);
    }
    //Task03
    public boolean isEquals (String firstInputString, String secondInputString) {
        return firstInputString.equals(secondInputString);
    }
    //Task04
    public String getTrimmedStringInUpperCase (String inputString) {
        return inputString.trim().toUpperCase();
    }
    //Task05
    public String getSubstringInSymbolRange (String inputString, String beginSymbol, String endSymbol) {
        return inputString.substring(inputString.indexOf(beginSymbol), inputString.indexOf(endSymbol));
    }
    //Task06
    public String getInvertedEmoji (String inputString) {
        return inputString.replace(')','(');
    }
    //Task07
    public boolean isBeginning (String inputText, String inputWord) {
        return inputText.startsWith(inputWord);
    }
    //Task08
    public int getAmountOfVowels (String inputString) {
        return inputString.replaceAll("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ\\s+]","").length();
    }
    //Task09
    public int getAmountOfSymbols (String inputString) {
        return inputString.replaceAll("[[^.^,^!,^?]]","").length();
    }
    //Task10
    public boolean isPalindrome (String inputString) {
        String stringWithoutBackspaces = inputString.replaceAll("\\s+","");
        StringBuffer buffer = new StringBuffer(stringWithoutBackspaces);
        String reverseString = buffer.reverse().toString();
        return reverseString.equalsIgnoreCase(stringWithoutBackspaces);
    }
    //Task11
//    public  String[] getStringByParts (String inputString, int sizeOfParts) {
//        int massiveLength = (int)Math.ceil(inputString.length() / sizeOfParts);
//        String[] array = new String[massiveLength];
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[counter] = inputString.substring(counter,)
//            counter++;Y
//
//        }
//        return null;
//    }
}
