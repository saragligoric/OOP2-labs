package pitanja;

public class Pitanje implements Cloneable{
	private String tekst;
	private int brojPoena;
	private double tezina; //opseg od 1 do 10
	
	private int id=prethid++;
	public static int prethid=1;

	public Pitanje(String t, int p, double tez) {
		tekst=t;
		brojPoena=p;
		//ovde treba da baci gresku ako je van opsega, mrzi me sad
		tezina=tez;
	}
	
	public String getTekst() {
		return tekst;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public double getTezina() {
		return tezina;
	}
	
	public Pitanje getcopy() throws CloneNotSupportedException {
		return clone();		
	}
	
	@Override
	public Pitanje clone() throws CloneNotSupportedException {
		return (Pitanje)super.clone();
		//ako ne zadrzava isti identifikator, vezbe radi
//		Pitanje r= (Pitanje) super.clone();
//		r.id=Pitanje.prethid++;
//		return r;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Pitanje:").append(id).append(":").append(tekst);
		return sb.toString();
	}
}
