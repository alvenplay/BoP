package Release_VIII.A_Chapter_9.P9_Stackk;

import Release_VIII.A_Chapter_9.P7_Stack.*;

public class Demo {

	public static void main(String[] args) {
		Release_VIII.A_Chapter_9.P8_DynStack.DynStack ds;
		Stack s1 = new Stack(5);
		FixedStack s2 = new FixedStack(8);
		
		ds = s1;
		for(int i=0; i<12; i++) ds.push(i);

		ds = s2;
		for(int i=0; i<8; i++) ds.push(i);

		ds = s1;
		System.out.println("Wartosci na stosie dynamicznym: ");
		for(int i=0; i<12; i++) 
			System.out.print(ds.pop() +"  ");
		
		System.out.println();

		ds = s2;
		System.out.println("Wartosci na stosie stalym: ");
		for(int i=0; i<8; i++) 
			System.out.print(ds.pop() +"  ");
		
	}

}
