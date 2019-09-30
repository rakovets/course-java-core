package com.rakovets.course.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleTest {
    private static final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        outContent.reset();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void cleanUpStreams() {
        System.setOut(null);
    }

    protected static String getConsoleContentWithTrim() {
        return outContent.toString().trim();
    }

    protected static String getConsoleContentTrim() {
        return outContent.toString();
    }
}
