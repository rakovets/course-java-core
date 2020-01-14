package com.rakovets.java.practice.io;

import java.io.*;

public class Task12 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Fold12");
        BufferedReader br = new BufferedReader(fr);
        String s;
        FileWriter fw = new FileWriter("Fold_12_revers");
        BufferedWriter bw = new BufferedWriter(fw);
        while ((s = br.readLine()) != null) {
            for (int i = s.length() - 1; i >= 0; i--)
                bw.write(s.charAt(i));
            bw.write("\r\n");
        }
        fr.close();
        bw.close();
    }
}

