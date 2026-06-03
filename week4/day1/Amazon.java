package week4.day1;

public class Amazon extends CanaraBank{
	@Override
	public void cashOnDelivery() {
		System.out.println("cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("upi payment");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("card paynment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("internet banking");
		
	}

	
	public static void main(String[] args) {
		Amazon az= new Amazon();
		az.recordPaymentDetails();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
	}

	
	

}
