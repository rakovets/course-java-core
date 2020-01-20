package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.Pizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class Chili extends Pizza {
    private double price;

    public Chili() {
        super(List.of(Meat.MUTTON), List.of(Chess.MASDAM), List.of(Vegetables.CAULIFLOWER), List.of(TypeOfTest.THICK), List.of(BoardType.WithCheeseBoard), List.of(OtherIngridients.SOUSCREAM));
    }
}
