package Release_VIII.A_Chapter_8.R11_Dispatch;

class A {
	void callme() {
		System.out.println("CallMe klasy A");
	}
}

class B extends A {
	void callme() {
		System.out.println("CallMe klasy B");
	}
}

class C extends A {
	void callme() {
		System.out.println("CallMe klasy C");
	}
}