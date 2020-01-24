package com.rakovets.pizza.services;

import com.rakovets.pizza.entity.Ingredients;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

public class PuttingInformationInFile implements InterfacePuttingInformationInFile{
    public void putOrderInFile(String name, Set<Ingredients> ingredients, double cost, int count) {
        String costInString = "" + cost;
        String countInString = "" + count;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("PizzaThatClientOrder.txt"))) {
            bufferedWriter.write("Ingredients in pizza:\n");
            for (Ingredients ingredient: ingredients) {
                bufferedWriter.write(ingredient.toString() + "\n");
            }
            bufferedWriter.write("Pizza name: " + name + "\n" + "Pizza cost: "
                    + costInString + "\n" + "Count of pizza: " + countInString + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
