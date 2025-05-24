# Petrol Station Membership Card System

A Java application that simulates a petrol station membership card system with different card types offering various discounts.

## Features

- **Membership Card Types**:
  - Golden Card: 20% discount (requires initial top-up ≥ $5000)
  - Silver Card: 10% discount (requires initial top-up ≥ $2000)

- **Card Operations**:
  - Create new membership cards
  - Top-up card balance
  - Make payments with automatic discounts
  - View card information

## Class Structure

1. **MembershipCard (Base Class)**
   - Core card functionality
   - Basic payment processing
   - Balance management

2. **GoldenCard (Subclass)**
   - 20% discount on payments
   - Specialized info display

3. **SilverCard (Subclass)**
   - 10% discount on payments
   - Specialized info display

4. **Test (Main Class)**
   - User interface
   - Card management flow

## How to Use

Example Usage

Welcome to the petrol station!
Do you have a membership card?
1. Yes
2. No

[Select 2 to create new card]

Which type of card do you want to apply for?
1. Golden card (The first top-up amount is more than $5000...
2. Silver card (The first top-up amount is more than $2000...
3. Exit

[Select 1 and top-up $5000]

Please set your card ID: [Enter ID]
Successfully topped up: 5000.0
Balance after top-up: 5000.0

CardId: [Your ID]
Balance: 5000.0
CardType: Golden Card

[Now you can make payments with 20% discount]
