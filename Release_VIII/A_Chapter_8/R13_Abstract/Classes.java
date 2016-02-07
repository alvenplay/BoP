package Release_VIII.A_Chapter_8.R13_Abstract;

abstract class A {
	abstract void callme();
	
	void callmetoo() {
		System.out.println("Konkretna metoda");
	}
}

class B extends A{
	void callme() {
		System.out.println("Implementacja z klasy B");
	}
}
