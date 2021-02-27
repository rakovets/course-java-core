package com.rakovets.course.java.core.practice.concurrency.common.censor;

import java.io.*;

public class Test {
    public static void removeNthLine(String f, int toRemove) throws IOException {

        File tmp = File.createTempFile("tmp", "");

        BufferedReader br = new BufferedReader(new FileReader(f));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tmp));

        for (int i = 0; i < toRemove; i++)
            bw.write(String.format("%s%n", br.readLine()));

        br.readLine();

        String l;
        while (null != (l = br.readLine()))
            bw.write(String.format("%s%n", l));

        br.close();
        bw.close();

        File oldFile = new File(f);
        if (oldFile.delete())
            tmp.renameTo(oldFile);

    }
}
