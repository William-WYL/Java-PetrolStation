package com.itheima.petrolstationdemo;

public class GoldenCard extends MembershipCard{

    private String cardType = "Golden Card";

    public void pay(double money) {
        // enjoy a .8 discount for Golden card
        System.out.println("You have a 20% discount.");
        super.setBalance(super.getBalance() - money * 0.8);
        // inform the amount of this payment
        System.out.println("Amount of this payment: " + money * 0.8);
        // show balance after payment
        System.out.println("Balance after payment: " + super.getBalance());
    }

    @Override
    public void showInfo() {
        // show card information
        System.out.println("----------------Card information----------------");
        System.out.println("CardId: " + super.getCardId());
        System.out.println("Balance: " + super.getBalance());
        System.out.println("CardType: " + this.cardType);
    }

    public GoldenCard() {
    }

    public GoldenCard(String cardId, double balance, String cardType) {
        super(cardId, balance);
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

}

