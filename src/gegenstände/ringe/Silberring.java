package gegenst�nde.ringe;

public class Silberring extends Ring {

	int kampfst�rke;

	public Silberring(int id, int preis, int kampfst�rke) {
		super(id, preis);
		this.kampfst�rke = kampfst�rke;
	}

	public int getKampfst�rke() {
		return kampfst�rke;
	}
}
