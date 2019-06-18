package spieler;

import java.util.ArrayList;
import gegenst�nde.Ik�uflich;
import laden.Buchhandlung;
import laden.Juwelier;
import laden.Schmiede;

public class Spieler {

	String name;
	int gold;
	int kampfst�rke;
	ArrayList<Ik�uflich> rucksack = new ArrayList<Ik�uflich>();

	public Spieler(String name, int gold, int kampfst�rke) {
		this.name = name;
		this.gold = gold;
		this.kampfst�rke = kampfst�rke;
	}

	public ArrayList<Ik�uflich> getRucksack() {
		return rucksack;
	}
	
	@Override
	public String toString() {
		String s = "[Rucksack]\n";
		System.out.println(s);
		for(Ik�uflich k : rucksack) {
			System.out.println(k.getClass().getSimpleName());
		}
		System.out.println("\n");
		return s;
	}

	public void setRucksack(ArrayList<Ik�uflich> rucksack) {
		this.rucksack = rucksack;
	}

	public int getGold() {
		return gold;
	}

	public int getKampfst�rke() {
		return kampfst�rke;
	}

	public void setKampfst�rke(int kampfst�rke) {
		this.kampfst�rke = kampfst�rke;
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
