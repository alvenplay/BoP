package Release_VIII.A_Chapter_9.P8_DynStack;

public class Demo {

	public static void main(String[] args) {
		Stack ms[] = new Stack[2];
		ms[0] = new Stack(5);
		ms[1] = new Stack(8);
		
		for(int i=0; i<2; i++){
			int size = ms[i].getStck().length+9;
			for(int j=0; j<size; j++)
				ms[i].push(j);
		}
		
		for(int i=0; i<2; i++){
			System.out.println("Stos ms[" +i +"]: ");
			for(int j=0; j<ms[i].getStck().length; j++)
				System.out.print(ms[i].pop() +"  ");
			System.out.println();
		}
		
	}

}
