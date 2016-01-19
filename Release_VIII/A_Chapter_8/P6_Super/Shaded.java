package Release_VIII.A_Chapter_8.P6_Super;

public class Shaded {
	
	public static void main(String[] args) {
		B b = new B(10, 12);
		
		b.show();
	}
	
}
class A {
	int a;
}
class B extends A {
	int a;
	
	B(int a, int a2) {
		super.a = a;
		this.a = a2;
	}
	
	void show() {
		System.out.println("super.a = " +super.a);
		System.out.println(" this.a = " +a);
	}
}