package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("Fold7.txt.txt");
        int i;
        String text = "";
        while ((i = fi.read()) != -1) {
            text += (char) i;
        }
        System.out.println(fi);
        fi.close();

        Set<String> arayLinkedLiters = new HashSet<>();
        List<String> arayLinkedText = new ArrayList<>();


        Pattern pattern = Pattern.compile("([a-z])");
        Matcher matcher = pattern.matcher(text.toLowerCase());


        while (matcher.find()) {
            arayLinkedLiters.add(matcher.group());
            arayLinkedText.add(matcher.group());
        }
    }
}
