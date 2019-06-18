package laden;

import java.util.Random;

import gegenstände.schriftrollen.AugenVonHypnos;
import gegenstände.schriftrollen.FluchDerSchreibfeder;
import gegenstände.schriftrollen.Schriftrolle;

public class Buchhandlung extends Laden {

	public Buchhandlung() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10) + 1;
		for(int i = 0; i<rand1; i++) {
			int rand2 = rand.nextInt(2);
			int rand3 = rand.nextInt(300) + 1;
			Schriftrolle sr;
			if(rand2 == 0) {
				sr = new FluchDerSchreibfeder(i, rand3);
			}
			else {
				sr = new AugenVonHypnos(i, rand3);
			}
			inventar.add(sr);
		}
	}
}
