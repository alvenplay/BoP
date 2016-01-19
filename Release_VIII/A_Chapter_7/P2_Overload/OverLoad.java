package Release_VIII.A_Chapter_7.P2_Overload;

public class OverLoad {
	void test() {
		System.out.println("Brak parametrow");
	}
	
	void test(int a) {
		System.out.println("Param a = " +a);
	}
	
	void test(int a, int b) {
		System.out.println("Param a = " +a +" Param b = " +b);
	}
	
	void test(double a) {
		System.out.println("Param double = " +a);
	}
}
