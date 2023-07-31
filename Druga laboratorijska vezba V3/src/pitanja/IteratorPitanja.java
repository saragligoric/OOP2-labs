package pitanja;

import pitanja.greske.GNemaPitanja;

public interface IteratorPitanja {
	boolean postoji();
	Object dohvati() throws GNemaPitanja;
	void sledece() throws GNemaPitanja;
}
