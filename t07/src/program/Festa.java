package program;

import java.util.TreeSet;

public class Festa<Convidado> {
private TreeSet convidados = new TreeSet();

public void novoConvidado(Convidado c) {
		convidados.add(c);
		
	}
	public Festa(Convidado c) {	
	convidados.add(c);
	}
}
