package week1.day2;

public class Mobile {
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public void takePhoto() {
		System.out.println("Take photo");

	}
	
	public static void main(String[] args) {
		//ClassName objectName=new ClassName();
		Mobile mobileOptions=new Mobile();
		mobileOptions.makeCall();
		mobileOptions.takePhoto();
}
}
