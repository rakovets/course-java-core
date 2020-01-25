package com.rakovets.pizza.services;

public class ServiceInformationAboutPizzaForManager implements InterfaceServiceInformation{
    private int countOfPizza = 0;
    private double countOfMoney = 0;

    @Override
    public void addCountOfOrderingPizza(int count) {
        setCountOfPizza(getCountOfPizza() + count);
    }

    public int getCountOfPizza() {
        return countOfPizza;
    }

    public void setCountOfPizza(int countOfPizza) {
        this.countOfPizza = countOfPizza;
    }

    @Override
    public void addCountOfMoney(double money) {
        setCountOfMoney(getCountOfMoney() + money);
    }

    @Override
    public double getCountOfMoney() {
        return countOfMoney;
    }

    public void setCountOfMoney(double countOfMoney) {
        this.countOfMoney = countOfMoney;
    }
}
