package pitanja;

public class PitanjeSaPonudjenimOdgovorima extends Pitanje {

	String[] ponudjeniOdgovori;
	
	public PitanjeSaPonudjenimOdgovorima(String t, int p, double tez, String[] niz) {
		super(t, p, tez);
		ponudjeniOdgovori=niz;
	}
	
	//све понуђене одговоре у засебним редовима нумерисане почевши од 1.
	@Override
	public String toString() {
		System.out.println(super.toString());
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<ponudjeniOdgovori.length; i++) {
			sb.append(i+1).append(". ").append(ponudjeniOdgovori[i]).append("\n");
		}
		return sb.toString();
	}
	
}
