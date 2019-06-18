package laden;

import java.util.ArrayList;

import gegenst�nde.Ik�uflich;
import spieler.Spieler;

public class Laden {

	ArrayList<Ik�uflich> inventar = new ArrayList<Ik�uflich>();

	public Laden() {
		
	}

	public void buy(Spieler spieler, String item) {
		for(Ik�uflich k : inventar) {
			if(k.getClass().getSimpleName().equals(item)) {
				if(spieler.getGold()>k.getPreis()) {
					ArrayList<Ik�uflich> inventarSpieler = spieler.getRucksack();
					inventarSpieler.add(k);
					spieler.setRucksack(inventarSpieler);
					spieler.setGold(spieler.getGold()-k.getPreis());
					System.out.println("Item gekauft: " + k.getClass().getSimpleName());
					inventar.remove(k);
					return;
				}
				else {
					System.out.println("nicht genug Gold");
					return;
				}
			}
		}
	}
	
	public ArrayList<Ik�uflich> getInventar() {
		return inventar;
	}

	@Override
	public String toString() {
		String s = null;
		System.out.println("[" + this.getClass().getSimpleName() + "]");
		for(int j = 0; j<inventar.size(); j++) {
			System.out.println(inventar.get(j).getClass().getSimpleName());
		}
		System.out.println("\n");
		return s;
	}
}
