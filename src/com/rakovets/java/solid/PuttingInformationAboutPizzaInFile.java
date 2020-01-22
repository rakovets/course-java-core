package com.rakovets.java.solid;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class PuttingInformationAboutPizzaInFile {
    public void putOrderInFile(Set<Ingredients> ingredients, double cost, double size) {
        String costInString = "" + cost;
        String sizeInString = "" + size;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("PizzaThatClientOrder.txt"))) {
            bufferedWriter.write("Ingredients in pizza:\n");
            for (Ingredients ingredient: ingredients) {
                bufferedWriter.write(ingredient.toString() + "\n");
            }
            bufferedWriter.write("Pizza cost: " + costInString + "\n" + "Pizza size: " + sizeInString + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
