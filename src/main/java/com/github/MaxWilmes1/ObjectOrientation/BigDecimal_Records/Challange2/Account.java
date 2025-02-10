package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import java.math.BigDecimal;

import java.util.Objects;

public class Account {
    private int accountNumber;
    private BigDecimal accountBalance;
    private Client client;

    public Account(BigDecimal accountBalance, int accountNumber, Client client) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.client = client;
    }

    public BigDecimal depositMoney (BigDecimal depositValue){
        accountBalance = accountBalance.add(depositValue);
        return this.getAccountBalance();
    }
    public BigDecimal withdrawMoney (BigDecimal depositValue){
        accountBalance = accountBalance.subtract(depositValue);
        return this.accountBalance;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", accountNumber=" + accountNumber +
                ", client=" + client +
                '}';
    }
}
