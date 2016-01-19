package Release_VIII.B_Chapter_10.P6_Exception;

public class ExcDemo {

	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		} catch(MyException e) {
			System.out.println("Zlapano: " +e);
		}

	}
	
	static void compute(int a) throws MyException {
		System.out.println("Wywolanie compute(" +a +")");
		if(a>10)
			throw new MyException(a);
		System.out.println("Normalne wyjscie");
	}

}
