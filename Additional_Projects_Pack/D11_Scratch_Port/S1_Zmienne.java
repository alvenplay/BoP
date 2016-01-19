package Additional_Projects_Pack.D11_Scratch_Port;

import java.util.Random;
import java.util.Scanner;

public class S1_Zmienne {

	private static Scanner kb = new Scanner(System.in);
	static boolean theend = true;
	public static void main(String[] args) {
		do{
			Random r = new Random();
			int rand = r.nextInt(50-1+1)+1;
			boolean end = true;
			
			do{
				System.out.print("Jaka to liczba ? : ");
				int num = kb.nextInt();
				if(num>rand) {
					System.out.println("Za dużo.");
				} else
				if(num<rand) {
					System.out.println("Za mało.");		
				} else
				if(rand == num) {
					System.out.println("Brawo, zgadłeś.");
					end=false;
				}
			} while(end);
		} while(theend);
	}
}
