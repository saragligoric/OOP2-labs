package main;

import pitanja.IteratorPitanja;
import pitanja.Pitanje;
import pitanja.PitanjeSaPonudjenimOdgovorima;
import pitanja.ZbirkaPItanja;
import pitanja.greske.GNemaPitanja;

public class Main {

	public static void main(String[] args) {
			Pitanje p1 = new Pitanje("Kada se koristi kljucna rec final?", 5, 5.5);
			Pitanje p2 = new Pitanje("Da li se volatile promenljive kesiraju?",	10, 7.0);
			Pitanje p3 = new PitanjeSaPonudjenimOdgovorima("Omotacka klasa tipa char je: ", 10, 3.5,new String[] {"Char", "Character", "String"});
			ZbirkaPItanja k = new ZbirkaPItanja();
			try {
//				System.out.println(p1);
//				System.out.println(p2);
				//test kloniranja
				//System.out.println(p1.getcopy());
				//System.out.println(p2.getcopy());
				//ispisivanje pitanja sa ponudjenim odgovorima
				//System.out.println(p3);
				//ovo gore sve radi
				
			k.dodaj(p3);	//omot klasa
			k.dodaj(p1);	//final rec
			k.dodaj(p2);	//volatile prom
			
//			System.out.println(k.dohvati(0));
//			System.out.println(k.dohvati(1));
//			System.out.println(k.dohvati(2));
//			System.out.println(k.dohvati(3));
			

			IteratorPitanja iter = k.iterator();
			while(iter.postoji()) {
				System.out.println(iter.dohvati());
				iter.sledece();
			}
			}
			catch (GNemaPitanja g) {
				System.out.println(g.getMessage());
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("Ispis preko toString");
			System.out.println(k);
	}

}
