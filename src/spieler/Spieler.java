package spieler;

import java.util.ArrayList;
import gegenstände.Ikäuflich;
import laden.Buchhandlung;
import laden.Juwelier;
import laden.Schmiede;

public class Spieler {

	String name;
	int gold;
	int kampfstärke;
	ArrayList<Ikäuflich> rucksack = new ArrayList<Ikäuflich>();

	public Spieler(String name, int gold, int kampfstärke) {
		this.name = name;
		this.gold = gold;
		this.kampfstärke = kampfstärke;
	}

	public ArrayList<Ikäuflich> getRucksack() {
		return rucksack;
	}
	
	@Override
	public String toString() {
		String s = "[Rucksack]\n";
		System.out.println(s);
		for(Ikäuflich k : rucksack) {
			System.out.println(k.getClass().getSimpleName());
		}
		System.out.println("\n");
		return s;
	}

	public void setRucksack(ArrayList<Ikäuflich> rucksack) {
		this.rucksack = rucksack;
	}

	public int getGold() {
		return gold;
	}

	public int getKampfstärke() {
		return kampfstärke;
	}

	public void setKampfstärke(int kampfstärke) {
		this.kampfstärke = kampfstärke;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public void buy(Buchhandlung buch, Juwelier juwelier, Schmiede schmiede, String laden) {
		if(laden.equals("Buchhandlung")) {
			
		}
		if(laden.equals("Juwelier")) {
			
		}
		if(laden.equals("Schmiede")) {
		
		}
	}
}
