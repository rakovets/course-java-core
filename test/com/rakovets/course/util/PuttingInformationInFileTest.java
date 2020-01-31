package com.rakovets.course.util;

import com.rakovets.pizza.entity.Ingredients;
import com.rakovets.pizza.services.InterfacePuttingInformationInFile;
import com.rakovets.pizza.services.PuttingInformationInFile;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class PuttingInformationInFileTest {
    private InterfacePuttingInformationInFile putInFile = new PuttingInformationInFile();

    @Test
    void testPutOrderInFile() {
        Set<Ingredients> ingredientsSet = new HashSet<>();
        ingredientsSet.add(Ingredients.With_meat);
        ingredientsSet.add(Ingredients.Gorgonzola);
        ingredientsSet.add(Ingredients.Cucumbers);
        putInFile.putOrderInFile("testPizza", ingredientsSet, 14.9, 2);
        File file = new File("PizzaThatClientOrder.txt");
        long size = file.length();
        assert size != 0;
    }
}
