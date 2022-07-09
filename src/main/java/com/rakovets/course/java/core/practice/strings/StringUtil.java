package com.rakovets.course.java.core.practice.strings;

public class StringUtil {
    /* Task 1
       Using the methods of class ːString, output a string that is the result of gluing two rows together
    */
    public String concat(String string1, String string2) {
        return string1 + string2;
    }

    /* Task 2
       Find the index of the symbol x (x - the character entered by the user) in the string.
       If there is no such symbol, then -1.
    */
    public int indexOf(String string, char symbol) {
        return string.indexOf(symbol);
    }

    /* Task 3
       Determine whether two lines are the same given the case.
    */
    public boolean equals(String string1, String string2) {
        return string1.equals(string2);
    }

    /* Task 4
       Delete the spaces at the beginning and end of the line. Make the entire line consist of uppercase letters.
    */
    public String trimAndToUpperCase(String string) {
        return string.trim().toUpperCase();
    }

    /* Task 5
       Extract the substring from the string starting with the n-th character and up to the m-th character.
       WARNING: The symbol and the position of the symbol are different things.
     */
    public String substring(String string, char symbolBegin, char symbolEnd) {
        int positionBegin = string.indexOf(symbolBegin);
        int positionEnd = string.indexOf(symbolEnd) + 1;
        return string.substring(positionBegin, positionEnd);
    }

    /* Task 6
       Replace all sad *emoji* :( in line with happy :).
     */
    public String replace(String string, String sadEmoji, String happyEmoji) {
        return string.replace(sadEmoji, happyEmoji);
    }

    /* Task 7
       Write a method that accepts 2 text and word parameters, and returns:
       * true if the string starts and ends with this word
       * false in all others
     */
    public boolean startsWithAndEndsWith(String text, String word) {
        return text.startsWith(word) && text.endsWith(word);
    }

    /* Task 8
       Determine the number of English vowels in a sentence.
     */
    public int numberEnglishVowels(String string) {
        string = string.toLowerCase();
        int numberVowels = 0;
        for(char vowels : string.toCharArray()) {
            switch (vowels) {
                case 'a':
                    numberVowels++;
                    break;
                case 'e':
                    numberVowels++;
                    break;
                case 'i':
                    numberVowels++;
                    break;
                case 'o':
                    numberVowels++;
                    break;
                case 'u':
                    numberVowels++;
                    break;
            }
        } return numberVowels;
    }

    /* Task 9
       Count the total number of punctuation marks (dots, commas, question marks and exclamation points) in the line.
     */
    public int numberPunctuationMarks(String string) {
        int numberPunctuation = 0;
        for(char punctuation : string.toCharArray()) {
            switch (punctuation) {
                case '.':
                    numberPunctuation++;
                    break;
                case ',':
                    numberPunctuation++;
                    break;
                case '?':
                    numberPunctuation++;
                    break;
                case '!':
                    numberPunctuation++;
                    break;
                }
        } return numberPunctuation;
    }

    /* Task 10
       Check if the entered string is a palindrome.
       NOTE: A palindrome is a word, phrase or number that reads the same from left to right and from right to left.
       For example: deed, Do geese see God? , 1991.
     */
    public boolean checkPalindrome(String palindrome) {
        palindrome = palindrome.replaceAll("\\s+","");
        return palindrome.equalsIgnoreCase(new StringBuffer(palindrome).reverse().toString());
    }

    /* Task 11
       Split a string into equal parts by n characters and save individual parts in an array.
     */
    public String[] stringSplitIntoEqualPats(String string, int n) {
        return string.split("(?<=\\G.{" + n + "})");
    }

    /* Task 12
       Calculate the number of words in the text. Note that words can be separated by several spaces.
     */
    public int theNumberOfWordsInTheText(String string, int words) {
        if (string == null || string.isEmpty() || string.trim().isEmpty())
            return words = 0;
        else return words = string.trim().split(" +").length;
    }

    /* Task 13
       The name is given as a single string.
       Return the initials according to the FL pattern, for example: DmitRY RakOVets -> DR.
       Note that the input parameters can be in any case, and the resulting line must be in the top.
     */
    public String nameInitialsTheUpperCase(String  stringFirstNameSurnameName) {
        String[] stringInitials = stringFirstNameSurnameName.trim().toUpperCase().split(" +");
        return stringInitials[0].charAt(0) + stringInitials[1].substring(0, 1);
    }

    /* Task 14
       Return a string that contains all the numbers in the text.
     */
    public String stringAllTheNumbersInTheText(String string) {
        return string.trim().replaceAll("\\D+","");
    }
}
