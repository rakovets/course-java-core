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

    final private static int One_Hundred_Percent = 100;
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
        double startPriceAllItems = 1.7;
        int differentialNumberItems = 7;
        double differentialSell = 1.0;
        int sizeTotalPrice = 3;
        //5, 1.7, 7, 1.0, 3
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
        StringBuilder totalPriceList = new StringBuilder();
        double costOfOneItem = startPriceAllItems / startNumberItems;
        double startingDiscountPercentage = 0.0;
        double withDiscount = startPriceAllItems;

        for (int i = 0; i < sizeTotalPrice; i++) {
            totalPriceList.append(startNumberItems).append(" - ")
                    .append(NumberUtil.roundValueToTwoDigitsForMantissa(withDiscount))
                    .append(" with sell ")
                    .append(startingDiscountPercentage)
                    .append("%")
                    .append("\n");
            startingDiscountPercentage += differentialSell;
            startPriceAllItems += costOfOneItem * differentialNumberItems;
            withDiscount = startPriceAllItems
                    - ((startPriceAllItems / One_Hundred_Percent)
                    * startingDiscountPercentage);
            startNumberItems += differentialNumberItems;
        }
        totalPriceList.deleteCharAt(totalPriceList.length() - 1);
        return totalPriceList.toString();
    }
}
