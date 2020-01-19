package com.rakovets.java.solid.my.standarts;

import com.rakovets.java.solid.my.StandartPizza;
import com.rakovets.java.solid.my.ingridients.*;

import java.util.List;

public class FourSesons extends StandartPizza {
    public FourSesons (){
        super(List.of(Meat.LAMB),List.of(Chess.RADONAR),List.of(Vegetables.CABBAGE),List.of(TypeOfTest.THICK),List.of(BoardType.WithSausageSide),List.of(OtherIngridients.PEAS));
    }
}
