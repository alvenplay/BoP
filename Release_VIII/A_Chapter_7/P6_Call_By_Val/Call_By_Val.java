package Release_VIII.A_Chapter_7.P6_Call_By_Val;

public class Call_By_Val {

	public static void main(String[] args) {
		Test ob = new Test();
		
		int a=15, b=20;
		
		System.out.println("a == " +a +" b == " +b);
		
		ob.meth(a, b);
		
		System.out.println("a == " +a +" b == " +b);
		
	}

}
