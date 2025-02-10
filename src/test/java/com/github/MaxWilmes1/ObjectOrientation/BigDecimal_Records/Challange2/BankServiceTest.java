package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

class BankServiceTest {

    @Test
    void openAccount() {
        // given
        Client c = new Client("Max", "Wilmes", 12345);
        BigDecimal expected = new BigDecimal("0");

        // when
        Account a1 = BankService.openAccount(c);
        BigDecimal actual = a1.getAccountBalance();
        // then
         Assertions.assertEquals(expected,actual);
    }

    @Test
    void transferMoney() {
        // given
        Client c1 = new Client("Max", "Wilmes", 12345);
        Account a1 = new Account(new BigDecimal("1000"), 123456, c1);
        Client c2 = new Client("Linda", "Witte", 12344);
        Account a2 = new Account(new BigDecimal("2000"), 123455, c2);
        BigDecimal amount = new BigDecimal("500");
        BigDecimal expected1 = new BigDecimal("500");
        BigDecimal expected2 = new BigDecimal("2500");


        // when
        BankService.transferMoney(amount, a1, a2);
        BigDecimal actual1 = a1.getAccountBalance();
        BigDecimal actual2 = a2.getAccountBalance();

        // then
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
    }
}