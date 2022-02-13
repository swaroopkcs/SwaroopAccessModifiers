package accessModifiersAndOverriding;

public class DeliverDiscount extends BillingCalculation{
	@Override
	protected double foodDiscount(double totalAmount) {
		double discountedPrice = totalAmount*0.05;
		return discountedPrice;
	}


}
