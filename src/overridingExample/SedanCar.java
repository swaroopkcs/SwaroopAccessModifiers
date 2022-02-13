package overridingExample;

public class SedanCar extends CarsParent{

	@Override
	public void numberOfSeats() {
		System.out.println("The number of seats in sedan is usually 4");
	}
	
}
