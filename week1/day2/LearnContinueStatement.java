package week1.day2;

public class LearnContinueStatement {
public static void main(String[] args) {
		
		//   1   2  3   4   5
		//That iteration alone will be skipped
		
		for (int i = 1; i <=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}

	}
}
