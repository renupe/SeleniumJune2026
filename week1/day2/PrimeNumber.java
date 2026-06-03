package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 13;
		int count = 0;
        // iterate through all numbers from 2 to number -1(input)
		for (int i = 2; i <=number-1; i++) {
			// every number check if it divides number(input)
			if (number%i== 0) {
				count++;
				break;
			}

		}
		if (count == 0) {
			
			// if we find any number that divides, print non-prime
			System.out.println(number + " is  a prime number");
		} else {
			//if nothing divides, then print prime
			System.out.println(number + " is not a prime number");
		}

	}

}