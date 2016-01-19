package Release_VIII.A_Chapter_9.P7_Stack;

import Release_VIII.A_Chapter_9.P8_DynStack.*;

public class FixedStack implements DynStack {
	private  int stck[];
	private int tos;
	
	public FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		if(tos == stck.length-1) {
			System.out.println("Stos jest pelny.");
		} else {
			stck[++tos] = item;
		}
	}

	@Override
	public int pop() {
		if(tos == -1) {
			System.out.println("Stos jest pusty.");
			return 0;
		} else {
			return stck[tos--];
		}
	}

	public int[] getStck() {
		return stck;
	}

}
