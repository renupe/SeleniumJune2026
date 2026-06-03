package week4.day1;

public interface DatabaseConnection {
abstract public void connect();
abstract public void disconnect();
abstract public void executeUpdate();

}
