/*Create package name as week1.day1 under src/main/java
- Create a  new class as "Car" under week1.day1
- Create 2 methods(applyBreak(),soundHorn())
applyBreak(){print as Applied break}
soundHorn(){print as sound horn}
-Create another class as Bike
-Call the methods of Car class in BikeClass by creating object for Car class and Bike Class
Hint Create two objects for the two classess*/

package week2.day2;

public class Car {

	public void applyBreak() {
		System.out.println("Applied break");
		
	}
	public void soundHorn() {
		System.out.println("Sound horn");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ca = new Car();
		ca.applyBreak();
		ca.soundHorn();

	}

}
