package Additional_Projects_Class;

import java.util.ArrayList;
import java.util.List;

public class C5_P2_For_Each_List {

	public static void main(String[] args) {
		List<Integer> cache = new ArrayList<Integer>();
		int sum=0;
		
		for(int i=0; i<=10; i++) {
			cache.add(i);
		}
		
		for(int x : cache) {
			sum+=x;
		}
		
		System.out.println("Wartosc to " +sum);

	}

}
