package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.AreaException;

public class SquareTask4 {
   private double side;

   public double getSide() {
       return side;
   }

   public void setSide(double side) throws AreaException {
       if(side <= 0) {
           throw new AreaException();
       }
       this.side = side;
   }
}
