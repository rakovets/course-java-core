package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class CountrySide extends StandartPizza {
    public CountrySide() {
        super(List.of(Meat.LAMB), List.of(Chess.CHEDAR), List.of(Vegetables.BAZILICK), List.of(TypeOfTest.STANDART), List.of(BoardType.WithCheeseBoard), List.of(OtherIngridients.SOUSCREAM));
    }
}
