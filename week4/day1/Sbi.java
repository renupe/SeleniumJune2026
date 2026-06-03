package week4.day1;

public class Sbi implements Rbi{
	public static void main(String[] args) {
		Sbi sbiOptions = new Sbi();
		sbiOptions.mandatoryKyc();

	}

	@Override
	public void mandatoryKyc() {
		System.out.println("mandatoryKyc");

	}

	@Override
	public void depositLimit() {
		System.out.println("depositLimit");

	}
}
