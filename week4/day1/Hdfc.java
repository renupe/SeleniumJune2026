package week4.day1;

public class Hdfc implements Rbi {
	public void mandatoryKyc() {
		System.out.println("Aadhaar is mandatory");
		
	}

	public void depositLimit() {
		System.out.println("20 Lakhs");
		
	}
	
	public static void main(String[] args) {
		Hdfc hdfcOptions =new Hdfc();
		hdfcOptions.mandatoryKyc();
		hdfcOptions.depositLimit();
		
	}
}
