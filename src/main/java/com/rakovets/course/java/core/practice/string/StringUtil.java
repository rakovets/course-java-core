package com.rakovets.course.java.core.practice.string;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class StringUtil {

        // TASK_1: вывести строку, которая является результатом склеивания двух строк.
         public static String getConcatResult(String str1, String str2) {
             if (str1 != null && str2 != null) {
                 return str1.concat(str2);
             } else {
                 return null;
             }
         }

         // TASK_2: Найти индекс символа x
         public static int getIndex(String str1, char x) {
             if (str1 != null && x != 0) {
                 return str1.indexOf(x);
             } else {
                 return -1;
             }
         }

        //TASK_3: Определить, являются ли две строки одинаковыми учитывая регистр. Если хотя бы одна из них пустая - возвращать false
        public static boolean isSame(String str1, String str2) {
            if (str1 != null && str2 != null) {
                return str1.equals(str2);
            } else {
                return false;
            }
        }

    //TASK_4: В строке удалить пробелы в начале и конце. Сделать что бы вся строка состояла из прописных букв. При null, вернуть null
        public static String cutSpacesLowerCase (String str1) {
            if (str1 != null) {
                return str1.trim().toUpperCase(Locale.ROOT);
            } else {
                return null;
            }
        }

    // TASK_5: Из строки извлечь подстроку начиная с 10 символа. Новая строка должна быть не более 23 символов.
        public static String getTenIndex(String str) {
            if (str != null) {
                if (str.length() > 9) {
                    if (str.length() >= 33) {
                        return str.substring(9, 32);
                    } else {
                        return str.substring(9);
                    }
                }
            } return null;
        }

    // TASK_6: Заменить все грустные *emoji* `:(` в строке на весёлые `:)`.
    public static String getReplace(String str) {
             if (str != null) {
                 return str.replace(":(", ":)");
             } else {
                 return null;
             }
    }

    //TASK_7:Написать метод принимающий 2 параметра(String, word), возвращающий true, если строка начинается и заканчивается этим словом, иначе false
    public static boolean isWordStartAndLast(String str1, String word) {
             if (str1 != null && word != null) {
                 str1 = str1.toLowerCase(Locale.ROOT);
                 return str1.startsWith(word) && str1.endsWith(word);
             } else {
                 return  false;
             }
    }

    //TASK_8: Определить, сколько гласных букв в предложении.
    public static int getVowels(String str1) {
        if (str1 != null) {
            str1 = str1.toLowerCase(Locale.ROOT);
            char[] vowelsArray = new char[]{'a', 'e', 'i', 'o', 'u', 'y'};
            int counter = 0;
            char[] arrayStr1 = str1.toCharArray();

            for (char vowStr : arrayStr1) {
                for (char vowArr : vowelsArray) {
                    if (vowStr == vowArr) {
                        counter++;

                    }
                }
            }  return counter;
        } return -1;
    }

    //TASK_9: Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
    public static int getNumberOfDotsCommasExclamationMarks(String str1) {
             if (str1 != null) {
                 char[] specSymbArray = new char[]{'.', ',', '!'};
                 int counter = 0;
                 char[] arrayStr1 = str1.toCharArray();

                 for (char specStr : arrayStr1) {
                    for (char vowArr : specSymbArray) {
                      if (specStr == vowArr) {
                         counter++;
                             }
             }
          }  return counter;
        } return -1;
      }

      //TASK_10: Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
    public static boolean isPalindrome(String str1) {
        if (str1 != null) {
            Pattern specSymbols = Pattern.compile("\\s*(\\s|,|\\?|!|\\.|:|;)\\s*");
            Matcher matcher = specSymbols.matcher(str1);
            String str1Cleaned = matcher.replaceAll("");
            StringBuilder buffer = new StringBuilder(str1Cleaned);
            buffer = buffer.reverse();
            String revBuff = buffer.toString();
            return revBuff.equalsIgnoreCase(str1Cleaned);
        } else {
            return false;
        }
    }

    //TASK_11: Разбить строку на равные части по n символов и сохранить отдельные части в массив. Вывести этот массив.
    public static String[] partsToArray(String str1, int n) {
        if (str1 != null && n > 0) {

            StringBuilder str1ToParts = new StringBuilder(str1);

            for (int i = n; i < str1ToParts.length();) {
                str1ToParts.insert(i, "##");
                i += n + 2;
            }
            return str1ToParts.toString().split("##");
        }
        return null;
    }

    //TASK_12: Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
    public static int wordsCount(String str1) {
        if (str1 != null && str1.length() > 0) {
            String[] words = str1.split("\\s+");
            return words.length;
        } return -1;
    }

    //TASK_13: Дано имя, фамилия и отчество. Вернуть инициалы в формате Ф.И.О.
    // Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.
    public static String getInitials(String str1) {
        if (str1 != null && str1.length() > 0) {
            String[] array = str1.split(" ", 3);
               return (array[1].charAt(0) + " " + array[0].charAt(0) + " " + array[2].charAt(0)).toUpperCase(Locale.ROOT);

        } return null;
    }

    //TASK_14: Вернуть строку, которая содержит все имеющиеся в тексте цифры.
    public static String getDigits(String str1) {
             if (str1 != null && str1.length() > 0) {
                 return str1.replaceAll("[^0-9]", "");
             } return null;
    }

    //TASK_16: Заданы два массива строк. Определить, является ли содержимое этих массивов идентичным. Порядок расположения элементов значения не имеет.
    public static boolean matchStringArrays(String[] str1, String[] str2) {
             if (str1 != null && str2 != null) {
                 Arrays.sort(str1);
                 Arrays.sort(str2);

                 return Arrays.equals(str1, str2);

             } return false;
    }

    //Task_17: Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и `String`,
    // второй с помощью `StringBuilder` и метода `append`. Сравнить скорость их выполнения.
    public static String compareResults(String str1, int n) {
             if (str1 != null) {
                 String concat = str1;

                 StringBuilder concatBuilder = new StringBuilder(str1);
                 long startTime = System.nanoTime();

                 for (int i = 0; i < n; i++) {
                        concat += str1;
                 }

                 long concatinationSpeed = System.nanoTime() - startTime;

                 for (int j = 0; j < n; j++) {
                     concatBuilder.append(str1);
                 }
                 long stringBuilderSpeed = System.nanoTime() - concatinationSpeed -  startTime;

                 return "Iterations " + n + "\nConcatination speed: " + concatinationSpeed + "\nString Builder speed: " + stringBuilderSpeed;
             }
             return null;
    }
}

