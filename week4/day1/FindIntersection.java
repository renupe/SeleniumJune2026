package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = { 3, 2, 11, 4, 6, 7 };
		int[] b = { 1, 2, 8, 4, 9, 7 };
		// Add elements of array a to aValue
		List<Integer> aValue = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			aValue.add(a[i]);
		}
		Collections.sort(aValue);
		// Add elements of array b to bValue
		List<Integer> bValue = new ArrayList<Integer>();
		for (int j = 0; j < b.length; j++) {
			bValue.add(b[j]);
		}

		Collections.sort(bValue);

		int size1 = aValue.size();
		int size2 = bValue.size();

		for (int k = 0; k < size1; k++) {
			for (int l = 0; l < size2; l++) {

				if (aValue.get(k) == bValue.get(l)) {
					System.out.println(aValue.get(k));
				}
			}

		}

		// aValue.retainAll(bValue);//retainAll() keeps only the elements that are
		// common in both lists
		// System.out.println("Intersection elements: " + aValue);//output: Intersection
		// elements: [2, 4, 7]

	}

}
