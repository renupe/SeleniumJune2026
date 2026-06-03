package week4.day1;

public class Concrete implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("connect");

	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");

	}

	@Override
	public void executeUpdate() {
		System.out.println("execution update");

	}

	public static void main(String[] args) {

		Concrete cc = new Concrete();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
	}

}
