package firstproject;

import java.util.*;

public class checkifnumisprime{
	
	static void checkIfPrime(int x) { // x must be positive
		
		List<Integer> factors = new ArrayList<Integer>(1);
		
		if (x >= 0) {
		
			if (x == 1) {
				System.out.println("1 is neither prime nor composite.");
			}
			
			else {
				for (int i = 2; i < x; i++) {
					if (x % i == 0) {
						if (i*i == x) { //perfect square, so add factor twice
							factors.add(i); 
						}
						factors.add(i);
					}
				}
			}
			factors.add(0, 1);
			factors.add(x);
			
			if (factors.size() < 3) {
				factors.add(1, x);
				System.out.println(String.format("%d is prime, so its factors are 1 and %d.", x, x));
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
