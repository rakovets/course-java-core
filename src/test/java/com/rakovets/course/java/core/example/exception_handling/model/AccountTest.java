package com.rakovets.course.java.core.example.exception_handling.model;

import com.rakovets.course.java.core.example.exception_handling.exception.AccountException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class AccountTest {
    @Test
    void takeCash_whenAccountIsRight_getCash() throws AccountException {
        Account expiredAccount = new Account(200.0, false);
        int expectedCash = 100;

        int actualCash = expiredAccount.takeCash(100);

        Assertions.assertEquals(expectedCash, actualCash);
    }

    @Test
    void takeCash_whenExpiredAccount_throwsAccountExceptionWithCorrectMessages() {
        Account expiredAccount = new Account(0.0, true);
        String expectedMessage = "Account is expired";
        String expectedDebugMessage = "Time to life: wrong";

        Executable actualExecutable = () -> expiredAccount.takeCash(100);

        AccountException actualException = Assertions.assertThrows(AccountException.class, actualExecutable);
        Assertions.assertEquals(expectedMessage, actualException.getMessage());
        Assertions.assertEquals(expectedDebugMessage, actualException.getDebugMessage());
    }

    @Test
    void takeCash_whenEmptyAccount_throwsAccountException() {
        Account emptyAccount = new Account(0.0, false);

        Executable actualExecutable = () -> emptyAccount.takeCash(100);

        Assertions.assertThrows(AccountException.class, actualExecutable);
    }
}
