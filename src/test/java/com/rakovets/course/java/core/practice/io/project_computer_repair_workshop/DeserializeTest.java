package com.rakovets.course.java.core.practice.io.project_computer_repair_workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeserializeTest {
    @Test
    void deserializeComputer() {
        //Given
        SerializeUtils.serialize("src/main/resources/practice/complucter.dat",
                new Computer("AMD", "Nvidia", "4k", 18.0));
        String expectedResult = "Computer{cpu='AMD', gpu='Nvidia', resolution='4k', size=18.0}";
        //When
        String actualResult = SerializeUtils.deserialize("src/main/resources/practice/complucter.dat");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void deserializeNotebook() {
        //Given
        SerializeUtils.serialize("src/main/resources/practice/macBook.dat", new Notebook
                ("Intel", "Nvidia", "4k", 15.6, "Apple",
                        new Touchpad("4",true), "Oleg"));
        String expectedResult =
                "Notebook{cpu='Intel', gpu='Nvidia', resolution='4k', size=15.6, brand='Apple'," +
                        " touchpad=Touchpad{size='4', isMultitouch=true}, userName='null'}";
        //When
        String actualResult = SerializeUtils.deserialize("src/main/resources/practice/macBook.dat");
        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
