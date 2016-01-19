package Additional_Projects_Pack.D11_Scratch_Port;

import java.util.Scanner;

public class S2_Sex {
	
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Jak masz na imie ? : ");
		String imie = kb.next();
		System.out.println("Witaj, " +imie);
		
		if(!imie.toLowerCase().endsWith("a")) {
			if(imie.equalsIgnoreCase("maria")) {
				System.out.println("ERROR !!!!");
			} else {
			System.out.println("Jesteś chłopakiem.");
			}
		} else {
			System.out.println("Jesteś dziewczyną.");
		}
	}
}
