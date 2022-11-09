package com.rakovets.course.java.core.practice.io.project_file_util;

import java.io.*;

public class DemoTask08 {
    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        String pathToFile = "C:\\MyDir\\task08.bin";
        int[] intArray = new int[] {8, 9, 4, 66, 3, -15};
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(pathToFile))) {
            for (int i = 0; i < intArray.length; i++) {
                dos.writeInt(intArray[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        int[] outArray = fileUtil.getReversedIntArrayFromFile(pathToFile);
        try (DataInputStream dos = new DataInputStream(new FileInputStream(pathToFile))) {
            for (int i = 0; i < outArray.length; i++) {
                outArray[i] = dos.readInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println();
        for (int i = 0; i < outArray.length; i++) {
            System.out.print(outArray[i] + " ");
        }
    }
}
