package Release_VIII.B_Chapter_11_REP.R10_Deadlock;

public class A {

	synchronized void foo(B b) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name +" Wszedl do A.foo()");
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		System.out.println(name +" probuje wywolac B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Wewnatrz A.last()");
	}
}
