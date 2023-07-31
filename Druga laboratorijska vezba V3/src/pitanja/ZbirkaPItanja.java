package pitanja;

import java.util.LinkedList;
import java.util.List;

import pitanja.greske.GNemaPitanja;

public class ZbirkaPItanja {
	
	List<Pitanje> list=new LinkedList<>();
	
	public class PitanjaIterator implements IteratorPitanja{

		protected int pozicija =0;
		
		@Override
		public boolean postoji() {
			return pozicija<list.size();
		}

		@Override
		public Pitanje dohvati() throws GNemaPitanja {
			if (!postoji()) throw new GNemaPitanja();
			return dohvatiel(pozicija);
		}

		@Override
		public void sledece() throws GNemaPitanja {
			if (!postoji()) throw new GNemaPitanja();
			pozicija++;
		}
		
	}
	
	public void dodaj(Pitanje p) {
		list.add(p);
	}
	
	public Pitanje dohvatiel(int poz) throws GNemaPitanja{
		if (poz>=list.size()) throw new GNemaPitanja();
		return list.get(poz);
	}
	
	public int brojPitanja() {
		return list.size();
	}
	
	public IteratorPitanja iterator() {
		return new PitanjaIterator();
	}
	
	
	//sadrzi sva pitanja odvojena jednim praznim redom
	@Override
	public String toString(){
		StringBuilder sb=new StringBuilder();
		IteratorPitanja iter=iterator();
		while(iter.postoji()) {
			try {
				sb.append(iter.dohvati()).append("\n");
				//System.out.println(iter.dohvati());
				iter.sledece();
			} catch (GNemaPitanja e) {
				System.out.println(e.getMessage());
			}
		}
		return sb.toString();
	}
}
