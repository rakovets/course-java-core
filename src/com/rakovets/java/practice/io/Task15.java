package com.rakovets.java.practice.io;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task15 {
    public static void main(String[] args) throws IOException {
        File f = new File("Fold15.txt");

        final int length = (int) f.length();

        if (length != 0) {

            char[] cbuf = new char[length];

            InputStreamReader isr = new InputStreamReader(new FileInputStream(f), "CP1251");

            final int read = isr.read(cbuf);

            String str = new String(cbuf, 0, read);
            str = str.trim();

            str = str.toLowerCase();
            str = str.replaceAll("\\W", " ");

            Map<String, Integer> map = new HashMap<>();
            for (String s : str.split(" ")) {
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }
            map.remove("");
            System.out.println("\n" + map);
        }
    }
}
