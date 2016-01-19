package Release_VIII.A_Chapter_7.P8_Return_Obj;

public class Test {
	int a;
	
	Test(int a) {
		this.a = a;
	}
	
	Test incrByTen() {
		Test temp = new Test(a+10);
		return temp;
	}
}
