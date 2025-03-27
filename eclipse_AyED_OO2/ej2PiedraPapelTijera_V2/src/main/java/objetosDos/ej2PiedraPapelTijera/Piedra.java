package objetosDos.ej2PiedraPapelTijera;

public class Piedra extends Jugada {
	
	protected boolean leGanaA(Jugada otra) {
		return otra instanceof Tijera ||
				otra instanceof Lagarto;
	}
}
