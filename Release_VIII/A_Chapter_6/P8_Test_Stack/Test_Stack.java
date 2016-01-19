package Release_VIII.A_Chapter_6.P8_Test_Stack;

public class Test_Stack {

	public static void main(String[] args) {
		Stack ms1 = new Stack();
		Stack ms2 = new Stack();
		
		for(int i=0; i<10; i++) ms1.push(i);
		for(int i=10; i<20; i++) ms2.push(i);
		
		System.out.println("Stos ms1: ");
		for(int i=0; i<10; i++) {
			System.out.println(ms1.pop());
		}
		
		System.out.println("Stos ms2: ");
		for(int i=0; i<10; i++) {
			System.out.println(ms2.pop());
		}

	}

}
