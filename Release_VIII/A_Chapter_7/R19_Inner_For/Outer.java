package Release_VIII.A_Chapter_7.R19_Inner_For;

public class Outer {
	int outer_x = 100;
	
	void test() {
		for(int i=0; i<5; i++) {
			class Inner {
				void display() {
					System.out.println("display: outer_x = " +outer_x);
				}
			}
			Inner inner = new Inner();
			inner.display();
		}
	}
}
