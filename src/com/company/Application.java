package com.company;

public class Application {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Card card1 = new Card(0);
        ATM atm1 = new ATM();

        bank1.createBankAccount();
        bank1.accountAddCard(0, card1, 123);
        atm1.setConnectedBank(bank1);

        atm1.insertCard(card1);
        atm1.enterPIN(123);
        atm1.checkBalance();
        atm1.addMoney(500);
        atm1.takeOffBalance(300);
    }
}
