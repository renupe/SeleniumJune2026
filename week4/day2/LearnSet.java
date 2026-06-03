package week4.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare Set
				//HashSet
				//  0         1          2         3
				//[Vinoth, Harrish, Bhuvanesh, Seenivasan]
				//Set<String> mentors=new HashSet<String>();
				//TreeSet
				//    0          1         2         3
				//[Bhuvanesh, Harrish, Seenivasan, Vinoth]
				//Set<String> mentors=new TreeSet<String>();
				//LinkedHashSet
				
			//     0          1        2         3	
		  //	[Vinoth, Seenivasan, Harrish, Bhuvanesh]
				Set<String> mentors=new LinkedHashSet<String>();
				System.out.println("The set is: "+mentors);
				
				mentors.add("Vinoth");
				mentors.add("Seenivasan");
				mentors.add("Harrish");
				mentors.add("Bhuvanesh");
				
				
				System.out.println("The set is: "+mentors);
				
				//To count the number of the data
				int sizeOfSet = mentors.size();
				System.out.println("The size is: "+sizeOfSet);
				
				//add a duplicate data
				mentors.add("harrish");
				System.out.println("The Set is: "+mentors);
				
				//remove the data
				mentors.remove("Harrish");
				System.out.println("The set is: "+mentors);
				
				
				//To retrieve a particular data-get
				//Convert the Set into List-copy all the data from Set to List
				
				//Declare an empty List
				List<String> trainers=new ArrayList<String>(mentors);
				System.out.println("The List is : "+trainers);
				
				
				String string = trainers.get(0);
				System.out.println(string);
				
				
				mentors.clear();
				System.out.println("The mentors set is: "+mentors);
				
				
				
				
				
	}

}
