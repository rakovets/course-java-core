package com.rakovets.course.java.core.practice.looping_statements;

import com.rakovets.course.java.core.util.NumberUtil;

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
        int startNumberItems = 10;
        double startPriceAllItems = 50.0;
        int differentialNumberItems = 2;
        double differentialSell = 1.0;
        int sizeTotalPrice = 3;

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
     * <code>NumberUtil.roundValueToTwoDigitsForMantissa(value)</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, double differentialSell, int sizeTotalPrice) {
        double priseForOneItem = startPriceAllItems / startNumberItems;
        String listOfPrises = "";
        double itemPrise = startPriceAllItems;
        double salePercent = 0.0;
        double sale = 0.0;
        int itemNumber = startNumberItems;
        for (int i = 0; i < sizeTotalPrice; i++) {
            if (i == sizeTotalPrice - 1) {
                listOfPrises += itemNumber + " - " + NumberUtil.roundValueToTwoDigitsForMantissa(itemPrise) + " with sell " + salePercent + "%";
            } else {
                listOfPrises += itemNumber + " - " + NumberUtil.roundValueToTwoDigitsForMantissa(itemPrise) + " with sell " + salePercent + "%" + "\n";
                salePercent += differentialSell;
                itemNumber += differentialNumberItems;
                itemPrise = itemNumber * priseForOneItem;
                sale = itemPrise * salePercent / 100;
                itemPrise -= sale;
            }
        }
        return listOfPrises;
    }
}
