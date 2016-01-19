package Release_VIII.A_Chapter_8.R10_Override;

class A {
	int a, b;
	
	A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void show() {
		System.out.println("a = " +a +" | b = " +b);
	}
}

class B extends A{
	int c;
	
	B(int a, int b, int c) {
		super(a, b);
		this.c = c;
	}
	
	void show(String msg) {
		System.out.println(msg +c);
	}
}