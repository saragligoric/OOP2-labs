package program;

import program.greske.GVreme;

public class Vreme {
	int sati;
	int minuti;
	
	public Vreme() throws GVreme {
		this(0,0);
	}
	
	public Vreme(int s, int m) throws GVreme {
		if ((s<0 || s>23) || (m<0 || m>59) || m%15!=0) throw new GVreme();
		sati=s;
		minuti=m;
	}
	
	public int getMinuti() {
		return minuti;
	}

	@Override		
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("(").append(sati).append(":").append(minuti).append(")");
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Vreme))
			return false;
		Vreme other = (Vreme) obj;
		if (minuti != other.minuti)
			return false;
		if (sati != other.sati)
			return false;
		return true;
	}
	
	public static Vreme saberi(Vreme v1, Vreme v2) throws GVreme {	//mozda treba da premasi sabiranje ako predje ponoc
		return new Vreme(v1.sati+v2.sati, v1.minuti+v2.minuti);
	}
}
