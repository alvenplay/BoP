package Additional_Projects_Class;

import java.util.ArrayList;
import java.util.List;

public class C5_P1_Uni_Switch {

	public static void main(String[] args) {
		List<String> months = new ArrayList<String>();
			months.add("Styczen"); months.add("Luty"); months.add("Marzec"); months.add("Kwiecien"); months.add("Maj");	months.add("Czerwiec");	months.add("Lipiec"); months.add("Sierpien"); months.add("Wrzesien"); months.add("Pazdziernik"); months.add("Listopad"); months.add("Grudzien");
		List<Integer> days = new ArrayList<Integer>();
			days.add(31); days.add(28); days.add(31); days.add(30);	days.add(31); days.add(30); days.add(31); days.add(31); days.add(30); days.add(31); days.add(30); days.add(31); 
		List<String> season = new ArrayList<String>();
			season.add("zima"); season.add("zima"); season.add("wiosna"); season.add("wiosna"); season.add("wiosna"); season.add("lato"); season.add("lato"); season.add("lato"); season.add("jesien"); season.add("jesien"); season.add("jesien"); season.add("zima");
			
		int month = 2;
		
		try {
			System.out.println(months.get(month-1) +" posiada " +days.get(month-1) +" dni oraz jest to pora roku " +season.get(month-1) +".");
		} catch(Exception e) {
			System.out.println("Bledny miesiac.");
		}

	}

}
