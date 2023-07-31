package karting;

import karting.greske.GNeodgovarajuciObjekat;

public abstract class Specificnost {
	protected int id=prethid++;
	protected static int prethid=0;

	public int getId() {
		return id;
	}

	public abstract void ispoljiEfekat(Object o) throws GNeodgovarajuciObjekat;
	public abstract void ponistiEfekat(Object o) throws GNeodgovarajuciObjekat;
}
