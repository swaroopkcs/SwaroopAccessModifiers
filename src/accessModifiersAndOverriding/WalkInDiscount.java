package accessModifiersAndOverriding;

public class WalkInDiscount extends BillingCalculation{
	@Override
	protected double foodDiscount(double totalAmount) {
		double discountedPrice = totalAmount*0.10;
		return discountedPrice;
	}

}
