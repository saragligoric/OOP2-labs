package karting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Deonica implements Cloneable{
	private double duzina;
	private List<Specificnost> list=new LinkedList<>();
	
	public Deonica(double d) {
		duzina=d;
	}

	public double getDuzina() {
		return duzina;
	}
	
	public void dodajSpecificnost(Specificnost s) {
		list.add(s);
	}
	
	public void izbaciSpecificnost(int id) {
		Iterator<Specificnost> iter=list.iterator();
		Specificnost s=null;
		while(iter.hasNext()) {
			s= iter.next();
			if (s.getId()==id) {
				list.remove(s);	
				break;			//radi tek kad dodam break;
			}
		}
		
		//radi
		/*Iterator<Specificnost> iter=list.iterator();
		Specificnost ss=null;
		while(iter.hasNext()) {
			Specificnost s=iter.next();
			if (s.getId()==id) {
				ss=s;
			}
		}
		if(ss==null) return;
		list.remove(ss);*/
		
		//radi
		/*Specificnost ss=null;
		for (Specificnost s: list) {
			if (s.getId()==id) {
				ss=s;
			}
		}
		if(ss==null) return;
		list.remove(ss);*/
	}
	
	public int brojspecificnosti() {
		return list.size();
	}
	
	public Specificnost dohvSpecificnost(int poz) {
		return list.get(poz);
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		sb.append("deonica(").append(duzina).append("m)");
		Iterator<Specificnost> iter=list.iterator();
		while(iter.hasNext()) {
			sb.append(iter.next());
		}
		return sb.toString();
	}
	
	//deonica moze da se klonira
	@Override
	public Deonica clone() throws CloneNotSupportedException {
		return (Deonica)super.clone();
	}
}
