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

1. **Start the program**:
   ```bash
   java com.itheima.petrolstationdemo.Test
