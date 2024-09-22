package com.itheima.petrolstationdemo;

public class SilverCard extends MembershipCard{
    private String cardType = "Silver Card";

    @Override
    public void pay(double money) {
        // enjoy a .9 discount for silver card
        System.out.println("You have a 10% discount.");
        super.setBalance(super.getBalance() - money * 0.9);
        // inform the amount of this payment
        System.out.println("Amount of this payment: " + money * 0.9);
        // show balance after payment
        System.out.println("Balance after payment: " + super.getBalance());
    }

    @Override
    public void showInfo() {
        System.out.println("CardId: " + super.getCardId());
        System.out.println("Balance: " + super.getBalance());
        System.out.println("CardType: " + this.cardType);
    }

    public SilverCard() {
    }

    public SilverCard(String cardId, double balance, String cardType) {
        super(cardId, balance);
        cardType = cardType;
    }
}
