package laden;

import java.util.ArrayList;

import gegenstände.Ikäuflich;
import spieler.Spieler;

public class Laden {

	ArrayList<Ikäuflich> inventar = new ArrayList<Ikäuflich>();

	public Laden() {
		
	}

	public void buy(Spieler spieler, String item) {
		for(Ikäuflich k : inventar) {
			if(k.getClass().getSimpleName().equals(item)) {
				if(spieler.getGold()>k.getPreis()) {
					ArrayList<Ikäuflich> inventarSpieler = spieler.getRucksack();
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
	
	public ArrayList<Ikäuflich> getInventar() {
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
