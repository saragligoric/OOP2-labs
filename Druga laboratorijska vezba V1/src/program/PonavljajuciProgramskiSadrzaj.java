package program;

import program.greske.GVreme;

public class PonavljajuciProgramskiSadrzaj extends ProgramskiSadrzaj {	//Последње понављање садржаја је оно чије време краја не прелази поноћ

	private Vreme period;
	
	public PonavljajuciProgramskiSadrzaj(String n, Vreme t, Vreme p) throws GVreme {
		super(n,t);
		period=p;
	}
	
	public Vreme getPeriod() {
		return period;
	}

	@Override
	public char getVrsta() {
		return 'P';
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		try {
			sb.append(getVrsta()).append(", ").append(getNaziv()).append(" | ").append(getPocetak()).append(" - ").append(Vreme.saberi(trajanje, pocetak)).append(" T").append(period);
		} catch (GVreme e) {
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}

}
