package Release_VIII.A_Chapter_7.S21_String_Demo;

public class String_Demo {

	public static void main(String[] args) {
		String str1 = "Pierwszy tekst";
		String str2 = "Drugi tekst";
		String str3 = str1;
		
		System.out.println("Dlugosc str1 = " +str1.length());
		System.out.println("Znak o indeksie 3 w str1 = " +str1.charAt(3));
		
		if(str1.equals(str2)) {
			System.out.println("Str1 = Str2");
		} else {
			System.out.println("Str1 != Str2");
		}
		
		if(str1.equals(str3)) {
			System.out.println("Str1 = Str3");
		} else {
			System.out.println("Str1 != Str3");
		}

	}

}
