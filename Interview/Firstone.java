package Interview;

public class Firstone {

	public static void main(String[] args) {
		String text ="Good Morning Java";
		String[] words = text.split(" ");
		String text1=words[1];
		for(int j=0;j<words.length;j++) {
			if(j==1) {
				for(int i=text1.length()-1;i>=0;i--) {
					System.out.print(text1.charAt(i));
				}
				System.out.print(" ");
			}else {
			
			System.out.print(words[j]+" ");
		}
		
//		for(int i=text1.length()-1;i>=0;i--) {
//			System.out.print(text1.charAt(i));
//		}

	}

}
}
