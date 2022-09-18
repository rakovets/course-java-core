package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для фитнес браслета.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startDistance = 13;
        int finishDistance = 20;
        double dailyProgress = 5.0;

        double totalDistance = calculateTotalDistance(startDistance, finishDistance, dailyProgress);
        System.out.printf("Result: %f", totalDistance);
    }

    /**
     * Рассчитывает пробег (т.е дистанцию, которую пробежал спортсмен за все тренировки), который совершит спортсмен
     * при подготовке к марафону.
     *
     * @param startDistance             дистанция которую пробегает спортсмен до начала тренировки
     * @param finishDistance            дистанция которую желает пробежать спортсмен после окончания тренировок
     * @param dailyProgressAsPercentage ежедневный прогресс в процентах по отношению к предыдущему забегу
     * @return пробег, с точностью до 2 знаков после десятичного разделителя:
     * <code>NumberUtil.roundValueToTwoDigitsForMantissa(value)</code>
     */
    static double calculateTotalDistance(int startDistance, int finishDistance, double dailyProgressAsPercentage) {
        double _totalDistance = 0;
        double _dayDistance = (double) startDistance;
        final int DEGREE_OF_ROUNDING = 2;
        if (startDistance > 0) {
            do {
                _dayDistance += _dayDistance * (dailyProgressAsPercentage / 100);
                _totalDistance += _dayDistance;
            } while ((int) _dayDistance < finishDistance);
            // make rounding value of _totalDistance
            _totalDistance *= Math.pow(10, (DEGREE_OF_ROUNDING + 1));
            long result = (long) _totalDistance;
            if ((result % 10) < 5) {
                result /=10;
            } else {
                result /= 10;
                result ++;
            }
            _totalDistance = result / (Math.pow(10, DEGREE_OF_ROUNDING));
        } else {
            _totalDistance = 0;
        }
        return _totalDistance;
    }
}
