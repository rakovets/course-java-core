    static float getTotalDepositAmount(int depositAmount, int depositYears, int depositAnnualPercentage) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        float totalDeposit = depositAmount + (float)(depositAmount *  depositAnnualPercentage * depositYears) / 100;
        return totalDeposit;

    }
}
