package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class Barbecu extends StandartPizza {
    public Barbecu (){
        super(List.of(Meat.PORK),List.of(Chess.MASDAM),List.of(Vegetables.TOMATOS),List.of(TypeOfTest.THIN),List.of(BoardType.WithCheeseBoard),List.of(OtherIngridients.SALMON));
    }
}
