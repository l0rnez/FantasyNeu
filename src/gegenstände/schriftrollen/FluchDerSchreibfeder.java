package gegenstände.schriftrollen;

public class FluchDerSchreibfeder extends Schriftrolle {

	public FluchDerSchreibfeder(int id, int preis) {
		super(id, preis);
	}
	
	public void Fluch() {
		System.out.println("Alle Schwerter wurden zerstört.");
	}
}
