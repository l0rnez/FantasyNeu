package gegenstšnde.waffen;

public class Schwert extends Waffe {

	public Schwert(int id, int preis, int dmg) {
		super(id, preis, dmg);
	}

	public void use() {
		System.out.println("Schwert wurde benutzt.");
	}
}
