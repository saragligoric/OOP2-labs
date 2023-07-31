package karting;

import karting.greske.UpravVanOpsega;

public class Vozilo {
	private double maksBrzina, ubrzanje, upravljivost, 		trenBrzina;
	private String vozac;
	
	private double staraMaksBrzina;//
	
	Vozilo(double maks, double ubrz, double uprav, String s) throws UpravVanOpsega{
		if (uprav<0 || uprav>1) throw new UpravVanOpsega();
		maksBrzina=maks;
		ubrzanje=ubrz;
		upravljivost=uprav;
		vozac=s;
	}


	public double getStaraMaksBrzina() {
		return staraMaksBrzina;
	}

	public void setStaraMaksBrzina(double staraMaksBrzina) {
		this.staraMaksBrzina = staraMaksBrzina;
	}

	public double getMaksBrzina() {
		return maksBrzina;
	}

	public double getUbrzanje() {
		return ubrzanje;
	}

	public double getUpravljivost() {
		return upravljivost;
	}

	public double getTrenBrzina() {
		return trenBrzina;
	}

	public String getVozac() {
		return vozac;
	}

	public void setMaksBrzina(double maksBrzina) {
		this.maksBrzina = maksBrzina;
		if (trenBrzina>maksBrzina) {
			trenBrzina=maksBrzina;
		}
	}

	public void setUbrzanje(double ubrzanje) {
		this.ubrzanje = ubrzanje;
	}

	public void setUpravljivost(double upravljivost) {
		this.upravljivost = upravljivost;
	}

	public void setTrenBrzina(double trenBrzina) {
		this.trenBrzina = trenBrzina;
	}

	public void setVozac(String vozac) {
		this.vozac = vozac;
	}

	
	
	public double pomeriVozilo(double protekloVreme) {
		double pocetnaBrzina=trenBrzina;
		trenBrzina=pocetnaBrzina+ubrzanje*protekloVreme;
		if (trenBrzina>maksBrzina) {
			trenBrzina=maksBrzina;
		}
		return pocetnaBrzina*protekloVreme+(ubrzanje*Math.pow(protekloVreme, 2))/2;
	}
	
	public double izracunajVreme(int predjeniPut) {
		return ((Math.sqrt(Math.pow(trenBrzina, 2)+2*ubrzanje*predjeniPut))-trenBrzina)/ubrzanje;
	}

	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append(vozac).append(" [").append(maksBrzina).append(", ").append(ubrzanje).append(", ").append(upravljivost).append("]");
		return sb.toString();
		//ili kokatenacija stringova
		//return vozac+"["+maksBrzina itd..
	}
}
