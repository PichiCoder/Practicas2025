package tp2;

public class ej7ParcialArboles {
	private BinaryTree<Integer> arbol;
	
	public ej7ParcialArboles(BinaryTree<Integer> arbol) {
		super();
		this.arbol = arbol;
	}

	private int contarUnicosHijos(BinaryTree<Integer> ab) {
		int total = 0;
		
		//falta comprobar si no es empty
		
		//Condiciones que controlan cuando contar
		if (ab.hasLeftChild() && !ab.hasRightChild()) total++;
		if (!ab.hasLeftChild() && ab.hasRightChild()) total++;
		
		if (ab.hasLeftChild()) {
			return total += this.contarUnicosHijos(ab.getLeftChild());
		}
		if (ab.hasRightChild()) {
			return total += this.contarUnicosHijos(ab.getRightChild());
		}
		
		return total;
		
	}
	// No hay que olvidarse de propagar el resultado hacia arriba y controlar los nodos vacios
	private BinaryTree<Integer> encontrarN (BinaryTree<Integer> ab, int n) {
		
		BinaryTree<Integer> res = null;
		
		if (ab.getData() != n) {
			if (ab.hasLeftChild()) {
				res = this.encontrarN(ab.getLeftChild(), n);
				return res;
			}
			if (ab.hasRightChild()) {
				res = this.encontrarN(ab.getRightChild(), n);
				return res;
			}
		}
		else {
			
			return ab;

		}
		return res;
	}
	
	public boolean isLeftTree (int num) {
		if (!this.arbol.isEmpty()) {
			
		}
		int izq = -1, der = -1;
		
		//return this.encontrarN(this.arbol, num);
		BinaryTree<Integer> subArbol = this.encontrarN(this.arbol, num);
		
		if (subArbol != null) {
			if (subArbol.hasLeftChild()) 
				izq = contarUnicosHijos(subArbol.getLeftChild());
			
			if (subArbol.hasRightChild()) 
				der = contarUnicosHijos(subArbol.getRightChild());
		}
		
		return izq > der;
	}
	
	/*
	 * Recorrido en profundidad. 
	 * Mientras no llegamos al "nodo == num", seguimos recorriendo.
	 * Si llegamos a "nodo == num" --> mandamos subArb izquierdo y derecho a:
	 * - contar raices de que cumplan con la condicion (que tengan un solo un hijo).
	 */
	
	public static void main(String[] args) {
		BinaryTree<Integer> arb = arbolesEjemplo.arbol_Integers_B();
		
		ej7ParcialArboles ab = new ej7ParcialArboles(arb);
		
		System.out.println(ab.isLeftTree(25)); // deberia retornar true
		System.out.println(ab.isLeftTree(0)); // false
		System.out.println(ab.isLeftTree(10)); // false
		System.out.println(ab.isLeftTree(32)); // false
	}
}
