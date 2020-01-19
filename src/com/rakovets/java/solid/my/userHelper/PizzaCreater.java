package com.rakovets.java.solid.my.userHelper;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PizzaCreater {

    static Map<Integer, OtherIngridients> otherIngridientsMap = new HashMap<>();
    static Map<Integer, Meat> meatMap = new HashMap<>();
    static Map<Integer, Chess> chessMap = new HashMap<>();
    static Map<Integer, Vegetables> vegetablesMap = new HashMap<>();
    static Map<Integer, TypeOfTest> typeOfTestMap = new HashMap<>();
    static Map<Integer, BoardType> boardTypeMap = new HashMap<>();

    static {
        otherIngridientsMap.put(1, OtherIngridients.AUBERGINE);
        otherIngridientsMap.put(2, OtherIngridients.GRAPERS);
        otherIngridientsMap.put(3, OtherIngridients.PEAS);
        otherIngridientsMap.put(4, OtherIngridients.SALMON);
        otherIngridientsMap.put(5, OtherIngridients.SOUSCREAM);

        meatMap.put(1, Meat.LAMB);
        meatMap.put(2, Meat.MUTTON);
        meatMap.put(3, Meat.PORK);
        meatMap.put(4, Meat.STEW);

        chessMap.put(1, Chess.FILADELFIA);
        chessMap.put(2, Chess.CHEDAR);
        chessMap.put(3, Chess.MASDAM);
        chessMap.put(4, Chess.RADONAR);
        chessMap.put(5, Chess.SILUGUNI);

        vegetablesMap.put(1, Vegetables.BAZILICK);
        vegetablesMap.put(2, Vegetables.CABBAGE);
        vegetablesMap.put(3, Vegetables.CAULIFLOWER);
        vegetablesMap.put(4, Vegetables.CHILIES);
        vegetablesMap.put(5, Vegetables.ONION);
        vegetablesMap.put(6, Vegetables.TOMATOS);

        typeOfTestMap.put(1, TypeOfTest.STANDART);
        typeOfTestMap.put(2, TypeOfTest.THICK);
        typeOfTestMap.put(3, TypeOfTest.THIN);


        boardTypeMap.put(1, BoardType.WithCheeseBoard);
        boardTypeMap.put(2, BoardType.WithSausageSide);

    }


    public static void main(String[] args) {
        PizzaCreater menu1 = new PizzaCreater();
        menu1.createCustomPizza();
    }

    public void createCustomPizza() {

        Scanner scanner = new Scanner(System.in);
        boolean operation = true;
        while (operation) {
            System.out.println("CREATE YOUR PIZZA!!!!");

            System.out.println("");

            System.out.println("[1]--Please add your favorite meat : ");
            for (Map.Entry<Integer, Meat> item1 : meatMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item1.getKey(), item1.getValue());
            }
            Integer choose = scanner.nextInt();
            Meat meat = meatMap.get(choose);
            System.out.println("You choos is : " + meatMap.get(choose));

            System.out.println("");

            System.out.println("[2]--Please add your favorite cheese :");
            for (Map.Entry<Integer, Chess> item : chessMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
            }
            Integer choose1 = scanner.nextInt();
            Chess chess = chessMap.get(choose1);
            System.out.println("You choos is : " + chessMap.get(choose1));

            System.out.println(" ");

            System.out.println("[3]--Please add your favorite vegetables :");
            for (Map.Entry<Integer, Vegetables> item2 : vegetablesMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item2.getKey(), item2.getValue());
            }
            Integer choose2 = scanner.nextInt();
            Vegetables vegetables = vegetablesMap.get(choose2);
            System.out.println("You choos is : " + vegetablesMap.get(choose2));

            System.out.println(" ");

            System.out.println("[4]--Please add your favorite type ot test :");
            for (Map.Entry<Integer, TypeOfTest> item4 : typeOfTestMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item4.getKey(), item4.getValue());
            }
            Integer choose3 = scanner.nextInt();
            TypeOfTest test = typeOfTestMap.get(choose3);
            System.out.println("You choos is : " + typeOfTestMap.get(choose3));

            System.out.println(" ");

            System.out.println("[5]--Please add your favorite board type :");
            for (Map.Entry<Integer, BoardType> item3 : boardTypeMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item3.getKey(), item3.getValue());
            }
            Integer choose4 = scanner.nextInt();
            BoardType boardType = boardTypeMap.get(choose4);
            System.out.println("You choos is : " + boardTypeMap.get(choose4));

            System.out.println(" ");

            System.out.println("[6]--Mayebe you want to add something in your Pizzaa , please choose otheringridients :");
            for (Map.Entry<Integer, OtherIngridients> item5 : otherIngridientsMap.entrySet()) {
                System.out.printf("Key: %d  Value: %s \n", item5.getKey(), item5.getValue());
            }
            Integer choose6 = scanner.nextInt();
            OtherIngridients otherIngridients = otherIngridientsMap.get(choose6);
            System.out.println("You choos is : " + otherIngridientsMap.get(choose6));

            StandartPizza pizza = new StandartPizza.Builder()
                    .meats(List.of(meat))
                    .vegetables(List.of(vegetables))
                    .chess(List.of(chess))
                    .boardType(List.of(boardType))
                    .typeOfTest(List.of(test))
                    .otherIngridients(List.of(otherIngridients))
                    .build();
            pizza.toString();
            System.out.println(pizza.getPrettyPrint());
            operation = false;
        }
    }
}
