import java.util.ArrayList;
import java.util.Random;

import gegenst�nde.Ik�uflich;
import laden.Buchhandlung;
import laden.Juwelier;
import laden.Schmiede;
import spieler.Spieler;

public class Main {

	public static Ik�uflich lowestPrice(Schmiede s, Buchhandlung b, Juwelier j, Spieler sp) {
		ArrayList<Ik�uflich> items = new ArrayList<>();
		Ik�uflich lowest = null;
		for(Ik�uflich k : s.getInventar()) {
			items.add(k);
		}
		for(Ik�uflich k : b.getInventar()) {
			items.add(k);
		}
		for(Ik�uflich k : j.getInventar()) {
			items.add(k);
		}
		for(Ik�uflich k : items) {
			if(!s.getInventar().isEmpty()) {
				lowest = s.getInventar().get(0);
			}
			if(!b.getInventar().isEmpty()) {
				lowest = b.getInventar().get(0);
			}
			if(!j.getInventar().isEmpty()) {
				lowest = j.getInventar().get(0);
			}
			if(k.getPreis()<lowest.getPreis()) {
				lowest = k;
			}
		}
		return lowest;
	}
	
	public static void use(Spieler s) {
		for(Ik�uflich k : s.getRucksack()) {
			if(k.getClass().getSimpleName().equals("Goldring")) {
				System.out.println("Monster gez�hmt.");
			}
			if(k.getClass().getSimpleName().equals("Silberring")) {
				s.setKampfst�rke(s.getKampfst�rke()+1);
				System.out.println("Kampfst�rke erh�ht");
			}
			if(k.getClass().getSimpleName().equals("AugenVonHypnos")) {
				System.out.println("Monster wurden gel�hmt.");
			}
			if(k.getClass().getSimpleName().equals("FluchDerSchreibfeder")) {
				System.out.println("Alle Schwerter wurden zerst�rt.");
			}
			if(k.getClass().getSimpleName().equals("Bogen")) {
				System.out.println("Bogen wurde benutzt.");
			}
			if(k.getClass().getSimpleName().equals("Schwert")) {
				System.out.println("Schwert wurde benutzt.");
			}
		}
	}

	public static void main(String[] args) {
		Spieler s = new Spieler("spieler1", 1000, 100);
		Juwelier juwelier = new Juwelier();
		Schmiede schmiede = new Schmiede();
		Buchhandlung buchhandlung = new Buchhandlung();
		buchhandlung.toString();
		juwelier.toString();
		schmiede.toString();
//		ArrayList<Ik�uflich> schmiedeInv = new ArrayList<Ik�uflich>();
//		ArrayList<Ik�uflich> buchInv = new ArrayList<Ik�uflich>();
//		ArrayList<Ik�uflich> JuweInv = new ArrayList<Ik�uflich>();
		while(s.getGold()>10) {
//			schmiedeInv = schmiede.getInventar();
//			buchInv = schmiede.getInventar();
//			JuweInv = schmiede.getInventar();
//			System.out.println(s.getGold());
//			System.out.println(lowestPrice(schmiede, buchhandlung, juwelier, s).getPreis());
			Random rand = new Random();
			for(int j = 0; j<3; j++) {
				if(j == 0) {
					int rand1 = rand.nextInt(2);
					if(rand1 == 0) {
						schmiede.buy(s, "Bogen");
					}
					if(rand1 == 1) {
						schmiede.buy(s, "Schwert");
					}
				}
				if(j == 1) {
					int rand1 = rand.nextInt(2);
					if(rand1 == 0) {
						juwelier.buy(s, "Silberring");
					}
					if(rand1 == 1) {
						juwelier.buy(s, "Goldring");
					}
				}
				if(j == 2) {
					int rand1 = rand.nextInt(2);
					if(rand1 == 0) {
						buchhandlung.buy(s, "AugenVonHypnos");
					}
					if(rand1 == 1) {
						buchhandlung.buy(s, "FluchDerSchreibfeder");
					}
				}
				if((juwelier.getInventar().isEmpty() && schmiede.getInventar().isEmpty() && buchhandlung.getInventar().isEmpty()) || s.getGold() <= lowestPrice(schmiede, buchhandlung, juwelier, s).getPreis()) {
//				if((juwelier.getInventar().isEmpty() && schmiede.getInventar().isEmpty() && buchhandlung.getInventar().isEmpty()) || s.getGold() < 300) {
					System.out.println("\n\nSHOPS UPDATED\n");
					juwelier.toString();
					buchhandlung.toString();
					schmiede.toString();
					s.toString();
					System.out.println("Gold �brig: " + s.getGold());
					use(s);
					return;
				}
			}
		}
		System.out.println("\n\nSHOPS UPDATED\n");
		juwelier.toString();
		buchhandlung.toString();
		schmiede.toString();
		s.toString();
		System.out.println("Gold �brig: " + s.getGold());
		use(s);
	}
}
