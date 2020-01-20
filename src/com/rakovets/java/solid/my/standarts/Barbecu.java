package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.Pizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.math.BigDecimal;
import java.util.List;

public class Barbecu extends Pizza {
    private BigDecimal price = new BigDecimal("15.00");

    public Barbecu() {
        super(List.of(Meat.PORK), List.of(Chess.MASDAM), List.of(Vegetables.TOMATOS), List.of(TypeOfTest.THIN), List.of(BoardType.WithCheeseBoard), List.of(OtherIngridients.SALMON));
    }

}

