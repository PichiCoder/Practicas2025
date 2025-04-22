package objetos.dos.ej_10Patrones;

public class RC4Adapter extends MecanismoDeCifrado {

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
