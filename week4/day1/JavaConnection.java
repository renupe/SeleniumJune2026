package week4.day1;

public class JavaConnection extends MySqlConnection {
	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("execute query");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection jc = new JavaConnection();
		jc.executeQuery();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

}
