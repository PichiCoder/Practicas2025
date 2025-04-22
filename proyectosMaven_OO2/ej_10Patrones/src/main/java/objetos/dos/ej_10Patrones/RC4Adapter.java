package objetos.dos.ej_10Patrones;

public class RC4Adapter extends MecanismoDeCifrado {


	//faltaria el el constructor
	// No darle mucha bola a "de donde sale la key". Se puede hacer un getKey() ponele y fue.
	// Igualmente la clase que viene puedo preguntarle devuelta por las dudas.
	@Override
	public String encriptar(String msj) {
		RC4 rc4 = new RC4();
		
		String key = "De donde sale esta key?";
		
		return rc4.encriptar(msj, key);
	}

	@Override
	public String desencriptar(String msj) {
		// TODO Auto-generated method stub
		return null;
	}
}
