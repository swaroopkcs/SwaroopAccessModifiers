package overridingExample;

public class CarsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsParent carsParent = new CarsParent();
		SuvCar suvCar = new SuvCar();
		SedanCar sedanCar = new SedanCar();
		System.out.println("Number of seats in a car");
		System.out.println("Let's see the number of seats in different cars.");
		carsParent.numberOfSeats();
		suvCar.numberOfSeats();
		sedanCar.numberOfSeats();

	}

}
