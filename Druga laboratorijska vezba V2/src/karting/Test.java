package karting;

import karting.greske.GNeodgovarajuciObjekat;

public class Test {

	public static void main(String[] args) {
		try {
			Vozilo v1 = new Vozilo(30.0, 3.0, 0.75, "Crash Bandicoot");
			Vozilo v2 = new Vozilo(40.0, 4.0, 0.5, "Coco Bandicoot");
			v2.setMaksBrzina(40.0);
			v2.setUbrzanje(4.0);
			v2.setUpravljivost(0.5);
			v2.setTrenBrzina(0.0);
 			System.out.println(v1.toString());
			System.out.println(v2.getVozac() + " [" +
			v2.getMaksBrzina() + ", " +
			v2.getUbrzanje() + ", " +
			v2.getUpravljivost() + "]");
			
			System.out.println("Crash - predjeni put za 1s: " + v1.pomeriVozilo(1) + "s");
			System.out.println("Crash - trenutna brzina: " + v1.getTrenBrzina() + "m/s");
			System.out.println("Coco - vreme za 200m: " + v2.izracunajVreme(200) + "m");
			System.out.println("Coco - trenutna brzina: " + v2.getTrenBrzina() + "m/s");
			
			Vozilo v3 = new Vozilo(45, 2.5, 0.25, "Tiny Tiger");
			Specificnost s1 = new Krivina(40.0);
			try {
				s1.ispoljiEfekat(v3);
				System.out.println("Tiny - maksimalna brzina: " + v3.getMaksBrzina() + "m/s");
				s1.ponistiEfekat(v3);
				System.out.println("Tiny - maksimalna brzina: " + v3.getMaksBrzina() + "m/s");
			} catch (GNeodgovarajuciObjekat e) {
				System.err.println(e);
			}
			
			
			 Deonica d = new Deonica(100.0); 
			 d.dodajSpecificnost(s1);
			 d.dodajSpecificnost(((Krivina)s1).clone());
			 d.dodajSpecificnost(((Krivina)s1).clone());
			 
			 d.izbaciSpecificnost(1);
			 
			 System.out.println("Specificnost na prvoj poziciji: " + d.dohvSpecificnost(0)); 
			 System.out.println("Broj specificnosti: " + d.brojspecificnosti()); 
			 System.out.println(d);	
			 
			 Deonica d2=((Deonica)d).clone();
			 System.out.println("Klonirana deonica je: " + d2);
			 

		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
