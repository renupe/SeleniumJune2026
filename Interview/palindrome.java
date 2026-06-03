package Interview;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "madam";
String rev="";
for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
}
if(str.equals(rev)) {
	System.out.println(str+ " is a palindrome");
}
else {
	System.out.println(str+ " not a palindrome");
}
	
	}

}
