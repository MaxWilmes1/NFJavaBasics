package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void depositMoneyTest() {
        // given
        List<Client> clients = new ArrayList<>();
        Client c = new Client("Max", "Wilmes", 1234);
        clients.add(c);
        BigDecimal amount = new BigDecimal("1000");
        Account a = new Account(amount, 123456, clients);
        BigDecimal expected = new BigDecimal("1500");
        BigDecimal deposit = new BigDecimal("500");

        // when
        BigDecimal actual = a.depositMoney(deposit);

        // then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void withdrawMoneyTest() {
        // given
        List<Client> clients = new ArrayList<>();
        Client c = new Client("Max", "Wilmes", 1234);
        clients.add(c);
        BigDecimal amount = new BigDecimal("1000");
        Account a = new Account(amount, 123456, clients);
        BigDecimal expected = new BigDecimal("900");
        BigDecimal deposit = new BigDecimal("100");

        // when
        BigDecimal actual = a.withdrawMoney(deposit);

        // then
        Assertions.assertEquals(expected,actual);
    }
}