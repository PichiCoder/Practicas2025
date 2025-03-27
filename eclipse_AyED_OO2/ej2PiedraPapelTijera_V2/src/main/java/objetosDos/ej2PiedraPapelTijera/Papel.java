package objetosDos.ej2PiedraPapelTijera;

public class Papel extends Jugada{
	
	protected boolean leGanaA(Jugada otra) {
		return otra instanceof Piedra ||
				otra instanceof Spock;
	}
}
