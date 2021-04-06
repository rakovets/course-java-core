package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Atm {
}
== Specification of task 4

        1. Создать class `Atm` описывающий банкомат.

        2. Создать *Fields*:

        * `numberBanknotes20`
        * `numberBanknotes50`
        * `numberBanknotes100`

        3. Создать *Constructors*:

        * `Atm(numberBanknotes20, numberBanknotes50, numberBanknotes100)`

        4. Создать *Methods*:

        * `addBanknotes20(number)`
        * `addBanknotes50(number)`
        * `addBanknotes100(number)`

        5. * Создать *Methods*:

        * `isPossibleIssue(amount)` - проверяет, возможно ли выдать сумму, которую запросил клиент
        * `getOptionsCombinationBanknotes(amount)` - возвращает все возможные варианты для суммы выдаваемых купюр
        * `getCash(option)` - выдает деньги клиенту, для выбранного им варианта
