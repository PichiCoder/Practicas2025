package objetosDos.ej2PiedraPapelTijera;

public abstract class Jugada {
	protected int values []; //peso contra cada jugada, en orden --> Vs Piedra, Vs Papel, Vs Tijera, ...
	protected int pos; // posicion

	public Jugada() {
		
		this.values = new int [5];
	}
	
	protected String competeVersus (Jugada j) {
		
		return result(values[j.pos]);
	}
	
	protected String result(int r) {
		
		switch (r) {
			case 0 : 
				return "Empate";
			case 1 : 
				return "Ganado";
			case -1 : 
				return "Perdido";
		}
		
		return "Error";
		
		
	}
	
}
