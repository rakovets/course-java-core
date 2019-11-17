package com.rakovets.course.challenge.exception;

public class Task04 {
    public static void main(String[] args) {

        WalkInStreet walkInStreet = new WalkInStreet("Nikita");
        walkInStreet.putHat();
        walkInStreet.putScarf();
        try {
            walkInStreet.walk();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Сheck clothes ! \nThe had is put on ? " + "\n" + walkInStreet.wearingAhat + "\n" + "The scarf is put on ? " + "\n"
                    + walkInStreet.wearingAScarf);
        }
    }

    public static class WalkInStreet {
        private String name;
        boolean wearingAhat;
        boolean wearingAScarf;

        WalkInStreet(String name) {
            this.name = name;
        }

        public void putHat() {
            System.out.println("The Hat is put on ");
            this.wearingAhat = false;
        }

        public void putScarf() {
            System.out.println("The Scarf  is put on ");
            this.wearingAScarf = false;
        }

        public void walk() throws Exception {
            System.out.println("Going for a walk!");
            if (wearingAhat && wearingAScarf) {
                System.out.printf("We go to the walk ,\n", name);
            } else {
                throw new Exception("We dont redy to walk , pleace chek in your had and scarf!!");
            }
        }
    }
}
