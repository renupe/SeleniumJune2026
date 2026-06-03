package week2.day1;

public class Iphone {
	
	public void takePhoto() {
		int number = 7;
		System.out.println(number);

	}

	public void makeCall(int number, String name) {

		System.out.println(number + " " + name);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone iosOptions = new Iphone();
		iosOptions.takePhoto();
		iosOptions.makeCall(7, "Vineeth");
		iosOptions.makeCall(10, "Mahi");


	}

}
