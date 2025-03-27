package objetosDos.ej2PiedraPapelTijera;

public class Papel extends Jugada {
	
	public Papel() {
		super();
		pos = 1;
		values[0] = 1; 
		values[1] = 0; 
		values[2] = -1;
		//values[3] = -1; // vs lagarto
		//values[4] = 1; // vs spock
		
	}
}
