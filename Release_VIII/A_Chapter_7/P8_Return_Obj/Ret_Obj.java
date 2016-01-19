package Release_VIII.A_Chapter_7.P8_Return_Obj;

public class Ret_Obj {

	public static void main(String[] args) {
		Test ob1 = new Test(2);
		Test ob2;
		
		ob2 = ob1.incrByTen();
		System.out.println("ob1.a == " +ob1.a);
		System.out.println("ob2.a == " +ob2.a);
		
		ob2 = ob2.incrByTen();
		System.out.println("ob2.a == " +ob2.a);

	}

}
