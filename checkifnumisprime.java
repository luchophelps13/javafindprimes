package firstproject;

import java.util.*;

public class checkifnumisprime{
	
	
	static void checkIfPrime(int x) { // x must be positive
		
		List<Integer> factors = new ArrayList<Integer>(1);;
		
		if (x >= 0) {

		
			if (x == 1) {
				System.out.println("1 is neither prime nor composite.");
			}
			
			else {
				for (int i = 2; i < x; i++) {
					if (x % i == 0) {
						factors.add(i);
					}
					else {
					}
				}
			}
			factors.add(0, 1);
			factors.add(x);
			
			if (factors.size() < 3) {
				factors.add(1, x);
				System.out.println(String.format("%d is prime.", x));
			}
			else {
				System.out.println(String.format("%d is not prime. Its factors are: ", x));
				for (int i = 0; i < factors.size(); i++) {
					System.out.println(String.format("%d", factors.get(i)));
				}
			}		
			
		}
		
		else {
			System.out.println("Argument cannot be a negative number.");
		}
	}
	
	public static void main(String[] args) {
		checkIfPrime(); // <- INSERT NUMBER HERE!
	}

}
