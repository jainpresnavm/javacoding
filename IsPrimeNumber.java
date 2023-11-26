package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
            int n=2;
		    boolean isPrime=true;
		for (int i=2;i<=n-1;i++) {
			
			if(n%i==0) {
				
				isPrime=false;
				
			}
				
		}
		
	       if(isPrime) {
	    	   
	    	   System.out.println("prime number");
	       }else {
				
				System.out.println("Not a prime number");	
			}
	}
}
