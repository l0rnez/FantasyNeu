package gegenst�nde;

public class Item implements Ik�uflich {

	int id;
	int preis;

	public Item(int id, int preis) {
		this.id = id;
		this.preis = preis;
	}
	
	public int getId() {
		return id;
	}
	
	public int getPreis() {
		return preis;
	}
}
