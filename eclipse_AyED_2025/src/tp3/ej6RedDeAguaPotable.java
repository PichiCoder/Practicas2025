package tp3;

public class ej6RedDeAguaPotable {

	GeneralTree<Character> cañerias;
	
	public ej6RedDeAguaPotable(GeneralTree<Character> cañerias) {
		super();
		this.cañerias = cañerias;
	}

	private double recorrido(double caudal, GeneralTree<Character> ab) {
		double minimo = 999999, valor = -1;
		
		if (ab.isLeaf()) return caudal;
		
		for (GeneralTree<Character> child : ab.getChildren()) {
			valor = this.recorrido((caudal / ab.getChildren().size()), child);
			if (valor < minimo) minimo = valor;
		}
		
		return minimo;
	}
	
	public double minimoCaudal(double caudal) {
		
		return recorrido(caudal, this.cañerias);
		
		
	}
	
	public static void main (String [] args) {
		GeneralTree<Character> ab = aGeneralesEjemplo.aGeneralCaracteres();
		ab.preOrder();
		
		ej6RedDeAguaPotable red = new ej6RedDeAguaPotable(ab);
		
		System.out.println(red.minimoCaudal(1000));
		
	}
}
