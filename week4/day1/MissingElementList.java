package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {

		int[] arg = { 1, 2, 3, 4, 10, 6, 8 };
		List<Integer> number = new ArrayList<Integer>();

		for (int i = 0; i < arg.length; i++) {
			number.add(arg[i]);

		}
		Collections.sort(number);
		System.out.println(number);// [1, 2, 3, 4, 6, 8, 10]
		int size1 = number.size();
		for (int j = 0; j < size1 - 1; j++) {

			int num1 = number.get(j);
			int num2 = number.get(j + 1);
			if ((num1 + 1) != (num2)) {
				System.out.println(num1 + 1);

			}

		}

	}
}


// other method
	
		/*int[] arg = { 1, 2, 3, 4, 10, 6, 8 };
		
        // Convert array to list
        List<int[]> asList = Arrays.asList(arg);
        
        // Find maximum value in the list
        int max = Collections.max(asList);
        
        // Loop from 1 to max and check which number is missing
        for (int i = 1; i <= max; i++) {
            if (!asList.contains(i)) {
                System.out.println("Missing element: " + i);
            }
        }
    }
}*/
