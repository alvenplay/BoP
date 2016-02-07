package Release_VIII.B_Chapter_13.P6_ShowFile;

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile {
	
	public static void main(String[] args) {
		int i;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/Release_VIII/B_Chapter_13/P6_ShowFile/test.txt");
			do {
				i = fin.read();
				if(i != -1) System.out.print((char) i);
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("Blad odczytu pliku");
		} finally {
			try {
				if(fin != null) fin.close();
			} catch(IOException e) {
				System.out.println("Blad zamykania pliku");
			}
		}
	}

}
