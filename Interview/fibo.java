package Interview;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13
int a=0;
int b=1;

int c=0;
System.out.println(a+"\n"+b);
for(int i=0;i<6;i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}

	}

}
