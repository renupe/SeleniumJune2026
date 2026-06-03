package Interview;

public class BubbleSort {

	public static void main(String[] args) {
		int[]arg= {2,5,4,3,8};
		
		for(int i=0;i<arg.length;i++) {
			
			for(int j=0; j<arg.length-1;j++) {
				if(arg[j]>arg[j+1]) {
					int temp=arg[j];
					arg[j]=arg[j+1];
					arg[j+1]=temp;
				}
				
			}
		}
		
		for (int ch: arg) {
			System.out.print(ch+" ");
		}

	}

}
