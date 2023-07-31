package program;

import program.greske.GVreme;

public class Test {

	public static void main(String[] args) {
		try {
			Vreme v1=new Vreme(10,15);
			Vreme v2=new Vreme(5,15);
			Vreme v3=new Vreme(14, 15);
			Vreme v4=new Vreme(1,30);
			PonavljajuciProgramskiSadrzaj p1= new PonavljajuciProgramskiSadrzaj("serije", v2, v4);
			PonavljajuciProgramskiSadrzaj p2= new PonavljajuciProgramskiSadrzaj("filmovi", v2, v4);
			p1.setPocetak(v1);	
			p2.setPocetak(v3);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p1.preklapanje(p2));
		} catch(GVreme e) {
			System.out.println(e.getMessage());
		}
	}

}
