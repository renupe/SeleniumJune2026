package week3.day1;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Store 5 scores of a person
				// index          0   1   2   3  4
				int scores[] = { 76, 67, 87, 90, 55 };
				
				// scores[0]=45;
				// scores[1]=67
				// scores[2]=87
				// scores[3]=90
				// scores[4]=100
				
				// length-to find the number of elements
				int length = scores.length;
				System.out.println("The length is : " + length);
				
				// To retrieve a particular value
				System.out.println(scores[3]);
				
				// print all the values
				//  0   1    2   3   4
				for (int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
					// System.out.println(scores[0]); //45
					// System.out.println(scores[1]); //67
					// System.out.println(scores[2]); //87
					// System.out.println(scores[3]); //90
					// System.out.println(scores[4]); //100
					
				}
				
				// Sort in ascending order
				Arrays.sort(scores);
				System.out.println(scores[0]);

			}
	}


