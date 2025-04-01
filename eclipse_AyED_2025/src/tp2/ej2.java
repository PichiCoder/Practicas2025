package tp2;

public class ej2 {

	public static void main(String[] args) {
		// COMMENT PRUEBAAAAAAA
		BinaryTree<Integer> ab = arbolesEjemplo.arbolIntegersTeoria();
		
		//System.out.println(ab.contarHojas());
		
		ab.printInorden();
		BinaryTree<Integer> abEspejo = ab.espejo();
		
		System.out.println("===");
		abEspejo.printInorden();
	}

}
