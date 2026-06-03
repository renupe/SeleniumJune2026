package week4.day1;

public abstract class MySqlConnection implements DatabaseConnection{
	
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
		System.out.println("execution updates");
	}

	 abstract public void executeQuery();
	

}
