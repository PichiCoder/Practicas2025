package objetos.dos.ej_10Patrones;

public class Mensajero {
	
	private MecanismoDeCifrado mecanismo;
	
	
	// Duda, la llave se crea aca ?
	public void enviar (String msj) {
		mecanismo.encriptar(msj);
		//...
	}
	
	public void recibir (String msj) {
		mecanismo.encriptar(msj);
		//...
	}

	public void setMecanismo(MecanismoDeCifrado mecanismo) {
		this.mecanismo = mecanismo;
	}
	
	
}
