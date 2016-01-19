package Release_VIII.A_Chapter_7.R17_Inner_Class;

public class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner {
		void display() {
			System.out.println("display: outer_x = " +outer_x);
		}
	}
}
