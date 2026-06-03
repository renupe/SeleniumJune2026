package Interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOcurrance {

	public static void main(String[]args) {
		String str= "automation";
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map= new LinkedHashMap<>();
		
		for(char ch: charArray) {
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch,1);
			}
			
		
		}
		System.out.println(map);
		
	}
}
