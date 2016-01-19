package Additional_Projects_Pack.C6_P1_List_stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Integer> cache = new ArrayList<Integer>();
	
	void push(int item) {
		cache.add(item);
	}
	
	int pop() {
		if(!cache.isEmpty()) {
			int i = cache.get(cache.size()-1);
			cache.remove(cache.size()-1);
			return i;
		} else {
			System.out.println("Stos jest pusty");
			return 0;
		}
	}
}
