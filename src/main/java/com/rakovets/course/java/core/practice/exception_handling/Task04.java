package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask04;

public class Task04 {
    final int MINIMUM_AGE_OF_CLIENT = 18;
    final int MINIMUM_AMOUNT_TO_OPEN_ACCOUNT = 100;

    private int accountAmount;

    {
        accountAmount = 0;
    }

    public void openAccount(int amountToOpenAccount, int ageOfClient) throws MyExceptionTask04 {
        if (amountToOpenAccount < MINIMUM_AMOUNT_TO_OPEN_ACCOUNT) {
            throw new MyExceptionTask04("Счет не может быть открыт. ","Минимальная сумма для открытия счета " + MINIMUM_AMOUNT_TO_OPEN_ACCOUNT);
        }
        if (ageOfClient < MINIMUM_AGE_OF_CLIENT) {
            throw new MyExceptionTask04("Счет не может быть открыт.", "Возраст клиента " + ageOfClient + " лет не позволяет открыть счет." );
        }
        accountAmount += amountToOpenAccount;
    }

    public int getAccountAmount() {
        return accountAmount;
    }
}
