package com.rakovets.course.java.core.practice.looping_statements;

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
class Task07 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startNumberItems = 2;
        double startPriceAllItems = 2.0;
        int differentialNumberItems = 2;
        int sizeTotalPrice = 15;

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
     * <code>NumberUtil.roundValueToTwoDigitsForMantissa(value)</code>
     */
    static String generateTotalPriceList(int startNumberItems, double startPriceAllItems, int differentialNumberItems, int sizeTotalPrice) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String generateTotalPriceList = "";
        int numberItems = startNumberItems;
        double totalPrice =startPriceAllItems;
        double oneItemPrice = startPriceAllItems / startNumberItems;
        for (int i = 1; i < sizeTotalPrice; i++){
            generateTotalPriceList += numberItems + " - " + totalPrice + "\n";
            numberItems += differentialNumberItems;
            totalPrice = Math.round((numberItems * oneItemPrice) * 100);
            totalPrice = totalPrice /100;
        }
        generateTotalPriceList += numberItems + " - " + totalPrice;
        return generateTotalPriceList;
    }
}
