package objetosDos.ej2PiedraPapelTijera;

public class Spock extends Jugada {
	
	protected boolean leGanaA(Jugada otra) {
		return otra instanceof Tijera ||
				otra instanceof Piedra;
	}

}
