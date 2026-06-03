package week4.day1;

public class AxisImplementation extends Axis {
	@Override
	public void mandatoryKyc() {
		System.out.println("Driving License");
		
	}

	@Override
	public void depositLimit() {
		System.out.println("50 Lakhs");
		
	}

	@Override
	public void houseLoan() {
		System.out.println("1 Crore");
		
		
	}
	
	public void carLoan() {
		super.carLoan();
		System.out.println("30 Lakhs");
	}
	
	public static void main(String[] args) {
		AxisImplementation axisOptions=new AxisImplementation();
		axisOptions.mandatoryKyc();
		axisOptions.depositLimit();
		axisOptions.houseLoan();
		axisOptions.carLoan();
	}

}





//AxisImplementation extends Axis implements Rbi

