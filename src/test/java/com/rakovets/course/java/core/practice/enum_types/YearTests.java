package com.rakovets.course.java.core.practice.enum_types;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class YearTests {
    private final PrintStream standardOut = System.out;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private Year year;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(output));
        year = new Year();
    }

    @Test
    public void printLoveSeasonTest1() {
        year.printLoveSeasons(Seasons.SPRING);

        Assertions.assertEquals("I love spring \n", output.toString());
    }

    @Test
    public void printLoveSeasonTest2() {
        year.printLoveSeasons(Seasons.SUMMER);

        Assertions.assertEquals("I love summer \n", output.toString());
    }

    @Test
    public void printLoveSeasonTest3() {
        year.printLoveSeasons(Seasons.WINTER);

        Assertions.assertEquals("I love winter \n", output.toString());
    }

    @Test
    public void printLoveSeasonTest4() {
        year.printLoveSeasons(Seasons.SPRING);

        Assertions.assertEquals("I love spring \n", output.toString());
    }

    @Test
    public void printSeasonDataTest() {
        year.printSeasonData();
        String expect = "SUMMER 19.5 Warm season \n" + "AUTUMN 6.8 Cold season \n"
                + "WINTER -5.4 Cold season \n" + "SPRING 9.7 Cold season \n";

        Assertions.assertEquals(expect, output.toString());
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(standardOut);
    }
}
