package karting;

import karting.greske.GNeodgovarajuciObjekat;

public class Krivina extends Specificnost implements Cloneable {
	private double maksBrzinaVozila;
	
	Krivina(double m){
		super();
		maksBrzinaVozila=m;
	}

	public double getMaksBrzinaVozila() {
		return maksBrzinaVozila;
	}

	@Override
	public void ispoljiEfekat(Object o) throws GNeodgovarajuciObjekat {
		if (!(o instanceof Vozilo)) throw new GNeodgovarajuciObjekat();
		Vozilo v=(Vozilo)o;
		v.setStaraMaksBrzina(v.getMaksBrzina());
		double novaMaksBrzina=maksBrzinaVozila*v.getUpravljivost();
		if (novaMaksBrzina>v.getMaksBrzina()) {
			novaMaksBrzina=(v.getMaksBrzina());
		}
		v.setMaksBrzina(novaMaksBrzina);
	}

	@Override
	public void ponistiEfekat(Object o) throws GNeodgovarajuciObjekat {
		if (!(o instanceof Vozilo)) throw new GNeodgovarajuciObjekat();
		Vozilo v=(Vozilo)o;
		v.setMaksBrzina(v.getStaraMaksBrzina());
	}
	
	@Override
	public String toString() {
			StringBuilder sb= new StringBuilder();
			sb.append("K").append(maksBrzinaVozila).append("ID:").append(this.getId());
			return sb.toString();
	}
	
	@Override				
	public Krivina clone() throws CloneNotSupportedException {
			Krivina k=(Krivina) super.clone();
			k.id=Specificnost.prethid++;
			return k;
	}
}
