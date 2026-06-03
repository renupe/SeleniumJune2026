package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// input to assign the given number
		int input=121;
		// output to store the reversed form of input number
		int output=0;
		
		for (int i = input; i >0; i=i/10) {
		
			//Extract the last digit using modulus
			
			int reminder =i%10;
			
			// Build Reversed number
			
			output=(output*10+ reminder);
			
		}
		
		if(input==output) {
			
			System.out.println(input+" is a palindrome");
		}
	}
	
	
	
}
