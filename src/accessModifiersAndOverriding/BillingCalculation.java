package accessModifiersAndOverriding;

public class BillingCalculation {
	double baseAmount;
	;
	double baseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
		return baseAmount;
	}
	private double taxCalculation() {
		double baseAmount = baseAmount(this.baseAmount);
		double taxAmount = baseAmount*0.15;
		return taxAmount;
	}
	protected double totalAmount() {
		double totalAmount = baseAmount+taxCalculation();
		return totalAmount;
	}
	protected double foodDiscount(double totalAmount) {
		double discountedPrice = totalAmount*0.01;
		return discountedPrice;
	}

}
