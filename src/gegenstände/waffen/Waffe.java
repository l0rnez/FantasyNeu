package gegenstšnde.waffen;

import gegenstšnde.Item;

public class Waffe extends Item {

	int dmg;

	public Waffe(int id, int preis, int dmg) {
		super(id, preis);
		this.dmg = dmg;
	}
}
