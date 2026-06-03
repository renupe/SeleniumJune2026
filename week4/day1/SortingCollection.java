package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		//int[]num= {1,2,3}; if you want to add the array value into list using Arrays.asList then it should in wrraper class
		//Integer[]num={1,2,3};
		String[] arg = { "HCL", "Wipro", "Aspire Systems", "CTS" };
      // Convert array to list
		List<String> rev = new ArrayList<String>(Arrays.asList(arg));
	
		// Sort the list in ascending order
		Collections.sort(rev);
	
		int len = rev.size();
		
		// Iterate in reverse and print
		for (int j = len - 1; j >= 0; j--) {
			System.out.print(rev.get(j));
			if (j > 0) {
				System.out.print(",");
			}
		}

	}
}

//Other Method

/*
 * String[] arg = { "HCL", "Wipro", "Aspire Systems", "CTS" };
 * 
 * List<String> rev = new ArrayList<String>();
 * 
 * for (int i = 0; i < arg.length; i++) 
 * { rev.add(arg[i]);
 * 
 * }
 * 
 * 
 * //Sort the list in ascending order
 * Collections.sort(rev); 
 * 
 * int len = rev.size();
 * 
 * //Iterate in reverse and print 
 * 
 * for (int j = len - 1; j >= 0; j--) {
 * System.out.print(rev.get(j)); 
 * if(j>0) 
 * {System.out.print(","); } }
 * 
 * }
 */
