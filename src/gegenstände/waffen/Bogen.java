package gegenstšnde.waffen;

public class Bogen extends Waffe {

	int preis;

	public Bogen(int id, int preis, int dmg) {
		super(id, preis, dmg);
	}

	public void use() {
		System.out.println("Bogen wurde benutzt.");
	}
}
