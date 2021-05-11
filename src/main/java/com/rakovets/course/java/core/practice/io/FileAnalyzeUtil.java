package com.rakovets.course.java.core.practice.io;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileAnalyzeUtil {
    public static List<String> getListOfFileStrings(String filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException ex) {
            System.out.println("There is a problem with reading strings");
        }
        return list;
    }

    public static List<String> getWordsStartingWithVowels(String filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str = "";
            int c;
            while ((c = reader.read()) != -1) {
                str += (char) c;
            }
            Pattern pattern = Pattern.compile("\\b[AaOoIiUuYyEe](\\w*)");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                list.add(matcher.group());
            }
        } catch (IOException ex) {
            System.out.println("There is a problem with highlighting words that begin with vowels");
        }
        return list;
    }

    public static List<String> getListOfWordsLastLitterSameWithFirstLitterNextWord(String filePath) {
        List<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str = "";
            int c;
            while ((c = reader.read()) != -1) {
                str += (char) c;
            }

            Pattern pattern1 = Pattern.compile("[,.!?-]");
            Matcher matcher1 = pattern1.matcher(str);
            String str1 = matcher1.replaceAll("");

            Pattern pattern2 = Pattern.compile("\\s+");
            Matcher matcher2 = pattern2.matcher(str1);
            String str2 = matcher2.replaceAll(" ").trim();
            String str3 = str2.toLowerCase();

            char[] bufWithCase = str2.toCharArray();
            char[] bufWithoutCase = str3.toCharArray();

            for (int i = 1, j = 0; i <= bufWithoutCase.length - 2; i++) {
                if (bufWithoutCase[i] == ' ') {
                    if (bufWithoutCase[i - 1] == bufWithoutCase[i + 1]) {
                        String word = "";
                        for (; j < i; j++) {
                            word += (char) bufWithCase[j];
                        }
                        list.add(word);
                    }
                    j = i + 1;
                }
            }
        } catch (IOException ex) {
            System.out.println("There is a problem with highlighting words that begin with vowels");
        }
        return list;
    }

    public static List<String> getListWithSequenceOfNumbers (String filePath) {
        List<String> list = new ArrayList<>();
        List<int[]> listWithSequence = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int i;
            String str = "";
            while ((i = reader.read()) != -1) {
                str += (char) i;
            }

            String str2 = str.trim();
            Pattern pattern = Pattern.compile("[ ]+");
            Matcher matcher = pattern.matcher(str2);
            String str3 = matcher.replaceAll(" ");

            Pattern pattern1 = Pattern.compile("(\\s*)\n(\\s*)");
            Matcher matcher1 = pattern1.matcher(str3);
            String str4 = matcher1.replaceAll("\n");

            String[] arrayStrings = str4.split("\n");
            for (String item : arrayStrings) {
                String[] sequence = item.split(" ");
                int[] number = new int[sequence.length];
                for (int j = 0; j < sequence.length; j++) {
                    number[j] = Integer.parseInt(sequence[j]);
                }
                listWithSequence.add(number);
            }

            listWithSequence.stream().forEach(x -> {
                int[] array = x;
                String maxSequence = "";
                String sequence = "";
                int maxNumberOfMembers = 0;
                int numberOfMembersInSequence = 0;

                sequence = array[0] + "";
                numberOfMembersInSequence = 1;
                for (int j = 1; j < x.length; j++) {
                    if (array[j] > array[j - 1]) {
                        numberOfMembersInSequence++;
                        sequence += " " + array[j];
                    } else {
                        if (numberOfMembersInSequence > maxNumberOfMembers) {
                            maxSequence = sequence;
                            maxNumberOfMembers = numberOfMembersInSequence;
                            sequence = "" + array[j];
                            numberOfMembersInSequence = 1;
                        } else {
                            sequence = "" + array[j];
                            numberOfMembersInSequence = 1;
                        }
                    }
                    if (numberOfMembersInSequence > maxNumberOfMembers) {
                        maxSequence = sequence;
                    }
                }
                list.add(maxSequence);
            });
        } catch (IOException ex) {
            System.out.println("There is problem with a sequence of numbers");
        }
        return list;
    }

    public static Map<String, Integer> getFrequencyOfUsingLitters(String filePath) {
        Map<String, Integer> map = new HashMap<>();
        String text = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                text += s;
            }

            Pattern pattern = Pattern.compile("\\W");
            Matcher matcher = pattern.matcher(text);
            String test1 = matcher.replaceAll("");
            String text2 = test1.toLowerCase();
            char[] array = text2.toCharArray();

            String[] arrayString = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayString[i] = array[i] + "";
            }

            Arrays.stream(arrayString).forEach(x -> {
                if (!map.containsKey(x)) {
                    map.put(x, 1);
                } else {
                    map.put(x, map.get(x) + 1);
                }
            });
        } catch (IOException ex) {
            System.out.println("There is a problem with a frequency determination of using litters in the text:");
        }
        return map;
    }

    public static Map<String, Integer> getFrequencyOfUsingWords(String filePath) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapSorted = new LinkedHashMap<>();
        String text = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int s;
            while ((s = reader.read()) != -1) {
                text += (char) s;
            }

            String str1 = text.replaceAll("\\s+", " ");
            String str2 = str1.replaceAll("[^\\w\\s]", "");
            String str3 = str2.trim().toLowerCase();
            String[] arrayString = str3.split(" ");

            Arrays.stream(arrayString).forEach(x -> {
                if (!map.containsKey(x)) {
                    map.put(x, 1);
                } else {
                    map.put(x, map.get(x) + 1);
                }
            });

            map.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEach(x -> mapSorted.put(x.getKey(), x.getValue()));

        } catch (IOException ex) {
            System.out.println("There is a problem with a frequency determination of using words in the text:");
        }
        return mapSorted;
    }

    public static void sortNumbers (String filePathToRead, String filePathTOWrite) {
        List<Integer> list = new ArrayList<>();
        List<String> sortList = new ArrayList<>();
        String str = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePathToRead));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filePathTOWrite))) {
            String s;
            while ((s = reader.readLine()) != null) {
                str += s;
            }

            String[] array = str.replaceAll("[^0-9-\\s]","").replaceAll("\\s+"," ").trim().split(" ");

            Arrays.stream(array).forEach(x -> list.add(Integer.parseInt(x)));
            list.stream().sorted().forEach(x -> sortList.add(x.toString() + " "));
            writer.write(sortList.toString());
        } catch (IOException ex) {
            System.out.println("These is a problem with writing or reading numbers from a file:");
        } finally {
            System.out.println("The method performed writing a sorted list of numbers to a file");
        }
    }

    public static List<String> getStudentProgress (String filePath) {
        List<String> progress = new ArrayList<>();
        Map<Integer, String> name = new HashMap<>();
        Map<Integer, Double> studentProgress = new HashMap<>();
        String studentMarks = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String s;
            while ((s = reader.readLine()) != null) {
                studentMarks += s;
            }
            String names = studentMarks;

            Pattern pattern = Pattern.compile("[A-Za-z]+");
            Matcher matcher = pattern.matcher(names);
            Integer j = 0;
            while (matcher.find()) {
                name.put(j, matcher.group());
                j++;
            }

            String newString = studentMarks.replaceAll("[A-Za-z]+\\s+", "N").replaceAll("[^0-9\\sN]", "");
            String[] arrayMarks = newString.join("","G", newString).replaceAll("GN", "").trim().split("N");
            Integer k = 0;
            for (String item : arrayMarks) {
                String[] array = item.trim().split(" ");
                Integer[] arrayInt = new Integer[array.length];
                for (int i = 0; i < array.length; i++) {
                    arrayInt[i] = Integer.parseInt(array[i].replaceAll("N", "").trim());
                }
                Integer sum = 0;
                for (Integer mark : arrayInt) {
                    sum += mark;
                }
                Double averageMarks = BigDecimal.valueOf(sum * 1.0 / arrayInt.length).setScale(2,RoundingMode.HALF_UP).doubleValue();
                studentProgress.put(k, averageMarks);
                k++;
            }

            int numberOfStudent = arrayMarks.length;
            for (Integer w = 0; w < numberOfStudent; w++) {
                String str1 = "";
                str1 += name.get(w) + " - " + studentProgress.get(w);
                progress.add(str1);
            }

        } catch (IOException ex) {
            System.out.println("These is a problem with calculating student progress:");
        }
        return progress;
    }
}
