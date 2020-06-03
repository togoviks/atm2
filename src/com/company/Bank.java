package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();
    private int accountCount = 0;

    public void createBankAccount() {
        bankAccounts.add(new BankAccount(accountCount));
        accountCount++;
    }

    public void accountAddCard(int accNum, Card card, int cardPIN) {
        bankAccounts.get(accNum).setAccountCard(card);
        bankAccounts.get(accNum).setCardPIN(cardPIN);
    }

    public boolean getAccess(int accNum, int PIN) {
        return bankAccounts.get(accNum).getCardPIN() == PIN;
    }

    public int checkBalance(int accNum) {
        return bankAccounts.get(accNum).getBalance();
    }

    public void addMoney(int accNum, int balance) {
        int newBalance = bankAccounts.get(accNum).getBalance() + balance;
        bankAccounts.get(accNum).setBalance(newBalance);
    }

    public boolean takeOffBalance(int accNum, int sum) {
        if (checkCardBalance(accNum, sum)) {
            int newBalance = bankAccounts.get(accNum).getBalance() - sum;
            bankAccounts.get(accNum).setBalance(newBalance);
            return true;
        } else {
            return false;
        }
    }

    private boolean checkCardBalance(int accNum, int sum) {
        return bankAccounts.get(accNum).getBalance() > sum;
    }

}
