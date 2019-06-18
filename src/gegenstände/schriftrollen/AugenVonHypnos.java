package gegenstände.schriftrollen;

public class AugenVonHypnos extends Schriftrolle {

	public AugenVonHypnos(int id, int preis) {
		super(id, preis);
	}

	public void hypnos() {
		System.out.println("Monster wurden gelähmt.");
	}
}
