package com.company;

public class BankAccount {
    private Card accountCard;
    private int accountNumber;
    private int cardPIN;
    private int balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountCard(Card accountCard) {
        this.accountCard = accountCard;
    }

    public void setCardPIN(int cardPIN) {
        this.cardPIN = cardPIN;
    }

    public int getCardPIN() {
        return cardPIN;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
