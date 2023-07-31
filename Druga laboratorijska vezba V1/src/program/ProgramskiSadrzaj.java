package program;

import program.greske.GVreme;

public abstract class ProgramskiSadrzaj {
	private String naziv;
	protected Vreme trajanje;
	protected Vreme pocetak;	//da li bi bila greska da ja uvedem vreme kraja kao posebnu promenljivu
	
	public ProgramskiSadrzaj(String n, Vreme t) throws GVreme{
		naziv=n;
		trajanje=t;
		pocetak=new Vreme();
	}
	
	public String getNaziv() {
		return naziv;
	}

	public Vreme getTrajanje() {
		return trajanje;
	}

	public Vreme getPocetak() {
		return pocetak;
	}

	public void setPocetak(Vreme pocetak) {
		this.pocetak = pocetak;
	}

	public Vreme preklapanje(ProgramskiSadrzaj p) throws GVreme {
		Vreme zavrsetak=Vreme.saberi(trajanje, pocetak);	
		if (zavrsetak.sati<p.pocetak.sati) return null;
		if (zavrsetak.sati==p.pocetak.sati && zavrsetak.getMinuti()<=p.pocetak.getMinuti()) return null;
		return p.pocetak;
	}
	
	public void pomeri(Vreme v) throws GVreme {	
		pocetak=Vreme.saberi(pocetak, v);
	}
	
	public abstract char getVrsta();
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		try {
			sb.append(getVrsta()).append(", ").append(getNaziv()).append(" | ").append(getPocetak()).append(" - ").append(Vreme.saberi(trajanje, pocetak));
		} catch (GVreme e) {
			System.out.println(e.getMessage());
		}
		return sb.toString();
	}
}
