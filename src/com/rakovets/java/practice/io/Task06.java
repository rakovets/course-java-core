package com.rakovets.java.practice.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("Fold6.txt");
        int i;
        String text = "";
        while ((i = fi.read()) != -1) {
            text += (char) i;
        }
        System.out.println(fi);
        fi.close();

        StringBuffer stringBuffer = new StringBuffer(text);
        stringBuffer.reverse();

        byte[] buffer = stringBuffer.toString().getBytes();
        FileOutputStream fi1 = new FileOutputStream("task06_reversTextJavaCode.txt");
        fi1.write(buffer);
        fi1.close();

    }
}
