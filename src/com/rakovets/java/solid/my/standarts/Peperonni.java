package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class Peperonni extends StandartPizza {
    public Peperonni (){
        super(List.of(Meat.LAMB),List.of(Chess.SILUGUNI),List.of(Vegetables.ONION),List.of(TypeOfTest.STANDART),List.of(BoardType.WithSausageSide),List.of(OtherIngridients.SOUSCREAM));
    }
}
