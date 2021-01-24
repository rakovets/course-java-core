import java.util.Arrays;

public class StringUtil {
    //Task 1
    public static String main(String[] args) {
        String str1 = "Hello";
        String str2 = " Java";
        return str1.concat(str2);
    }

    //Task 2
    public static int indexOf(String str, char x) {
        return str.indexOf(x);
    }

    //Task 3
    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    //Task 4
    public static String trimAndToUpperCase(String str) {
        return str.trim().toUpperCase();
    }

    //Task 5
    public static String substring(String str) {
        if (str.length() >= 33) {
            return str.substring(10, 33);
        } else {
            return str.substring(10);
        }

    }

    //Task 6
    public static String replace(String str) {
        return str.replace(":(", ":)");
    }

    //Task 7
    public static boolean startsWithAndEndsWith(String str, String word) {
        return str.startsWith(word) && str.endsWith(word);
    }

    //Task 8
    public static int vowels(String str) {
        int vowels = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y')
                vowels++;
        }
        return vowels;
    }

    //Task 9
    public static int punctuation(String str) {
        int punctuation = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '!')
                punctuation++;
        }
        return punctuation;
    }

    //Task 10
    public static boolean palindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }

   //Task 12
    public static int numbersOfWords(String str) {
        String[] word=str.split("\\s+");
        return word.length;
    }

}





