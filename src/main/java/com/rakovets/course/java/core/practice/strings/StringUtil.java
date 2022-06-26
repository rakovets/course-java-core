package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    public String concat(String str1, String str2) {
        return str1.concat(str2);
    }

    public int findSymbolIndex(String s, String symbol) {
        return s.indexOf(symbol);
    }

    public boolean isEquals(String str1, String str2) {
        boolean result = false;
        if (str1.equals(str2)) {
            result = true;
        }
        return result;
    }

    public String trim(String s) {
        return s.trim().toLowerCase();
    }

    public String subString(String s, String symbol1, String symbol2) {
        int symbolIndex1 = findSymbolIndex(s, symbol1);
        int symbolIndex2 = findSymbolIndex(s, symbol2);
        return s.substring(symbolIndex1, symbolIndex2);
    }

    public String replace(String s) {
        return s.replace(":(", ":)");
    }

    public boolean startWith(String text, String word) {
        boolean result = false;
        if (text.startsWith(word)) {
            result = true;
        }
        return result;
    }

    public int vovelsCount(String s) {
        s = s.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < s.length(); ++i) {
            switch(s.charAt(i)) {
                case 'a':
                    vowelCount++;
                    break;
                case 'e':
                    vowelCount++;
                    break;
                case 'i':
                    vowelCount++;
                    break;
                case 'o':
                    vowelCount++;
                    break;
                case 'u':
                    vowelCount++;
                    break;
                default:
                    break;
            }
        }
        return vowelCount;
    }

    public int charsCount(String s) {
        char[]c={'.',',','?','!'};
        int count = 0;
        for(int i=0;i<s.length();i++){
            for (char value : c) {
                if (s.charAt(i) == value) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
