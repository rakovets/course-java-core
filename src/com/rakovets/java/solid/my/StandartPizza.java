package com.rakovets.java.solid.my;

import com.rakovets.java.solid.my.userHelper.PrintConsistOfPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class StandartPizza implements PrintConsistOfPizza {

    public StandartPizza() {
    }

    private List<Meat> meats;
    private List<Chess> chess;
    private List<Vegetables> vegetables;
    private List<TypeOfTest> typeOfTests;
    private List<BoardType> boardTypes;
    private List<OtherIngridients> otherIngridients;

    public StandartPizza(List<Meat> meats
            , List<Chess> chess
            , List<Vegetables> vegetables
            , List<TypeOfTest> typeOfTests
            , List<BoardType> boardTypes
            , List<OtherIngridients> otherIngridients) {
        this.meats = meats;
        this.chess = chess;
        this.vegetables = vegetables;
        this.typeOfTests = typeOfTests;
        this.boardTypes = boardTypes;
        this.otherIngridients = otherIngridients;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Meats" + meats.toString() +
                "Chess" + chess.toString() +
                "Vegetables" + vegetables.toString() +
                "TypeOfTest" + typeOfTests.toString() +
                "BoardType" + boardTypes.toString() +
                "OtherIngridients" + otherIngridients.toString();
    }

    @Override
    public String getPrettyPrint() {
        return String.format("You pizza Have Meats - %S ," +
                        "\nchease - %s ," +
                        "\nVegetables - %s ," +
                        "\nTypeOfTest - %s ," +
                        "\nBoardType - %s ," +
                        "\nOtherIngridients",
                meats, chess, vegetables, typeOfTests, boardTypes, otherIngridients);
    }

    public static class Builder {
        private StandartPizza newPizza = new StandartPizza();

        public StandartPizza build() {
            return newPizza;
        }

        public Builder meats(List<Meat> meats) {
            newPizza.meats = meats;
            return this;
        }

        public Builder chess(List<Chess> chess) {
            newPizza.chess = chess;
            return this;
        }

        public Builder vegetables(List<Vegetables> vegetables) {
            newPizza.vegetables = vegetables;
            return this;
        }

        public Builder typeOfTest(List<TypeOfTest> typeOfTests) {
            newPizza.typeOfTests = typeOfTests;
            return this;
        }

        public Builder boardType(List<BoardType> boardTypes) {
            newPizza.boardTypes = boardTypes;
            return this;
        }

        public Builder otherIngridients(List<OtherIngridients> otherIngridients) {
            newPizza.otherIngridients = otherIngridients;
            return this;
        }
    }
}

