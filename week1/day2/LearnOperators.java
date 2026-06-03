package week1.day2;

public class LearnOperators {
	public static void main(String[] args) {
		// Assignment operator (=)
		int a = 7;

		// Arithmetic operator + - * /
		int b = 7;
		int c = 2;

		// addition (+)
		System.out.println(b + c);

		// Subraction (-)
		System.out.println(b - c);

		// multiplication (*)
		System.out.println(b * c);

		// division - remainder (%), quotient (/)
		System.out.println(b / c);
		System.out.println(b % c);

		System.out.println("----------------------------");

		// comparison operator-boolean
		

		int d = 3;
		int e = 4;
		// 3<4
		System.out.println(d < e); // true

		// 3>4
		System.out.println(d > e); // false

		// 3==4
		System.out.println(d == e); // false

		// 3<4 3==4
		System.out.println(d <= e); // true

		// 3>4 3==4
		System.out.println(d >= e); // false

		System.out.println(d != e); // true

		System.out.println("----------------");

		int x = 5;
		int y = 6;

		// Logical Operator And Or - Compare 2 Conditions

		// And && Condition1 and Condition2
		// 5>6 5<6
		System.out.println(x > y && x < y);

		// Or (||) Condition1 or Condition2
		// 5==6 5<6
		System.out.println(x == y || x < y);

		System.out.println("---------------------");

		int p = 7;

		// Increment/Decrement operator
		// Increment operator
		// postIncrement, preIncrement

		// postIncrement (p++) -Increase the value of variable by 1 in the next
		// iteration

		System.out.println(p++); // 7

		System.out.println(p); // 8

		// preIncrement (++p) -Increase the value of variable by 1 in the current
		// iteration

		System.out.println("The value is " + (++p)); // 9

		// postDecrement (p--) -=Decrease the value of variable by 1 in the next
		// iteration

		System.out.println(p--); // 9

		System.out.println(p); // 8

		// preDecrement (--p) -=Decrease the value of variable by 1 in the current
		// iteration

		System.out.println(--p); // 7

	}


}
