package com.rakovets.course.javabasics.garage;

import java.util.LinkedList;

public class GarageDemo {
    public static void main(String[] args) {

        LinkedList<Car> cars = new LinkedList<>();//список объектов

       //cars.add(new BMW("X5", "Black", 2005, 10010));
       //cars.add(new BMW("X1", "Pink", 2014, 10013430));
       //cars.add(new BMW("X5", "White", 2015, 10012));
       //cars.add(new Ford("Kuga", "Black", 2010, 100134));
       //cars.add(new Honda("Civic", "Red" , 2009,334333));
       //cars.add(new Kia( "Sorento", "Grey" , 2013,334093333));
        Kia kiaAtos = new Kia("Atos", "Red", 2009, 10018);
        //cars.add(x1);
      //  cars.add(x5);
        Garage garageList = new Garage(cars);
        garageList.park(kiaAtos);

       // garageList.park(x5);

       // garageList.leave(x1);

        //System.out.println(garageList.getCarsMap());
      // BMW.class.getName();
      // System.out.println(garageList.getCount("BMW","X1"));
      // System.out.println(garageList.getCount("Ford","Kuga"));
      // System.out.println(garageList.isExist(334093333));
      // System.out.println(garageList.isExist("Ki4a", "Sorento",334093333));
      // System.out.println(garageList.getByRegistrationNumber(334093333));



    }
}
