package Release_VIII.B_Chapter_11_REP.R10_Deadlock;

public class B {

	synchronized void bar(A a) {
		String name = Thread.currentThread().getName();
		
		System.out.println(name +" Wszedl do B.bar()");
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		System.out.println(name +" probuje wywolac A.last()");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Wewnatrz B.last()");
	}
}
