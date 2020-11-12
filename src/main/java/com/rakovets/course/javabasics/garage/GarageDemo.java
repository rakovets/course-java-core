package com.rakovets.course.javabasics.garage;

import java.util.LinkedList;

public class GarageDemo {
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();//список объектов

        BMW x1 = new BMW("X1", "Black Lack", 2010, 1033012);
        BMW x5 = new BMW("X5", "Black", 2005, 10010);
        cars.add(new BMW("X5", "Black", 2005, 10010));
        cars.add(new BMW("X5", "White", 2015, 10012));
        cars.add(new Ford("Kuga", "Black", 2010, 100134));
        cars.add(new Honda("Civic", "Red" , 2009,334333 ));
        cars.add(new Kia( "Sorento", "Grey" , 2013,334093333 ));
        cars.add(x1);
        cars.add(x5);
        Garage garageList = new Garage(cars);
      //  garageList.park(x1);
       // garageList.park(x5);

       // garageList.leave(x1);

        //System.out.println(garageList.getCarsMap());
        System.out.println(garageList.getCount(x1.getBrand(),x1.getModel()));
        System.out.println(garageList.getCount(x5.getBrand(),x5.getModel()));

    }
}
