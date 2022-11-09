package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.project_file_util.FileUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

public class Task08Test {
    FileUtil fileUtil = new FileUtil();
    @Test
    public void getReversedIntArrayFromFile() throws IOException {
        String pathToFile = "C:\\MyDir\\task08.bin";

        int[] outArray = fileUtil.getReversedIntArrayFromFile(pathToFile);
        try (DataInputStream dos = new DataInputStream(new FileInputStream(pathToFile))) {
            for (int i = 0; i < outArray.length; i++) {
                outArray[i] = dos.readInt();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        int[] expectedArray = new int[] {-15, 3, 4, 8, 9, 66};

        Assertions.assertArrayEquals(expectedArray, outArray);
    }
}
