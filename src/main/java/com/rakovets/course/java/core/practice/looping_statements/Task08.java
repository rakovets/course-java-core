package com.rakovets.course.java.core.practice.looping_statements;

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
        int startNumberItems = 4;
        double startPriceAllItems = 3.0;
        int differentialNumberItems = 5;
        double differentialSell = 4.0;
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
     * <code>NumberUtil.roundValueToTwoDigitsForMantissa(value)</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, double differentialSell, int sizeTotalPrice) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String generateTotalPriceList = "";
        int numberItems = startNumberItems;
        double priceAllItems = startPriceAllItems;
        double priceOneItem = startPriceAllItems / startNumberItems;
        double sell = 0.0;
        double sellFromPrice;
        for (int i = 1; i <= sizeTotalPrice; i++) {
            generateTotalPriceList += numberItems + " - " + priceAllItems + " with sell " + sell + "%";
            if (i < sizeTotalPrice) {
                generateTotalPriceList += "\n";
            }
            numberItems += differentialNumberItems;
            sell += differentialSell;
            priceAllItems = numberItems * priceOneItem;
            sellFromPrice = priceAllItems * sell / 100;
            priceAllItems -= sellFromPrice;
            priceAllItems = (int) Math.round(priceAllItems * 100);
            priceAllItems /= 100;
        }
        return generateTotalPriceList;
    }
}
