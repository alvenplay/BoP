package Release_VIII.A_Chapter_7.R16_Stack;

public class Stack {

	public static void main(String[] args) {
		Test a1 = new Test(5);
		Test a2 = new Test(8);
		
		for(int i=0; i<5; i++) a1.push(i);
		for(int i=8; i<16; i++) a2.push(i);
		
		System.out.println("Stos a1: ");
		for(int i=0; i<a1.size(); i++)
			System.out.println(a1.pop());
		
		System.out.println("Stos a2: ");
		for(int i=0; i<a2.size(); i++)
			System.out.println(a2.pop());

	}

}
