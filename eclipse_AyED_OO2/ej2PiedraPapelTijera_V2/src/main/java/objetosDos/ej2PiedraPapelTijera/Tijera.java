package objetosDos.ej2PiedraPapelTijera;

public class Tijera extends Jugada {
	
	protected boolean leGanaA(Jugada otra) {
		return otra instanceof Papel ||
				otra instanceof Lagarto;
	}
}
