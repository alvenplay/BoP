package Release_VIII.A_Chapter_9.P7_Stack;

public class StackDemo {
	
	private static boolean FUNCTION = false;          //true = fs[i] || false = fs1 & fs2
	
	public static void main(String[] args) {
		if(FUNCTION) {
				FixedStack fs[] = new FixedStack[2];
				fs[0] = new FixedStack(5);
				fs[1] = new FixedStack(8);
				
				for(int i=0; i<2; i++)
					for(int j=0; j<fs[i].getStck().length; j++)
						fs[i].push(j);
				
				for(int i=0; i<2; i++) {
					System.out.println("Stos fs[" +i +"]: ");
					for(int j=0; j<fs[i].getStck().length; j++)
						System.out.println(fs[i].pop());
					
				}
		} else {
				FixedStack fs1 = new FixedStack(5);
				FixedStack fs2 = new FixedStack(8);
				
				for(int i=0; i<5; i++) fs1.push(i);
				for(int i=0; i<8; i++) fs2.push(i);
				
				System.out.print("Stos fs1: \n");
				for(int i=0; i<5; i++) System.out.println(fs1.pop());
	
				System.out.print("Stos fs2: \n");
				for(int i=0; i<8; i++) System.out.println(fs2.pop());
				
		}
	}

}
