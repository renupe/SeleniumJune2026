package week3.day1;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arg= {1,4,3,2,8,6,7};
		Arrays.sort(arg); //{1,2,3,4,6,7,8}
		
		for (int i = 0; i < arg.length; i++) {
			int j=i+1;
			
			if (arg[i]!=j) {
				System.out.println("missing number is " +j);
			
				break;
			
			
		}
		

	}

}
}