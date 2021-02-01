package com.rakovets.course.java.core.practice.exception_handling;

    class Factorial{

        public static int getFactorial(int num) throws FactorialException{

            int result=1;
            if(num<1) throw new FactorialException("The number is less than 1", num);

            for(int i=1; i<=num;i++){

                result*=i;
            }
            return result;
        }
    }



    class FactorialException extends Exception {

        private final int number;

        public int getNumber() {
            return number;
        }

        public FactorialException(String message, int num) {

            super(message);
            number = num;
        }


        public static void main(String[] args) {

            try {
                int result = Factorial.getFactorial(5);
                System.out.println(result);
            } catch (FactorialException ex) {

                System.out.println(ex.getMessage());
                System.out.println(ex.getNumber());
            }
        }
    }
