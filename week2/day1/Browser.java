package week2.day1;

public class Browser {

	public void launchBrowser(String browserName) {
		System.out.println(browserName);

	}

	public String loadUrl() {
	   return "url loaded successfully";
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Browser name = new Browser();
		name.launchBrowser("chrome");
		System.out.println(name.loadUrl());

	}

}
