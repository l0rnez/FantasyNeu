package gegenstände.ringe;

public class Goldring extends Ring {

	public Goldring(int id, int preis) {
		super(id, preis);
	}

	public void use() {
		System.out.println("Monster gezähmt.");
	}
}
