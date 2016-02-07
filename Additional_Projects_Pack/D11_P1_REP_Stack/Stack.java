package Additional_Projects_Pack.D11_P1_REP_Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	private List<Integer> stac = new ArrayList<Integer>();
	
	public void push(int liczba) {
		stac.add(liczba);
	}
	
	public Integer pull() {
		if(stac.isEmpty()) {
			return null;
		} else {
			int i= stac.get(stac.size()-1);
			stac.remove(stac.size()-1);
			return i;
		}
	}
}
