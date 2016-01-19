package Release_VIII.A_Chapter_9.R10_Cons;

import java.util.Random;

public class Questions implements SharedCons {
	Random rand = new Random();
	int ask() {
		int prob = (int) (100*rand.nextDouble());
		if(prob<30) return NO;         //30%
		else if(prob<60) return YES;   //30%
		else if(prob<70) return MAYBE; //10%
		else if(prob<85) return LATER; //15%
		else if(prob<98) return SOON;  //13%
		else return NEVER;			   //2%
	}
}
