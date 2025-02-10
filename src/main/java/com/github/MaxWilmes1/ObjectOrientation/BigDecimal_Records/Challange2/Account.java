package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import java.math.BigDecimal;

import java.util.List;
import java.util.Objects;

public class Account {
    private int accountNumber;
    private BigDecimal accountBalance;
    private List<Client> clients;

    public Account(BigDecimal accountBalance, int accountNumber, List<Client> clients) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.clients = clients;
    }

    public BigDecimal depositMoney (BigDecimal depositValue){
        accountBalance = accountBalance.add(depositValue);
        System.out.println("Deposited: "+ depositValue+". New Balance is: "+this.getAccountBalance());
        return this.getAccountBalance();
    }
    public BigDecimal withdrawMoney (BigDecimal withdrawValue){
        accountBalance = accountBalance.subtract(withdrawValue);
        System.out.println("Withdrawn: "+ withdrawValue+". New Balance is: "+this.getAccountBalance());
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

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Objects.equals(accountBalance, account.accountBalance) && Objects.equals(clients, account.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, clients);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountBalance=" + accountBalance +
                ", accountNumber=" + accountNumber +
                ", clients=" + clients +
                '}';
    }
}
