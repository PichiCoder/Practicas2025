package objetosDos.ej2PiedraPapelTijera;

public abstract class Jugada {
	
	protected abstract boolean leGanaA(Jugada otra);
	
	protected boolean esLaMismaJugada (Jugada otraJugada) {
		return this.getClass() == otraJugada.getClass();
	}
	
	public String jugarContra(Jugada otra) {
		
		if (this.esLaMismaJugada(otra)) return "Empate";
		
		if (this.leGanaA(otra)) return "Gana";
		
		return "Pierde";
	}
	
}
