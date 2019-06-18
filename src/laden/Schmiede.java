package laden;

import java.util.Random;

import gegenstände.waffen.Bogen;
import gegenstände.waffen.Schwert;
import gegenstände.waffen.Waffe;

public class Schmiede extends Laden {

	public Schmiede() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10) + 1;
		for(int i = 0; i<rand1; i++) {
			int rand2 = rand.nextInt(2);
			int rand3 = rand.nextInt(300) + 1;
			Waffe waffe;
			if(rand2 == 0) {
				waffe = new Schwert(i, rand3, 1);
			}
			else {
				waffe = new Bogen(i, rand3, 1);
			}
			inventar.add(waffe);
		}
	}
}
