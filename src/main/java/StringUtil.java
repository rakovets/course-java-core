import java.util.Arrays;

public class StringUtil {

   // task-1
    public static String getStingConcat(String str1,String str2) {
        return str1.concat(str2);
    }

    // task-2
    public static int getIndexOf(String str, char x) {
       if(str != null && x!= str.indexOf(x)) {
           return str.indexOf(x);
       } else {
           return -1;
       }
    }

    // task-3
    public static boolean isEqualsString(String str1, String str2) {
        return str1.equals(str2);
    }

    //task-4
     public static String getTrimAndUpperCaseString (String str) {
        return str.trim().toUpperCase();
     }

    // task-5

    public static String getSubstring(String str) {
        if (str.length() >= 33) {
            return str.substring(10, 33);
        } else {
            return str.substring(10);
        }
    }

    // task-6

    public static String getReplace(String str) {
        return str.replace(":(", ":)");
    }

    // task-7

    public static boolean isFirstAndLastWorld(String string, String word) {
        string = string.toLowerCase();
        if(string != null) {
            return (string.startsWith(word) && string.endsWith(word));
        } else {
            return false;
        }
    }

    //task-8

    public static int getVowelsLetters(String str) {
        int vowels = 0;
        str = str.toLowerCase();
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y')
                vowels++;
        }
        return vowels;
    }

    // task-9

    public static int getPunctuationMarks(String str) {
        int punctuationMarks = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!')
                punctuationMarks++;
        }
        return punctuationMarks;
    }

    //task-10

    public static boolean isPalindrom(String str) {
        str = str.toLowerCase();
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

    //task-11
    public static String getSplitString (String str, int n) {
    int splitPoint;
    if(str != null && str.length() % n == 0) {
        splitPoint = str.length() / n;
        String s = Arrays.toString(str.split("(?<=\\G.{" + splitPoint + "})"));
        return s;
    } else {
        splitPoint = (str.length() + 1 )/ n;
        String s = Arrays.toString(str.split("(?<=\\G.{" + splitPoint + "})"));
        return s;
    }
    }

    //task-12

    public static int getCountWord(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }

    //task-13

    public static String getInitials(String surname, String name, String patronymic) {
        surname = surname.toUpperCase();
        name = name.toUpperCase();
        patronymic = patronymic.toUpperCase();
        char surnameInitial = surname.charAt(0);
        char nameInitial = name.charAt(0);
        char patronymicInitial = patronymic.charAt(0);
        return surnameInitial + "." + nameInitial + "." + patronymicInitial + ".";
    }

    //task-14

    public static String getNumeral(String str) {
        return str.replaceAll("[^0-9]", "");
    }

    //task-18

    public static String getReplacedIdenticalCharacters(String str) {
        return str.replaceAll("(.)\\1+", "$1");
    }

}
