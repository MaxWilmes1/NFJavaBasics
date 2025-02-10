package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BankService {
    private final List<Account> bankService = new ArrayList<>();
    private static final Random random = new Random();

    public static Account openAccount(Client client) {
        int accountNumber = generateUniqueAccountNumber();
        Account newAccount = new Account(BigDecimal.ZERO, accountNumber, client);
        System.out.println("Created a new Account with the number: "+accountNumber+" for client: "+ client);
        return newAccount;
    }

    private static int generateUniqueAccountNumber() {
        int accountNumber;
         accountNumber = 100000 + random.nextInt(900000); // Sechsstellig
        return accountNumber;
    }

    public static void transferMoney (BigDecimal amount, Account from, Account to){
        from.withdrawMoney(amount);
        to.depositMoney(amount);
        System.out.println("Transfered "+ amount+"€ "+ "from account " + from.getAccountNumber() + " to account " + to.getAccountNumber());
        System.out.println("Your new balance is: "+from.getAccountBalance() + "€");
    }
}
