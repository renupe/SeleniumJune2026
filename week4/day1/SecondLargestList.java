package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestList {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		List<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			values.add(arr[i]);

		}
		Collections.sort(values);
		int length = values.size();
		System.out.println(values.get(length - 2));
	}
}
