package com.rakovets.course.challenge.pizza;


import java.io.FileOutputStream;
import java.io.IOException;
public class PizzaDemo {
    public static void main(String[] args) {
        PizzeriaView.printMainMenu();
        int pizzaNumber = PizzeriaView.readUserInput("Введите номер пиццы: ");

        Pizza pizza1 = new Pizza(1, "Cheese Pizza", 23.5).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.CheddarCheese)
                .addIngredient(Ingredient.ParmesanCheese);
        Pizza pizza2 = new Pizza(2, "Vegetarian Pizza", 34.8).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.Spinach)
                .addIngredient(Ingredient.FetaCheese)
                .addIngredient(Ingredient.SourCreamSauce);
        Pizza pizza3 = new Pizza(3, "Pepperoni", 42.3).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.PepperoniSausage)
                .addIngredient(Ingredient.GarlicSauce);
        Pizza pizza4 = new Pizza(4, "Mushroom Pizza", 36.2).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.Mushrooms)
                .addIngredient(Ingredient.ChickenFillet)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.Pepper);
        Pizza pizza5 = new Pizza(5, "Hawaiian Pizza", 45.7).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.Ham)
                .addIngredient(Ingredient.Olives)
                .addIngredient(Ingredient.CannedPineapples);
        Pizza pizza6 = new Pizza(6, "Barbecue Pizza", 35.9).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.MozzarellaCheese)
                .addIngredient(Ingredient.MincedBeef)
                .addIngredient(Ingredient.Bow)
                .addIngredient(Ingredient.Pepper)
                .addIngredient(Ingredient.BarbecueSauce);
        Pizza pizza7 = new Pizza(7, "Seafood Pizza", 26.1).addIngredient(Ingredient.Tomato)
                .addIngredient(Ingredient.ParmesanCheese)
                .addIngredient(Ingredient.Shrimp)
                .addIngredient(Ingredient.Basil)
                .addIngredient(Ingredient.Pepper);

        if (pizzaNumber == 1) {
            print(pizza1);
        } else if (pizzaNumber == 2) {
            print(pizza2);
        } else if (pizzaNumber == 3) {
            print(pizza3);
        } else if (pizzaNumber == 4) {
            print(pizza4);
        } else if (pizzaNumber == 5) {
            print(pizza5);
        } else if (pizzaNumber == 6) {
            print(pizza6);
        } else if (pizzaNumber == 7) {
            print(pizza7);
        } else if (pizzaNumber == 0 || pizzaNumber > 7) {
            System.out.println("Такой пиццы не существует!");
        }

        int pizzaCount = PizzeriaView.readUserInput("\nВыберите количество пицц");
        System.out.println("\nОбщая стоимость: ");

        double total = 0.0;
        if (pizzaNumber == 1) {
            total = pizzaCount * pizza1.getCost();
        } else if (pizzaNumber == 2) {
            total = pizzaCount * pizza2.getCost();
        } else if (pizzaNumber == 3) {
            total = pizzaCount * pizza3.getCost();
        } else if (pizzaNumber == 4) {
            total = pizzaCount * pizza4.getCost();
        } else if (pizzaNumber == 5) {
            total = pizzaCount * pizza5.getCost();
        } else if (pizzaNumber == 6) {
            total = pizzaCount * pizza6.getCost();
        } else if (pizzaNumber == 7) {
            total = pizzaCount * pizza7.getCost();
        }
        System.out.println(total);

        int number = PizzeriaView.readUserInput("\nВыберите чем будете расплачиваться: \n" + "1. Наличные \n" + "2. Банковская карта \n");
        if (number == 1) {
            System.out.println("Вы выбрали оплату наличными");
        } else if (number == 2) {
            System.out.println("Вы выбрали оплату банковской картой");
        }

        try (FileOutputStream fos = new FileOutputStream("C://notes.txt")) {
            if (pizzaNumber == 1) {
                String s = "Пицца №" + pizzaNumber + " " + pizza1.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 2) {
                String s = "Пицца №" + pizzaNumber + " " + pizza2.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 3) {
                String s = "Пицца №" + pizzaNumber + " " + pizza3.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 4) {
                String s = "Пицца №" + pizzaNumber + " " + pizza4.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 5) {
                String s = "Пицца №" + pizzaNumber + " " + pizza5.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 6) {
                String s = "Пицца №" + pizzaNumber + " " + pizza6.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            } else if (pizzaNumber == 7) {
                String s = "Пицца №" + pizzaNumber + " " + pizza7.toString() + " Количество пицц: " + pizzaCount + " Итого: " + total;
                byte[] buffer = s.getBytes();
                fos.write(buffer, 0, buffer.length);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\nИнформация о пицце записана в файл");

    }

    static void print(Pizza pizza) {
        System.out.println(pizza.toString());
    }
}
