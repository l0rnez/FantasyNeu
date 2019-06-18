package laden;

import java.util.Random;

import gegenstände.ringe.Goldring;
import gegenstände.ringe.Ring;
import gegenstände.ringe.Silberring;

public class Juwelier extends Laden {

	public Juwelier() {
		Random rand = new Random();
		int rand1 = rand.nextInt(10) + 1;
		for(int i = 0; i<rand1; i++) {
			int rand2 = rand.nextInt(2);
			int rand3 = rand.nextInt(300) + 1;
			Ring ring;
			if(rand2 == 0) {
				ring = new Silberring(i, rand3, 1);
			}
			else {
				ring = new Goldring(i, rand3);
			}
			inventar.add(ring);
		}
	}
}
