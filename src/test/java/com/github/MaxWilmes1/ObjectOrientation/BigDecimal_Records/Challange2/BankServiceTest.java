package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class BankServiceTest {

    @Test
    void openAccountTest() {
        // given
        List<Client> clients = new ArrayList<>();
        Client c = new Client("Max", "Wilmes", 12345);
        BigDecimal expected = new BigDecimal("0");

        // when
        Account a1 = BankService.openAccount(clients);
        BigDecimal actual = a1.getAccountBalance();
        // then
         Assertions.assertEquals(expected,actual);
    }

    @Test
    void transferMoneyTest() {
        // given
        List<Client> clients = new ArrayList<>();
        Client c1 = new Client("Max", "Wilmes", 12345);
        Client c2 = new Client("Linda", "Witte", 12344);
        clients.add(c1);
        clients.add(c2);
        Account a1 = new Account(new BigDecimal("1000"), 123456, clients);
        Account a2 = new Account(new BigDecimal("2000"), 123455, clients);
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

    @Test
    void splitAccountsTest(){
        // given
        Client c1 = new Client("Max", "Wilmes", 12345);
        Client c2 = new Client("Linda", "Witte", 12344);
        List<Client> clients = List.of(c1, c2);

        Account sharedAccount = BankService.openAccount(clients);
        sharedAccount.depositMoney(new BigDecimal("1200"));

        BigDecimal expected1 = new BigDecimal("600");
        BigDecimal expected2 = new BigDecimal("600");

        // when
        System.out.println("sharedAccount number: "+sharedAccount.getAccountNumber());
        List<Account> splitAccounts = BankService.split(sharedAccount.getAccountNumber());
        Assertions.assertEquals(2, splitAccounts.size(), "Es sollten zwei neue Accounts existieren.");
        BigDecimal actual1 = splitAccounts.get(0).getAccountBalance();
        BigDecimal actual2 = splitAccounts.get(1).getAccountBalance();

        // then
        Assertions.assertEquals(expected1,actual1);
        Assertions.assertEquals(expected2,actual2);
    }
}