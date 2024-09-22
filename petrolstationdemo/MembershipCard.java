package com.itheima.petrolstationdemo;

public class MembershipCard {
    private String cardId;
    private double balance;

    public void pay(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void topUp(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully topped up: " + amount);
            // show balance after top-up
            System.out.println("Balance after top-up: " + this.balance);
        } else {
            System.out.println("Invalid top-up amount.");
        }
    }

    public void showInfo() {
        System.out.println("CardId: " + this.cardId);
        System.out.println("Balance: " + this.balance);
    }

    public MembershipCard() {
    }

    public MembershipCard(String cardId, double balance) {
        this.cardId = cardId;
        this.balance = balance;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCardType(String cardType) {
    }
}
