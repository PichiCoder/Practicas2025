package objetos.dos.ej_13Patrones;

public class DirectorDeSandwichs {

	public DirectorDeSandwichs() {
		super();
	}
	
	public Sandwich construirSandwich (ConstructorDeSandwich constructor) {
		Sandwich s = new Sandwich();
		
		constructor.construirPan(s);
		constructor.construirPrincipal(s);
		constructor.construirAderezo(s);
		constructor.construirAdicional(s);
		
		return s;
	}
	
}
