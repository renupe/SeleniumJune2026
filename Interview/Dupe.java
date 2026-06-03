package Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dupe {

	public static void main(String[] args) {
 String text="Programming";
 char[] charArray = text.toCharArray();
 Set<Character> dup=new LinkedHashSet<>();
 for (Character ch :charArray ) {
	 dup.add(ch);
	
}
 System.out.println(dup);
for (Character ca : dup) {
	System.out.print(ca);
}
 

	}

}
