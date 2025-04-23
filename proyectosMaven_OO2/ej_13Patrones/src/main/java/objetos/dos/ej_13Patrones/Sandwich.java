package objetos.dos.ej_13Patrones;

import java.util.List;

public class Sandwich {
	private List<Elemento> elementos;

	public Sandwich() {
		super();
	}
	
	public void addElemento(Elemento e) {
		elementos.add(e);
	}
}
