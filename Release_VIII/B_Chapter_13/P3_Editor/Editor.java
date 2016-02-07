package Release_VIII.B_Chapter_13.P3_Editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Editor {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		
		System.out.println("Wpisz wiersze tekstu \n Wpisz 'stop' aby wyjsc.");
		
		for(int i=0; i<100; i++) {
			str[i] = br.readLine();
			if(str[i].equals("stop")) break;
		}
		
		System.out.println("Wynik");
		
		for(String s : str) {
			if(s.equalsIgnoreCase("stop")) break;
			System.out.println(s);
		}
	}

}
