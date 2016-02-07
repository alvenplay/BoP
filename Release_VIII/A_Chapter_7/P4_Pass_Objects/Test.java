package Release_VIII.A_Chapter_7.P4_Pass_Objects;

public class Test {
	int a, b;
	
	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	boolean equals(Test obj) {
		if(this.a == obj.a && this.b == obj.b) {
			return true;
		} else {
			return false;
		}
	}
}
