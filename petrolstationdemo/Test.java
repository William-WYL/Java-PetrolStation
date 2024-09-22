package com.itheima.petrolstationdemo;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MembershipCard card = new MembershipCard();

        System.out.println("Welcome to the petrol station!");
        System.out.println("Do you have a membership card?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int choice = sc.nextInt();
        if (choice == 1) {
            useCard(card);
        } else {
            openCard();
        }
        sc.close();
    }

    public static MembershipCard useCard(MembershipCard card) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your card ID:");
        String cardId = sc.next();

        if (cardId.equals(card.getCardId())) {
            System.out.println("Card found.");
            // Show info, top-up, pay...
            int choice;

            do {
                // Show the card information or Top-up or Pay or exit
                System.out.println("----------------What do you want to do?----------------");
                System.out.println("1. Show the card information");
                System.out.println("2. Top-up");
                System.out.println("3. Pay");
                System.out.println("4. Exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        card.showInfo();
                        break;
                    case 2:
                        System.out.println("Please enter the top-up amount:");
                        double topUp = sc.nextDouble();
                        card.topUp(topUp);
                        break;
                    case 3:
                        System.out.println("Please enter the payment amount:");
                        double payment = sc.nextDouble();
                        card.pay(payment);
                        break;
                    case 4:
                        System.out.println("Thank you for using the petrol station.");
                        return card;
                    default:
                        System.out.println("Invalid input.");
                        break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Card not found.");
        }

        // return to the main menu
        useCard(card);

        sc.close();
        return card;
    }

    public static MembershipCard openCard() {
        Scanner sc = new Scanner(System.in);
        MembershipCard card = null;
        // 1.1 Open a new membership card
        System.out.println("Which type of card do you want to apply for?");
        System.out.println("1. Golden card (The first top-up amount is more than $5000, \nbut you can enjoy a 20% discount for each payment.)");
        System.out.println("2. Silver card (The first top-up amount is more than $2000, \nbut you can enjoy a 20% discount." );

        int cardType = sc.nextInt();

        // 1.2 Top-up amount
        System.out.println("Please enter the top-up amount:");
        double topUpAmount = sc.nextDouble();

        if (topUpAmount < 0){
            System.out.println("The top-up amount cannot be less than 0.");
            return null;
        }

        if (topUpAmount >= 5000 && cardType == 1) {
            card = new GoldenCard();
            card.setCardType("Golden Card");
            System.out.println("You have successfully opened a Golden card.");
        } else if (topUpAmount >= 2000 && cardType == 2) {
            card = new SilverCard();
            card.setCardType("Silver Card");
            System.out.println("You have successfully opened a Silver card.");
        } else {
            System.out.println("The top-up amount is less than the minimum amount.");
            return null;
        }

        // 1.3 Set the card ID
        System.out.println("Please set your card ID:");
        String cardId = sc.next();
        card.setCardId(cardId);
        card.topUp(topUpAmount);
        card.showInfo();

        // 1.4 Use the card or exit
        System.out.println("Do you want to use the card or exit?");
        System.out.println("1. Use the card");
        System.out.println("2. Exit");
        int choice = sc.nextInt();

        if (choice == 1) {
            useCard(card);
        } else {
            System.out.println("Thank you for using the petrol station.");
        }

        sc.close();
        return card;
    }
}
