package Release_VIII.B_Chapter_10.P6_Exception;

@SuppressWarnings("serial")
public class MyException extends Exception {
	private int detail;
	
	MyException(int a) {
		detail = a;
	}
	
	public String toString() {
		return "MyException[" +detail +" ]";
	}
}
