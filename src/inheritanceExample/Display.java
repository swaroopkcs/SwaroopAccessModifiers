package inheritanceExample;

public class Display {
	public static void main(String[] args) {
		System.out.println("Major Mobile Phone Types");
		Samsung samsung = new Samsung();
		Apple apple = new Apple();
		System.out.println("Samsung");
		samsung.takePhotos();
		samsung.castDevices();
		samsung.transferFiles();
		System.out.println("Apple");
		apple.takePhotos();
		apple.castDevices();
		apple.airDrop();
		S21Phone s21Phone = new S21Phone();
		s21Phone.nameOfModel = "Galaxy S21";
		System.out.println("The name of the model is: "+s21Phone.nameOfModel);
		s21Phone.takePhotos();
		s21Phone.uniqueFeature();
		Iphone13 iphone13 = new Iphone13();
		iphone13.IosVersion = "IOS13";
		System.out.println("The name of the model is: "+iphone13.IosVersion);
		iphone13.airDrop();
		iphone13.newDisplay();

	}

}
