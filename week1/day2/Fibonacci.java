package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		
	// 0,1,(0+1=1),(1+1=2),(2+1=3),(3+2=5),(5+3=8),(8+5=13),(8+13=21)
 int a=0;
 int b=1;
 System.out.println(a+"\n"+b);
;
 for (int i = 0; i <= 6; i++) {
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
				
}
	}
	 
}
