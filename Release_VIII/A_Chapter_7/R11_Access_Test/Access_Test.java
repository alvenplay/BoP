package Release_VIII.A_Chapter_7.R11_Access_Test;

public class Access_Test {

	public static void main(String[] args) {
		Test ob = new Test();
		
		ob.a = 10;
		ob.b = 20;
	  //ob.c = 30;
		
		ob.set(30);
		
		System.out.println("a = " +ob.a +"\nb = " +ob.b +"\nc = " +ob.getc());

	}

}
