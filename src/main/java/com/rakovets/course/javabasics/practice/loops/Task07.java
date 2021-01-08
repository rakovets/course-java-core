package com.rakovets.course.javabasics.practice.loops;

/**
 * Разработать программу для фитнес браслета.
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
        int startDistance = 13;
        int finishDistance = 20;
        int dailyProgress = 5;

        double totalDistance = calculateTotalDistance(startDistance, finishDistance, dailyProgress);
        System.out.printf("Result: %f", totalDistance);
    }

    /**
     * Рассчитывает пробег, который совершит спортсмен при подготовке к марафону. Известно:
     *
     * @param startDistance  дистанция которую пробегает спортсмен до начала тренировки
     * @param finishDistance дистанция которую желает пробежать спортсмен после окончания тренировок
     * @param dailyProgress  ежедневный прогресс в процентах по отношению к предыдущему забегу
     * @return пробег (точность 10 метром)
     */
    static double calculateTotalDistance(int startDistance, int finishDistance, int dailyProgress) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        double run = 0;
        double progress;
        double progressDistance = startDistance;
        double dailyPercentProgress = (double) dailyProgress/100;
        if (startDistance > 0) {
            while (progressDistance <= finishDistance) {
                run += (progressDistance);
                progress = dailyPercentProgress * progressDistance;
                progressDistance += progress;
            }
            return Math.round(run * 100.0) / 100.0;
        } else
        return 0.00;
    }
}
