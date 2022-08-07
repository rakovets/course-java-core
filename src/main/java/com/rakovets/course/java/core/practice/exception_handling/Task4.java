package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.AreaException;

public class Task4 {
   private double side;

   public double getSide() {
       return side;
   }

   public double calculationArea(double side) throws AreaException {
       if(side <= 0) {
           throw new AreaException("The value must be greater than zero");
       }
       this.side = side;
       return side * side;
   }
}
