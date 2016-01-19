package Release_VIII.A_Chapter_9.P9_Stackk;

public class Stack implements Release_VIII.A_Chapter_9.P8_DynStack.DynStack {
	
	private int stck[];
	private int tos;
	
	public Stack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		if(tos == stck.length-1) {
			int temp[] = new int[stck.length*2];
			for(int i=0; i<stck.length; i++) temp[i] = stck[i];
			stck = temp;
			stck[++tos] = item;
		} else {
			stck[++tos] = item;
		}
		
	}

	@Override
	public int pop() {
		if(tos < 0) {
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
