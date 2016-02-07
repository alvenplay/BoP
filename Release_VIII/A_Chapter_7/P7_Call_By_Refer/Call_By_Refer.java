package Release_VIII.A_Chapter_7.P7_Call_By_Refer;

public class Call_By_Refer {
	
	public static void main(String[] args) {
		Test ob = new Test(15, 20);

		System.out.println("a == " +ob.a +" b == " +ob.b);
		
		ob.meth(ob);
		
		System.out.println("a == " +ob.a +" b == " +ob.b);
		
	}
	
}
