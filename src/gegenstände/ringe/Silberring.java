package gegenstände.ringe;

public class Silberring extends Ring {

	int kampfstärke;

	public Silberring(int id, int preis, int kampfstärke) {
		super(id, preis);
		this.kampfstärke = kampfstärke;
	}

	public int getKampfstärke() {
		return kampfstärke;
	}
}
