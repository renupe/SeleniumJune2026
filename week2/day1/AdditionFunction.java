package week2.day1;

public class AdditionFunction {

	
		
		public int addTwoNumbers(int a, int b) {

			int c = a + b;
			System.out.println(c);
			return c;

		}

		public static void main(String[] args) {
			AdditionFunction addOptions = new AdditionFunction();
			int c = addOptions.addTwoNumbers(5, 15);
			

		}

	}


