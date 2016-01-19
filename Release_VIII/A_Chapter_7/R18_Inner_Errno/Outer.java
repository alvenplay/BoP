package Release_VIII.A_Chapter_7.R18_Inner_Errno;

public class Outer {
	int outer_x = 100;
	
	void test() {
		Inner inner = new Inner();
		inner.display();
	}
	
	int getY() {
		System.out.println(/*y*/);
		return 0; //Error fix
	}
	
	class Inner {
		int y = 10;
		
		void display() {
			System.out.println("display: outer_x = " +outer_x);
		}
	}
}
