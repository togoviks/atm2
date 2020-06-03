package com.company;

public class ATM {
    private boolean cardIn = false;
    private int currentCardNum;
    private Bank connectedBank;
    private boolean access = false;

    public void insertCard(Card currentCard) {
        if (!cardIn) {
            cardIn = true;
            currentCardNum = currentCard.getCardNum();
        }
    }

    public void setConnectedBank(Bank connectedBank) {
        this.connectedBank = connectedBank;
    }

    public void enterPIN(int PIN) {
        if (connectedBank.getAccess(currentCardNum, PIN)) {
            access = true;
            System.out.println("Доступ разрешён");
        } else {
            System.out.println("Неверный ПИН");
        }
    }

    public void checkBalance() {
        if (!access) {
            System.out.println("Доступ запрещён");
            return;
        }
        System.out.println("Текущий баланс: " + connectedBank.checkBalance(currentCardNum));
    }

    public void addMoney(int sum) {
        if (!access) {
            System.out.println("Доступ запрещён");
            return;
        }
        connectedBank.addMoney(currentCardNum, sum);
        checkBalance();
    }

    public void takeOffBalance(int sum) {
        if (!access) {
            System.out.println("Доступ запрещён");
            return;
        }
        if (connectedBank.takeOffBalance(currentCardNum, sum)) {
            checkBalance();
        }
        if (!connectedBank.takeOffBalance(currentCardNum, sum)) {
            System.out.println("Недостаточно средств");
        }
    }

    public void cardTakeOut() {
        access = false;
        cardIn = false;
    }

}
