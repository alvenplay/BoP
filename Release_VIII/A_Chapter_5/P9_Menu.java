package Release_VIII.A_Chapter_5;

import java.io.IOException;

public class P9_Menu {

	public static void main(String[] args) throws IOException {
		char choice;
		
		do {
			System.out.println("Pomoc na temat: ");
			System.out.println("  1. if");
			System.out.println("  2. switch");
			System.out.println("  3. while");
			System.out.println("  4. do-while");
			System.out.println("  5. for" +"\n");
			choice = (char) System.in.read();
		} while(choice<'1' || choice>'5');
		
		System.out.println("\n");
		
		switch(choice) {
			case '1':
				System.out.println("Konstrukcja if: \n");
				System.out.println("if(warunek) { instrukcja} else { instrukcja};");
				break;
			case '2':
				System.out.println("Konstrukcja switch: \n");
				System.out.println("switch(wyrazenie) { case stala: instrukcja; break; };");
				break;
			case '3':
				System.out.println("Petla while: \n");
				System.out.println("while(warunek) { instrukcja};");
				break;
			case '4':
				System.out.println("Petla do-while: \n");
				System.out.println("do {instrukcja} while(warunek);");
				break;
			case '5':
				System.out.println("Petla for: \n");
				System.out.println("for( inicjalizacja; warunek; interacja) { instrukcja};");
				break;
		}

	}

}
