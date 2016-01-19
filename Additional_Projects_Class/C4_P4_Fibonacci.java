package Additional_Projects_Class;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class C4_P4_Fibonacci {
	
	
	public static void main(String args[]) {
		List<BigInteger> lista = new ArrayList<BigInteger>();
		lista.add(BigInteger.ZERO);
		lista.add(BigInteger.ONE);
		for(int i=0; i<=200 ; i++) {
			BigInteger a= lista.get(lista.size()-2).add(lista.get(lista.size()-1));
			lista.add(a);
			System.out.println("Nr. " +i +"\t to " +a);
		}
	}

}
