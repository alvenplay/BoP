package Release_VIII.A_Chapter_7.R12_Access_Test;

public class Stack {

	public static void main(String[] args) {
		Test ms1 = new Test();
		Test ms2 = new Test();
		
		for(int i=0; i<10; i++) ms1.push(i);
		for(int i=10; i<20; i++) ms2.push(i);

		System.out.println("Stos ms1:");
		for(int i=0; i<10; i++)
			System.out.println(ms1.pup());
		
		System.out.println("Stos ms2:");
		for(int i=0; i<10; i++)
			System.out.println(ms2.pup());

	}

}
