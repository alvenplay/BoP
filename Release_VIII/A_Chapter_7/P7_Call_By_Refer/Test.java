package Release_VIII.A_Chapter_7.P7_Call_By_Refer;

public class Test {
	int a, b;
	
	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void meth(Test object) {
		object.a *= 2;
		object.b *= 2;
	}
}
