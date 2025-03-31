package tp2;

public class ej2 {

	public static void main(String[] args) {
		
		BinaryTree<Integer> ab = arbolesEjemplo.arbolIntegersTeoria();
		
		ab.printInorden();
		System.out.println("========");
		ab.printPreorden();
		System.out.println("========");
		ab.printPostorden();
		System.out.println("========");
		ab.printPorNiveles();
		
	}

}
