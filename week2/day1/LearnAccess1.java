package week2.day1;

public class LearnAccess1 {
	// Deposit and Withdraw money
		// Deposit - anyone-public
		// withdraw- account holder-private

		public void depositMoney() {

			System.out.println("Deposit amount");
		}

		private void withdrawMoney() {
			System.out.println("Withdraw amount");

		}
		
		public static void main(String[] args) {
			LearnAccess1 accOptions=new LearnAccess1();
			accOptions.depositMoney();
			accOptions.withdrawMoney();
		}
}
