package com.rakovets.course.challenge.oop.objects;

/**## Specification of task 2
 Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате должен задаваться тремя свойствами,
 которые определяют количество купю номинала: 
 - 20
 - 50
 - 100

 Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги, который принимает сумму денег, а
 возвращает булевое значение - успешность выполнения операции. При снятии денег функция должна распечатывать каким
 количеством купюр какого номинала выдаётся сумма. Создать конструктор с тремя параметрами - количеством купюр
 каждого номинала.

 Написать тесты для класса.
 */

class Atm {
    private int quantityBanknotes20;
    private int quantityBanknotes50;
    private int quantityBanknotes100;

    Atm() {

    }

    Atm(int quantityBanknotes20, int quantityBanknotes50, int quantityBanknotes100) {
        this.quantityBanknotes20 = quantityBanknotes20;
        this.quantityBanknotes50 = quantityBanknotes50;
        this.quantityBanknotes100 = quantityBanknotes100;
    }

    void addBanknotes20(int quantity) {
        this.quantityBanknotes20 += quantity;
    }

    void addBanknotes50(int quantity) {
        this.quantityBanknotes50 += quantity;
    }

    void addBanknotes100(int quantity) {
        this.quantityBanknotes100 += quantity;
    }

    boolean giveMoney(int sumForGiveOut) {
        boolean giveMoney = false;
        for (int a = 0; ((a <= this.quantityBanknotes100) && !giveMoney); a++) {
            for (int b = 0; ((b <= this.quantityBanknotes50) && !giveMoney); b++) {
                for (int c = 0; ((c <= this.quantityBanknotes20) && !giveMoney); c++) {
                    if ((a * 100 + b * 50 + c * 20) == sumForGiveOut) {
                        System.out.printf("Q-ty notes 20 = %d, sum = %d\nQ-ty notes 50 = %d, sum = %d\nQ-ty notes 100 = %d, sum = %d\nAll sum = %d\n\n", c, (c * 20), b, (b * 50), a, (a * 100), (a * 100 + b * 50 + c * 20));
                        giveMoney = true;
                    }
                }
            }
        }
        System.out.println("giveMoney = " + giveMoney);
        if (giveMoney) {
            System.out.printf("Everything is OK :-) !!!\nSum for give out = %d", sumForGiveOut);
        } else {
            System.out.println("Your sum is wrong. Try again!");
        }
        return giveMoney;
    }

    void display() {
        System.out.printf("Q-ty notes 20 = %d\nQ-ty notes 50 = %d\nQ-ty notes 100 = %d\n\n", this.quantityBanknotes20, this.quantityBanknotes50, this.quantityBanknotes100);
    }

}


