package week2.day2;

/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console*/



public class Mobile {
	
public void makeCall() {
	String mobileModel="Samsung";
	float mobileWeight=5.6f;
	System.out.println(mobileModel);
	System.out.println(mobileWeight);
}

public void sendMsg() {
	boolean isFullCharged = true;
	int mobileCost= 5000;
	System.out.println(mobileCost);
	System.out.println(isFullCharged);
	
}	

	public static void main(String[] args) {
		Mobile mob = new Mobile();
		System.out.println("This is my mobile");
		mob.makeCall();
		mob.sendMsg();
		
		

	}

}
