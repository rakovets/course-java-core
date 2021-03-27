package com.rakovets.course.java.core.practice.looping_statement;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для сети оптовых гипермаркетов.
 * Необходимо сформировать список цен для некоторого продукта.
 * <p>
 * Пример:
 * Список начинается с 10 единиц товара за 50 единиц денег, размерность списка 3, разница в количестве между соседними
 * значениями в списке 2 единицы товара. В итоге получим:
 * <p>
 * 10 - 50
 * 12 - 60
 * 14 - 70
 *
 * @author Dmitry Rakovets
 */
class Task08 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        double startPriceAllItems = 1.3;
        int startNumberItems = 100;
        int differentialNumberItems = 1;
        int sizeTotalPrice = 6;

        String totalPriceList = generateTotalPriceList(startNumberItems, startPriceAllItems, differentialNumberItems, sizeTotalPrice);
        System.out.printf("Result:\n%s", totalPriceList);
    }

    /**
     * Генерирует список цен для продукта.
     *
     * @param startNumberItems        количество продуктов, с которых начинается список цен
     * @param startPriceAllItems      стоимость всех продуктов, с которых начинается список цен
     * @param differentialNumberItems разница в количестве продуктов между соседними значениями списка цен
     * @param sizeTotalPrice          размерность списка цен
     * @return price, где формат вывода одной записи '${numberItems} - ${cost}'. Для ${cost} использовать точность до
     * 2 знаков после вещественного разделителя:
     * <code>BigDecimal.valueOf(currentPriceAllItemsWithSell).setScale(2, RoundingMode.HALF_UP).doubleValue()</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, int sizeTotalPrice) {
        String priceList = "";
        double currentPriceAllItemsWithSell = startPriceAllItems;
        int currentNumberItems = startNumberItems;

        for (int i = 1; i <= sizeTotalPrice; i++) {
            if (i < sizeTotalPrice) {
                priceList += currentNumberItems + " - " + currentPriceAllItemsWithSell + "\n";
                currentNumberItems += differentialNumberItems;
                currentPriceAllItemsWithSell = currentNumberItems * startPriceAllItems / startNumberItems;
                currentPriceAllItemsWithSell = BigDecimal.valueOf(currentPriceAllItemsWithSell)
                        .setScale(2, RoundingMode.HALF_UP).doubleValue();

            } else {
                priceList += currentNumberItems + " - " + currentPriceAllItemsWithSell;
                currentPriceAllItemsWithSell = BigDecimal.valueOf(currentPriceAllItemsWithSell)
                        .setScale(2, RoundingMode.HALF_UP).doubleValue();
            }
        }
        return priceList;
    }
}
