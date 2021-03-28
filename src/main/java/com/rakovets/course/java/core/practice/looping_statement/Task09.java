package com.rakovets.course.java.core.practice.looping_statement;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Разработать программу для сети оптовых гипермаркетов.
 * Необходимо сформировать список цен для некоторого продукта.
 * <p>
 * Пример:
 * Список начинается с 10 единиц товара за 50 единиц денег, размерность списка 3, разница в количестве между соседними
 * значениями в списке 2 единицы товара. Скидка за каждые дополнительные 2 единицы товара: 1%. В итоге получим:
 * <p>
 * 10 - 50 with sell 0%
 * 12 - 59.4 with sell 1%
 * 14 - 68.5 with sell 2%
 *
 * @author Dmitry Rakovets
 */
class Task09 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startNumberItems = 5;
        double startPriceAllItems = 10;
        int differentialNumberItems = 5;
        double differentialSell = 4;
        int sizeTotalPrice = 6;

        String totalPriceList = generateTotalPriceList(startNumberItems, startPriceAllItems, differentialNumberItems, differentialSell, sizeTotalPrice);
        System.out.printf("Result:\n%s", totalPriceList);
    }

    /**
     * Генерирует список цен для продукта.
     *
     * @param startNumberItems        количество продуктов, с которых начинается список цен
     * @param startPriceAllItems      стоимость всех продуктов, с которых начинается список цен
     * @param differentialNumberItems разница в количестве продуктов между соседними значениями списка цен
     * @param sizeTotalPrice          размерность списка цен
     * @param differentialSell        скидка в процентах на всю покупку за приобретение дополнительных
     *                                <code>differentialNumberItems</code> товара
     * @return список цен, где формат вывода одной записи в списке цен:
     * '${numberItems} - ${cost} with sell ${totalSell}%'. Для ${cost} использовать точность до 2 знаков после
     * вещественного разделителя:
     * <code>BigDecimal.valueOf(currentPriceAllItemsWithSell).setScale(2, RoundingMode.HALF_UP).doubleValue()</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, double differentialSell, int sizeTotalPrice) {
        String priceList = "";
        double currentPriceAllItemsWithSell = startPriceAllItems; // текущее значение цены со скидкой.
        double currentSell = differentialSell;  // текущая скидка.
        int currentNumberItems = startNumberItems; // текущее кол-во товаров.

        for (int i = 1; i <= sizeTotalPrice; i++) {
            currentPriceAllItemsWithSell = BigDecimal.valueOf(currentPriceAllItemsWithSell)
                    .setScale(2, RoundingMode.HALF_UP).doubleValue();
            if (i < sizeTotalPrice) {
                if (i == 1) {
                    priceList += currentNumberItems + " - " + currentPriceAllItemsWithSell + " with sell "
                            + "0.0" + "%\n";
                    currentNumberItems += differentialNumberItems;
                    currentPriceAllItemsWithSell = (currentNumberItems * startPriceAllItems / startNumberItems);
                } else {
                    priceList += currentNumberItems + " - " + currentPriceAllItemsWithSell + " with sell "
                            + currentSell + "%\n";
                    currentNumberItems += differentialNumberItems;
                    currentPriceAllItemsWithSell = (currentNumberItems * startPriceAllItems / startNumberItems);
                    currentSell += differentialSell;
                }
                currentPriceAllItemsWithSell -= currentPriceAllItemsWithSell * 0.01 * currentSell;
            } else {
                priceList += currentNumberItems + " - " + currentPriceAllItemsWithSell + " with sell "
                        + currentSell + "%";
                currentPriceAllItemsWithSell -= currentPriceAllItemsWithSell * 0.01 * currentSell;
                currentSell += differentialSell;
            }
        }
        return priceList;
    }
}
