package Release_VIII.B_Chapter_13.P1_BRRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

	public static void main(String[] args) throws IOException {
		char c;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("q = quit");
		
		do {
			c = (char) br.read();
			System.out.println(c);
		} while(c != 'q');
	}

}
