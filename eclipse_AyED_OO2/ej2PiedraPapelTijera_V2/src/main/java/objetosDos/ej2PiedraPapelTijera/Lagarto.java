package objetosDos.ej2PiedraPapelTijera;

public class Lagarto extends Jugada {
	
	protected boolean leGanaA(Jugada otra) {
		return otra instanceof Papel ||
				otra instanceof Spock;
	}

}
