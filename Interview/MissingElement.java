package Interview;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[]ele= {2,5,6,7,4};
 Arrays.sort(ele);//{2,4,5,6,7}
 int min= ele[0];
 for (int i=0;i<ele.length;i++) {
	 int j=min+i;
	 if(ele[i]!=j) {
		 System.out.println("missing element is "+j);
		 break;
	 }
	 
	 
 }
	}

}
