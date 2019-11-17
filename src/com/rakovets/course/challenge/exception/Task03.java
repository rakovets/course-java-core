package com.rakovets.course.challenge.exception;

public class Task03 {
    public static void main(String[] args) {
        Car car = new Car("Bugatti");
        System.out.println(car.getName());
        car.setHasWheels(true);
        car.setHasSteeringWheel(true);
        car.setHasChassis(true);
        car.setHasWaterPillow(false);
        car.setHasСaterpillars(false);
        try {
            car.Drive();
        } catch (ExceptionDravingCar exceptionDravingCar) {
            System.out.println(exceptionDravingCar.getMessage());
            System.out.println("Checkmanagement mechanisms of car !, Car have a Chassis " + "\n" + car.hasChassis + "\n" + "car has Wheels " +
                    "\n" + car.hasWheels + "\n" + "Car has SteeringWheel\n" + "\n" + car.hasSteeringWheel + "\n" + "Car has Сaterpillars" + "\n" +
                    car.hasСaterpillars + "\n" + "Car has WaterPillow " + "\n" + car.hasWaterPillow);
            exceptionDravingCar.printStackTrace();
        }
    }

    public class ExceptionDravingCar extends RuntimeException {
        ExceptionDravingCar(String massege) {
            super(massege);
        }
    }

    public static class Car {
        private String name;
        boolean hasWheels;
        boolean hasСaterpillars;
        boolean hasWaterPillow;
        boolean hasSteeringWheel;
        boolean hasChassis;

        public Car(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setHasWheels(boolean hasWheels) {
            System.out.println("The car has a wheels\n" + hasWheels);
            this.hasWheels = hasWheels;
        }

        public void setHasSteeringWheel(boolean hasSteeringWheel) {
            System.out.println("Sports car has a nice steering wheel\n" + hasSteeringWheel);
            this.hasSteeringWheel = hasSteeringWheel;
        }

        public void setHasСaterpillars(boolean hasСaterpillars) {
            System.out.println("Car has Caterpillars\n" + hasСaterpillars);
            this.hasСaterpillars = hasСaterpillars;
        }

        public void setHasWaterPillow(boolean hasWaterPillow) {
            System.out.println("Car has WaterPillow\n" + hasWaterPillow);
            this.hasWaterPillow = hasWaterPillow;
        }

        public void setHasChassis(boolean hasChassis) {
            System.out.println("The Chassis the most importand things in your car!\n" + hasChassis);
            this.hasChassis = hasChassis;
        }

        public void Drive() throws ExceptionDravingCar {
            System.out.println("Lets go to drive !))");
            if (hasSteeringWheel && hasWheels && hasChassis) {
                System.out.println("Let's go with the breeze whith ");
            } else if (hasСaterpillars && hasWaterPillow) {
                throw new RuntimeException("Еhere are extra items in the car, and we won’t go!!");
            }
        }
    }
}
