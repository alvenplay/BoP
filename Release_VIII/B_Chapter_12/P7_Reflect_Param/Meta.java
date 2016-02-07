package Release_VIII.B_Chapter_12.P7_Reflect_Param;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}

public class Meta {

	@MyAnno(str="Dwa parametry", val = 19)
	public static void myMeth(String str, int i) {
		Meta ob = new Meta();
		
		try {
			Class<? extends Meta> c = ob.getClass();
			Method m = c.getMethod("myMeth", String.class, int.class);
			MyAnno anno = m.getAnnotation(MyAnno.class);
			
			System.out.println(anno.str() +" " +anno.val());
		} catch (NoSuchMethodException e) {
			System.out.println("Nie znaleziono metody");
		}
	}
	
	public static void main(String[] args) {
		myMeth("test", 10);
	}

}
