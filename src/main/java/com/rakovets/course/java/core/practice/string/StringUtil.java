package com.rakovets.course.java.core.practice.string;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
    public String glueString(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        return str1.concat(str2);
    }

    public int findIndexSymbol(char symbol, String workString) {
        if (workString == null) {
            return -1;
        }
        return workString.indexOf(symbol);
    }

    public boolean equalsString(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    public String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public String toLowerCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public String extract(int startSymbol, int finishSymbol, String workString) {
        if (workString == null || startSymbol < 1 || finishSymbol < 1 ||
                finishSymbol > workString.length() + 1 || startSymbol > workString.length() + 1) {
            return null;
        }
        if (startSymbol > finishSymbol) {
            int temp = startSymbol;
            startSymbol = finishSymbol;
            finishSymbol = temp;
        }
        return workString.substring(startSymbol - 1, finishSymbol - 1);
    }

    public String replaceSmile(String stringForEdit) {
        if (stringForEdit == null) {
            return null;
        }
        return stringForEdit.replace(":(", ":)");
    }

    public boolean startAndEnd(String text, String word) {
        boolean result = false;
        if (text == null || word == null) {
            return false;
        }
        if (text.startsWith(word) && text.endsWith(word)) {
            result = true;
        }
        return result;
    }

    public int findCountEnglishLetters(String text) {
        if (text == null) {
            return -1;
        }
        Pattern pattern = Pattern.compile("[eyuioaEYUIOA]");
        Matcher matcher = pattern.matcher(text);
        return (int) matcher.results().count();
    }

    public int findCountPunctuationSymbol(String text) {
        if (text == null) {
            return -1;
        }
        Pattern pattern = Pattern.compile("[,.!?]");
        Matcher matcher = pattern.matcher(text);
        return (int) matcher.results().count();
    }

    public boolean isPalindrome(String text) {
        boolean answer = false;
        if (text == null) {
            return false;
        }
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder(text.toLowerCase().replaceAll("[ .!?,-]", ""));
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(text.toLowerCase().replaceAll("[ .!?,-]", ""))) {
            answer = true;
        }
        return answer;
    }

    public ArrayList<String> splitString(String text, int n) {
        if (text == null || n == 0) {
            return null;
        }
        var list = new ArrayList<String>();
        for(int i = 0; i < text.length(); i += n)
        {
            if(i + n <= text.length()) {
                list.add(text.substring(i, i + n));
            } else {
                list.add(text.substring(i));
            }
        }
        return list;
    }

    public int findCountSpace(String text) {
        int countWord;
        if (text == null) {
            return -1;
        }
        text = text.trim();
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        Pattern pattern = Pattern.compile(" .");
        Matcher matcher = pattern.matcher(text);
        if (text.equals("")) {
            countWord = 0;
        } else {
            countWord = (int) matcher.results().count() + 1;
        }
        return countWord;
    }

    public String getInitial(String nameAndSurname) {
        if (nameAndSurname == null) {
            return null;
        }
        nameAndSurname = nameAndSurname.trim();
        String[] strings;
        while (nameAndSurname.contains("  ")) {
            nameAndSurname = nameAndSurname.replace("  ", " ");
        }
        if (!nameAndSurname.contains(" ")) {
            return null;
        }
        strings = nameAndSurname.split(" ", 2);
        return strings[0].toUpperCase().charAt(0) + "" + strings[1].toUpperCase().charAt(0);
    }

    public String getAllDigits(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("[^\\d]", "");
    }


    public String getIndividualSymbol(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return null;
        }
        StringBuilder individualSymbol = new StringBuilder();
        getRepeatSymbol(str1, str2, individualSymbol);
        getRepeatSymbol(str2, str1, individualSymbol);

        return individualSymbol.toString();
    }

    private void getRepeatSymbol(String str1, String str2, StringBuilder individualSymbol) {
        char symbol;
        int amountSymbol = 1;
        for (int i = 0; i < str1.length(); i++) {
            symbol = str1.charAt(i);
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(j) == symbol) {
                    amountSymbol++;
                }
            }
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == symbol) {
                    amountSymbol--;
                }
            }
            if (amountSymbol > 0 && !individualSymbol.toString().contains(symbol + "")) {
                individualSymbol.append(symbol);
            }
            amountSymbol = 1;
        }
    }

    public boolean equalsArrayString(String[] str1, String[] str2) {
        boolean answerEquals = true;
        if (str1 == null || str2 == null || str1.length > str2.length || str2.length > str1.length) {
            return false;
        }
        int flagBreak = 0;
        for (String s : str1) {
            for (String value : str2) {
                if (s.equals(value)) {
                    flagBreak = 1;
                    break;
                }
            }
            if (flagBreak == 0) {
                answerEquals = false;
                break;
            }
            flagBreak = 0;
        }
        return answerEquals;
    }

    public long additionTimeString(int amount) {
        if (amount < 0) {
            return -1;
        }
        long timeString, timeStringBuilder;
        String string = "";
        StringBuilder stringBuilder = new StringBuilder();

        timeString = System.currentTimeMillis();
        for (int i = 0; i < amount; i++) {
            string += "TEXT";
        }
        timeStringBuilder = System.currentTimeMillis();
        timeString -= timeStringBuilder;
        stringBuilder.append("text".repeat(amount));
        timeStringBuilder -= System.currentTimeMillis();

        return Math.abs(timeString) - Math.abs(timeStringBuilder) ;
    }

    public String replaceSerialSymbol(String text) {
        if (text == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char symbolGroup;
        Pattern pattern = Pattern.compile("(.)\\1+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            symbolGroup =  matcher.group().charAt(0);
            matcher.appendReplacement(stringBuilder, symbolGroup + "");
        }
        return stringBuilder.toString();
    }

    public int transformRomeNumberInArabic(String romeNumber) {
        if (romeNumber == null) {
            return -1;
        }
        var list = new ArrayList<Integer>();
        for (int i = 0; i < romeNumber.length(); i++) {
            switch (romeNumber.charAt(i)) {
                case 'M':
                    list.add(1000);
                    break;
                case 'D':
                    list.add(500);
                    break;
                case 'C':
                    list.add(100);
                    break;
                case 'L':
                    list.add(50);
                    break;
                case 'X':
                    list.add(10);
                    break;
                case 'V':
                    list.add(5);
                    break;
                case 'I':
                    list.add(1);
                    break;
                default:
                    return -1;
            }
            if (i != 0) {
                int numberPreviousIteration = list.get(i - 1);
                int numberCurrentIteration = list.get(i);
                if (numberPreviousIteration < numberCurrentIteration) {
                    list.set(i - 1, -numberPreviousIteration);
                }
            }
        }
        int sum = 0;
        for (var iterator : list) {
            sum += iterator;
        }
        return sum;
    }
}
