package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.MyExceptionTask03;

public class Task03 {
    final int MINIMUM_TERM_AFTER_OPEN_ACCOUNT = 2;
    final int MINIMUM_ACCOUNT_AMOUNT = 100;

    private int accountAmount;
    private int yearOfAmountOpening;

    public Task03 (int accountAmount, int yearOfAmountOpening) {
        this.accountAmount = accountAmount;
        this.yearOfAmountOpening = yearOfAmountOpening;
    }

    public int getRestOfAccountAfterRequest(int requestToWithdraw, int yearOfRequest) throws MyExceptionTask03 {
        if ((yearOfRequest - yearOfAmountOpening) < MINIMUM_TERM_AFTER_OPEN_ACCOUNT) {
            throw new MyExceptionTask03("Запрос на снятие не может быть обработан. ","Еще рано снимать деньги. С открытия счета не прошло " + MINIMUM_TERM_AFTER_OPEN_ACCOUNT + " лет (года)");
        }
        if ((accountAmount - requestToWithdraw) < MINIMUM_ACCOUNT_AMOUNT) {
            throw new MyExceptionTask03("Запрос на снятие не может быть обработан. ","Вы не можете снять такое количество денег, т.к. на счету останется меньше " + MINIMUM_ACCOUNT_AMOUNT + " рублей");
        }
        accountAmount -= requestToWithdraw;
        return accountAmount;
    }

    public int getAccountAmount() {
        return accountAmount;
    }
}
