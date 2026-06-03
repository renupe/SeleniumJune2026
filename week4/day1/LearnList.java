package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		// Craete a List
		List<String> learnersName=new ArrayList<String>();
		System.out.println("The list is: "+learnersName);
		
		//add a data inside the List
		learnersName.add("Rajesh");
		System.out.println("The list is: "+learnersName);
		
		learnersName.add("Bharath");
		System.out.println("The list is: "+learnersName);
		
		learnersName.add("Maha");
		
		//Add duplicate
		learnersName.add("Bharath");
		System.out.println("The List is: "+learnersName);
		//  0         1       2      3       4
		//[Rajesh, Bharath,  Selvi ,Maha, Bharath]
		
		//add by index
		learnersName.add(2, "Selvi");
		System.out.println("The List is: "+learnersName);
		//   0        1        2    3       4
		//[Rajesh, Bharath, Selvi, Maha, Bharath]
		
		//Remove a data
		learnersName.remove(1);
		System.out.println("The list is : "+learnersName);
		
		//size method- to get the count of the data
		int sizeOfList = learnersName.size();
		System.out.println("The Size is: "+sizeOfList);
		//   0       1     2      3
		//[Rajesh, Selvi, Maha, Bharath]
		
		
		//To retrieve a particular data- get
		String dataAtIndex2 = learnersName.get(2);
		System.out.println("The data is: "+dataAtIndex2);
		
		//sort the List- Sort the List is Acsii order/Ascending order
		Collections.sort(learnersName);
		System.out.println("The List is: "+learnersName);
		
		//removeAll/clear
		learnersName.clear();
		System.out.println("The List is: "+learnersName);
		
		
		
		

	}
}
