package Release_VIII.A_Chapter_8.R11_Dispatch;

public class Dispatch {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		
		r = a;
		r.callme();
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();

	}

}
