package objetosDos.ej2PiedraPapelTijera;

public class Piedra extends Jugada {
	
	public Piedra() {
		super();
		pos = 0;
		values[0] = 0; 
		values[1] = -1; 
		values[2] = 1;
		//values[3] = 1; // vs lagarto
		//values[4] = -1; // vs spock
		
	}

}
