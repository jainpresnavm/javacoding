package week2.day2;

public class Bike {

	private Car car = new Car();
	
	public static void main(String[] args) {
		Bike bike = new Bike();
		/*Car ca = new Car();
		ca.applyBreak();
		ca.soundHorn();*/
		bike.car.applyBreak();
		bike.car.soundHorn();
		
	}

}
