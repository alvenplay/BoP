package Release_VIII.B_Chapter_13.P2_BRReadLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		do {
			str = (String) br.readLine();
			System.out.println(str);
		} while(!str.equalsIgnoreCase("stop"));
	}

}
