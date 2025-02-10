package com.github.MaxWilmes1.ObjectOrientation.BigDecimal_Records.Challange2;

import java.math.BigDecimal;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BankService {
    private static List<Account> bankService = new ArrayList<>();
    private static final Random random = new Random();

    public static Account openAccount(List<Client> clients) {
        int accountNumber = generateUniqueAccountNumber();
        Account newAccount = new Account(BigDecimal.ZERO, accountNumber, clients);
        System.out.println("Created a new Account with the number: "+accountNumber+" for clients: "+ clients+". Balance is: " + newAccount.getAccountBalance()+"€");
        bankService.add(newAccount);
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

    public static List<Account> split(int accountNumber) {
        List<Account> newAccounts = new ArrayList<>();

        for (Account account : new ArrayList<>(bankService)) {  // Kopie der Liste erstellen
            if (account.getAccountNumber() == accountNumber) {
                for (Client client : account.getClients()) {
                    BigDecimal accountBalance = account.getAccountBalance();
                    BigDecimal accountClients = new BigDecimal(account.getClients().size());
                    BigDecimal sharedBalance = accountBalance.divide(accountClients, RoundingMode.DOWN);


                    List<Client> newClientAccount = new ArrayList<>();
                    newClientAccount.add(client);

                    Account newAccount = BankService.openAccount(newClientAccount);
                    newAccount.depositMoney(sharedBalance);  // Hier das neue Konto aufladen

                    newAccounts.add(newAccount);
                }
            }
        }
        return newAccounts;
    }

    public List<Account> getBankService() {
        return bankService;
    }
}
