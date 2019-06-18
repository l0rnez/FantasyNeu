import java.util.ArrayList;
import java.util.Random;

import gegenstände.Ikäuflich;
import laden.Buchhandlung;
import laden.Juwelier;
import laden.Schmiede;
import spieler.Spieler;

public class Main {

	public static void main(String[] args) {
		Spieler s = new Spieler("spieler1", 500, 100);
		Juwelier juwelier = new Juwelier();
		Schmiede schmiede = new Schmiede();
		Buchhandlung buchhandlung = new Buchhandlung();
		buchhandlung.toString();
		juwelier.toString();
		schmiede.toString();
//		ArrayList<Ikäuflich> schmiedeInv = new ArrayList<Ikäuflich>();
//		ArrayList<Ikäuflich> buchInv = new ArrayList<Ikäuflich>();
//		ArrayList<Ikäuflich> JuweInv = new ArrayList<Ikäuflich>();
		while(s.getGold()>10) {
//			schmiedeInv = schmiede.getInventar();
//			buchInv = schmiede.getInventar();
//			JuweInv = schmiede.getInventar();
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
				if(juwelier.getInventar().isEmpty() && schmiede.getInventar().isEmpty() && buchhandlung.getInventar().isEmpty() || s.getGold() <100) {
					juwelier.toString();
					buchhandlung.toString();
					schmiede.toString();
					s.toString();
					System.out.println(s.getGold());
					return;
				}
			}
		}
		juwelier.toString();
		buchhandlung.toString();
		schmiede.toString();
		s.toString();
		System.out.println(s.getGold());
	}
}
