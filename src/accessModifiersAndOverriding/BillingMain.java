package accessModifiersAndOverriding;

import java.util.Scanner;

import baseAmount.BaseAmoutClass;

public class BillingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BillingCalculation billingCalculation = new BillingCalculation();
		BaseAmoutClass baseAmoutClass = new BaseAmoutClass();
		WalkInDiscount wDiscount = new WalkInDiscount();
		DeliverDiscount deliverDiscount = new DeliverDiscount();
		System.out
				.println("Please enter how you want to order. Walk in gets 10% disount and delivery gets 5% discount");
		System.out.println("Press 1 for walk in and 2 for deliver");
		int choiceDelivery = sc.nextInt();
		System.out.println("Press 1 if you want order food and beverages and 2 if you want to order food only");
		int foodChoice = sc.nextInt();
		double baseAmount = 0.0;
		if (foodChoice == 1) {
			System.out.println("Enter the price of food you want to purchase");
			double foodCost = sc.nextDouble();
			baseAmount = baseAmoutClass.baseAmount(foodCost);
		} else if (foodChoice == 2) {
			System.out.println("Enter the price of food you want to purchase");
			double foodCost = sc.nextDouble();
			System.out.println("Enter the price of beverages you want to purchase");
			double bevCost = sc.nextDouble();
			baseAmount = baseAmoutClass.baseAmount(foodCost, bevCost);
		} else {
			System.out.println("Please enter a valid choice");
		}
		billingCalculation.baseAmount(baseAmount);
		double totalCost = billingCalculation.totalAmount();
		double discount = 0.0;
		if (choiceDelivery == 1) {
			discount = wDiscount.foodDiscount(totalCost);
		} else if (choiceDelivery == 2) {
			discount = deliverDiscount.foodDiscount(totalCost);
		}
		double totalAmount = billingCalculation.totalAmount() - discount;
		System.out.println("The total price is: " + totalAmount);
		sc.close();
	}

}
